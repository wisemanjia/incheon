package DataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//DB�� ���� �� �Է��ϱ�
//#insert #�Ʊ�͵����մϴ�.
import java.util.Scanner;

public class DB05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ͺ��̽��� �Է��մϴ� \n �̸��� �Է����ּ��� : ");
		String name = sc.next();
		System.out.print("ID�� �Է����ּ��� : ");
		String id = sc.next();
		System.out.println("PW�� �Է����ּ���.");
		String pw = sc.next();
		System.out.println("email�� �Է����ּ���.");
		String email = sc.next();
		System.out.println("��ȭ��ȣ�� �Է����ּ���.");
		String tel = sc.next();
		System.out.println("��Ÿ�� �Է����ּ���.");
		String etc = sc.next();
		sc.close();
		// �����ͺ��̽� �����ϱ�
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		
		//���������� �����帳�ϴ� //�μ�Ʈ ���� , ������ ����
		//INSERT INTO inclist('iname', 'iid','ipw','iemail','itel','ietc')
		//VALUES('��name','��id','��pw','��email','��tel','��etc');
		String sql = "INSERT INTO inclist("
				+ "iname, iid, ipw, iemail, itel, ietc)"
				+ " VALUES("
				+ "'"+name+"','"+id+"','"+pw+"','"+email+"','"+tel+"',"
				+ "'"+etc+"');";
		System.out.println(sql);
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//executeQuery : ���� �ҷ��� �� SELECT, ����
			//exeUpdate : �� �Է��� �� : Insert Into
			stmt.executeUpdate(sql);
			System.out.println("�Է¿Ϸ�");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}






