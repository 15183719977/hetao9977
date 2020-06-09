package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class dml_demo {

	/**
	 * ִ��DML��� DDL
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		//�������ݿ�
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String use = "scott";
		String pass = "123456";
		Connection conn =  DriverManager.getConnection(url,use,pass);
		Statement st = conn.createStatement();
		String dml = "insert into wei_emp (id,name,gender,job) " +
				     "values(1,'wei','M','coder') ";
		//int n = st.executeUpdate(dml);
		//System.out.println(n);   //���µ�����
		String ss = "select id, name, job from wei_emp";
		ResultSet rs = st.executeQuery(ss);
		while(rs.next()){   //�ƶ���������α굽��һ��
			int id = rs.getInt("id");
			String s = rs.getString("name");
			String job = rs.getString("job");
			System.out.println(id+"  "+s+"  "+job);
		}
		rs.close();
		st.close();
		conn.close();
	}

}
