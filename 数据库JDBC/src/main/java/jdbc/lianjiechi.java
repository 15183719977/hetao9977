package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class lianjiechi {

	/**
	 * ���ӳػ����÷�
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		/*
		 * ��һ��
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String use = "scott";
		String pass = "123456";
		BasicDataSource ds = new BasicDataSource();
		//���ñ������
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(use);
		ds.setPassword(pass);
		//�������ӳع�����Բ���
		ds.setInitialSize(2); //��ʼ��
		ds.setMaxActive(100);
		//ʹ�����ӳ��е����ݿ�����
		Connection conn;
		conn = ds.getConnection();
		String sql = "select 'hello' as a from dual";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			String str = rs.getString("a");
			System.out.println(str);
		}			
		//�黹���ӵ����ݿ����ӳ�
		conn.close();
		*/
		//�ڶ���
		Connection conn= null;
		try {
			conn = bingfaDbUtils.getConnection();
			String ss= "select 'hello' as a from dual";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(ss);
			while(rs.next()){
				String s2 = rs.getString("a");
				System.out.println(s2);
				
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			bingfaDbUtils.close(conn);
		}
		
	}

}
