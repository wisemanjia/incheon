package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//데이터베이스에서 테이블 읽어오기
public class DB02 {
	public static void main(String[] args) {
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		//sql명령어: 테이블 목록을 보여줍니다.
		String sql = "show tables;";
		//SELECT * FROM inclist;
		//명령문장 *(모든것) FROM 테이블명;
		//INCLIST테이블에서 모든것을 꺼내 보여주세요.
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			
			
			while (result.next()) {
				String str1 = result.getString("Tables_in_inc");
				System.out.println("테이블 : " + str1);
			}
			//중요합니다 이제 닫기문장
			//나중에 연 것 부터 닫아줘야 합니다.
			result.close();
			pstmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
}
}
