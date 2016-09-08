package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//사용자가 ID와 PW를 입력하면 그 값이 실제
//데이터베이스 테이블에 있는지 확인하고
//있으면 :  어서오세요 [사용자 이름]
//없으면 :  등록된 사용자가 아닙니다. 라고 출력하기
public class DB04 {

	public static void main(String[] args) {
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력해주세요 : ");
		String id = sc.next();
		System.out.println("PW를 입력해주세요.");
		String pw = sc.next();
		
		//데이터베이스 접속하기
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		//쿼리문장 날리기
		String sql = "SELECT iname FROM inclist WHERE iid='" + 
					id + "' AND ipw='" + pw + "';";
		//SELECT iname FROM inclist
		//WHERE iid='wisejia' AND pw='pwwisejia'
		//날리기
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			
			while (result.next()) {
				name = result.getString(1);
			}
			//하나의 값이 오는 경우에는 그에 맞게 바꿔주셔도 됩니다.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//값 비교하는 if문
		//출력문
		if(name != null){			
			System.out.println("어서오세요 " + name);
		}else{
			System.out.println("ID : " + id 
					+ "님은 등록된 사용자가 아닙니다." );			
		}
	}

}
