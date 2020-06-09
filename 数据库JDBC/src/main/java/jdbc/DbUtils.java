package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

//��װ�������ݿ����ӵĹ��̣�������
public class DbUtils {
	static String driver = "orcale.jdbc.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String username = "scott";
	static String pass = "123456";
	
	public static Connection getConnection(){ 
		try{	
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,pass);
			return conn;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	//���ݿ�رմ���
	public static void close(Connection conn){
		if(conn!=null){
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn){  //�ع�����
		if(conn!=null){
			try {
				conn.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
