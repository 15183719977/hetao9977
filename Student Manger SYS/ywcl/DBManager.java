package ywcl;

import java.sql.*;

public class DBManager {
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�������سɹ���");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","123");
			System.out.println("���ݿ����ӳɹ���");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		getConn();

	}

}
