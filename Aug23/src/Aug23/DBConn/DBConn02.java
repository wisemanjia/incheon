package Aug23.DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn02 {
	public static void main(String[] args) {
		String mysqlURL = "jdbc:mysql://wisejia.iptime.org:3306/itest";
		String id = "itest01";
		String pw = "iitest01";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 불가");
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(mysqlURL, id, pw);
			if (conn != null) {
				System.out.println("접속 성공");
			}
			Statement st = null;
			ResultSet rs = null;
			st = conn.createStatement();
			rs = st.executeQuery("select * from itestdb");
			System.out.println("select * from itestdb");
			if (st.execute("select * from itestdb")) {
				rs = st.getResultSet();
			}
			while (rs.next()) {
				String str = rs.getNString(2);
				System.out.println("이름은 : " + str);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
