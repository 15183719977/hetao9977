package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo1 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("ok");
		//���ӵ����ݿ�
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uername = "scott";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url,uername,password);
		System.out.println(conn.getClass());
		//����������
		Statement stm = conn.createStatement();
		String ddl = "create table wei_emp ( id NUMBER(4),name VARCHAR2(20) NOT NULL,"+
                     "gender CHAR(1) DEFAULT 'M', birth DATE, salary NUMBER(6,2), " +
                     "job VARCHAR2(30), deptno NUMBER(2))";
		String d2 = "drop table wei_emp";
		boolean b = stm.execute(ddl);//����true��ʾ�н����
		
		//�ر����ݿ�
		conn.close();
		

	}

} 
