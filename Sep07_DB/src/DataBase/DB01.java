package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String mysqlURL = "jdbc:mysql://192.168.0.7:3306/inc";
		String id = "wisejia";
		String pw = "Sign01027992216";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(mysqlURL, id, pw);
			stmt = conn.createStatement();
			System.out.println("접속성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
