package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//����ڰ� ID�� PW�� �Է��ϸ� �� ���� ����
//�����ͺ��̽� ���̺� �ִ��� Ȯ���ϰ�
//������ :  ������� [����� �̸�]
//������ :  ��ϵ� ����ڰ� �ƴմϴ�. ��� ����ϱ�
public class DB04 {

	public static void main(String[] args) {
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է����ּ��� : ");
		String id = sc.next();
		System.out.println("PW�� �Է����ּ���.");
		String pw = sc.next();
		
		//�����ͺ��̽� �����ϱ�
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		//�������� ������
		String sql = "SELECT iname FROM inclist WHERE iid='" + 
					id + "' AND ipw='" + pw + "';";
		//SELECT iname FROM inclist
		//WHERE iid='wisejia' AND pw='pwwisejia'
		//������
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			
			while (result.next()) {
				name = result.getString(1);
			}
			//�ϳ��� ���� ���� ��쿡�� �׿� �°� �ٲ��ּŵ� �˴ϴ�.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�� ���ϴ� if��
		//��¹�
		if(name != null){			
			System.out.println("������� " + name);
		}else{
			System.out.println("ID : " + id 
					+ "���� ��ϵ� ����ڰ� �ƴմϴ�." );			
		}
	}

}
