package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//�����ͺ��̽����� ���̺� �о����
public class DB02 {
	public static void main(String[] args) {
		Connection conn = null;
		DBConnection db = new DBConnection();
		conn = db.getConnection();
		//sql��ɾ�: ���̺� ����� �����ݴϴ�.
		String sql = "show tables;";
		//SELECT * FROM inclist;
		//��ɹ��� *(����) FROM ���̺��;
		//INCLIST���̺��� ������ ���� �����ּ���.
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			
			
			while (result.next()) {
				String str1 = result.getString("Tables_in_inc");
				System.out.println("���̺� : " + str1);
			}
			//�߿��մϴ� ���� �ݱ⹮��
			//���߿� �� �� ���� �ݾ���� �մϴ�.
			result.close();
			pstmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
}
}
