package jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

//�������ӳ�
public class bingfaDbUtils {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static int init;
	private static int maxactive;
	private static BasicDataSource ds;

	static{
		ds = new BasicDataSource();
		Properties cf = new Properties();
		try {
			InputStream in = bingfaDbUtils.class.getClassLoader().getResourceAsStream("db.properties");
			cf.load(in);
			//�����ļ����ж�ȡ����ʼ������
			driver = cf.getProperty("driver");
			url = cf.getProperty("url");
			username = cf.getProperty("username");
			password = cf.getProperty("password");
			init = Integer.parseInt(cf.getProperty("init"));
			maxactive = Integer.parseInt(cf.getProperty("maxac"));
			
			in.close();
			//��ʼ�����ӳ�
			ds.setDriverClassName(driver);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setInitialSize(init);
			ds.setMaxActive(maxactive);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection(){
		try {
			Connection conn = ds.getConnection();
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void close(Connection conn){
		if(conn!=null){
			try {
				//���ù������ӹ黹�����ӳ�
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void rollback(Connection conn){
		if(conn!=null){
			try {
				conn.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
