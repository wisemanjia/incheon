package DataBase;
//�ٸ� java���Ͽ��� �ҷ��ٰ� �� �� �ֵ��� ������ ����

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//����̹��ε�
			String url = "jdbc:mysql://192.168.0.7:3306/inc";
						//jdbc : �ڹٰ� �ܺ� jar�� ���� �ε��� �� �ִ� ����̹�
						//mysql://��θ�:��Ʈ��ȣ/�����ͺ��̽���
			conn = DriverManager.getConnection(
					url, "wisejia", "Sign01027992216");
						//����̹��޴����� ���� ����̹� �ø���
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;//�ø� ����̹��� �����ؼ� �ܺο��� ���ٸ�
		//�۾����� ����� �� �ְ� ����
	}

}
