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
		
		//���� ���̺��� ���� �о����
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM inclist");
			//������� rs�� ����Ǿ����� �̰��� �̾Ƴ���
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
						"%s��° ������ : �Է½ð�(%s), "
						+ "���̵� : %s, ��й�ȣ %s, "
						+ "�̸� : %s, ��ȭ��ȣ : %s, "
						+ "�̸��� : %s, ��Ÿ : %s \n"
						, ino, idate, iid, ipw, iname, itel, iemail, ietc
						);//�� ������� �� �ּ���. %s�ڸ��� ��Ʈ����
							//    \n�� �ٹٲ��Դϴ�. 
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
