package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB03 {

	public static void main(String[] args) {
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		
		//이제 테이블에서 값을 읽어오기
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM inclist");
			//결과값이 rs에 저장되었으니 이것을 뽑아내기
			while (rs.next()) {
				String ino = rs.getString("ino");
				String idate = rs.getString("idate");
				String iname = rs.getString("iname");
				String iid = rs.getString("iid");
				String ipw = rs.getString("ipw");
				String iemail = rs.getString("iemail");
				String itel = rs.getString("itel");
				String ietc = rs.getString("ietc");
				
				System.out.printf(
						"%s번째 데이터 : 입력시간(%s), "
						+ "아이디 : %s, 비밀번호 %s, "
						+ "이름 : %s, 전화번호 : %s, "
						+ "이메일 : %s, 기타 : %s \n"
						, ino, idate, iid, ipw, iname, itel, iemail, ietc
						);//꼭 순서대로 써 주세요. %s자리에 스트링값
							//    \n은 줄바꿈입니다. 
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
