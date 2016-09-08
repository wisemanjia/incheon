package DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//DB에 직접 값 입력하기
//#insert #아까와동일합니다.
import java.util.Scanner;

public class DB05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터베이스에 입력합니다 \n 이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("ID를 입력해주세요 : ");
		String id = sc.next();
		System.out.println("PW를 입력해주세요.");
		String pw = sc.next();
		System.out.println("email을 입력해주세요.");
		String email = sc.next();
		System.out.println("전화번호를 입력해주세요.");
		String tel = sc.next();
		System.out.println("기타를 입력해주세요.");
		String etc = sc.next();
		sc.close();
		// 데이터베이스 접속하기
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		
		//쿼리문장을 보여드립니다 //인서트 문장 , 순서에 주의
		//INSERT INTO inclist('iname', 'iid','ipw','iemail','itel','ietc')
		//VALUES('변name','변id','변pw','변email','변tel','변etc');
		String sql = "INSERT INTO inclist("
				+ "iname, iid, ipw, iemail, itel, ietc)"
				+ " VALUES("
				+ "'"+name+"','"+id+"','"+pw+"','"+email+"','"+tel+"',"
				+ "'"+etc+"');";
		System.out.println(sql);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//executeQuery : 값을 불러올 때 SELECT, 수정
			//exeUpdate : 값 입력할 때 : Insert Into
			stmt.executeUpdate(sql);
			System.out.println("입력완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}






