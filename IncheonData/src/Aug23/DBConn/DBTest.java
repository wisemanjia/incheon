package Aug23.DBConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class DBTest {

	public static void main(String[] args) {
		Connection con = null;
		DBconnection db = new DBconnection(); 
		con = db.getConnetion();
		
		String sql = "show tables";
		try {
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			
			if(result.next()) {
				String str = result.getNString(1);
				System.out.println("테이블 은 : " + str);
	        }
			result.close();
	        pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
