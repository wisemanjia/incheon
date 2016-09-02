package Aug23.DBConn;

import java.sql.*;
public class DBconnection {
	public Connection getConnetion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://wisejia.iptime.org:3306/itest";
			con = DriverManager.getConnection(url, "itest01", "iitest01");
		} catch (Exception e) {
		}
		return con;
	}
}
