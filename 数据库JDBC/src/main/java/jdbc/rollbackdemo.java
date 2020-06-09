package jdbc;
import java.sql.*;
public class rollbackdemo {

	/**
	 * ����ع���ִ�мƻ�
	 * @param args
	 */
	public static void main(String[] args) {
		pay(2,1,1000);
		System.out.println("done");

	}
	
	public static void pay(int from,int to,double money){
		String sql1 = "update r_acount set balance=balance+? where id=?";
		String sql2 = "select balance from r_acount where id=?";
 		Connection conn = null;
		try {
			conn = bingfaDbUtils.getConnection();
			conn.setAutoCommit(false);  //��Ҫ������
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.setDouble(1, -money);
			ps.setInt(2, from);
			int n = ps.executeUpdate();
			if(n!=1){
				throw new Exception("�۴��ˣ�");
			}
			ps.setDouble(1, money);
			ps.setInt(2, to);
			n = ps.executeUpdate();
			if(n!=1){
				throw new Exception("�Ӵ��ˣ�");
			}
			ps.close();
			//���
			ps = conn.prepareStatement(sql2);
			ps.setInt(1, from);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				double bal = rs.getDouble(1);
				if(bal<0){
					throw new Exception("͸֧");
				}
			}
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			bingfaDbUtils.rollback(conn);
		}finally{
			bingfaDbUtils.close(conn);
		}
	}

}
