package DataBase;
//다른 java파일에서 불러다가 쓸 수 있도록 데이터 쓰기

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//드라이버로딩
			String url = "jdbc:mysql://192.168.0.7:3306/inc";
						//jdbc : 자바가 외부 jar를 통해 로딩할 수 있는 드라이버
						//mysql://경로명:포트번호/데이터베이스명
			conn = DriverManager.getConnection(
					url, "wisejia", "Sign01027992216");
						//드라이버메니저를 통해 드라이버 올리기
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;//올린 드라이버를 리턴해서 외부에서 별다른
		//작업없이 사용할 수 있게 해줌
	}

}
