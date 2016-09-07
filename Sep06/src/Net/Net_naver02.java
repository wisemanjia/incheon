package Net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

//�Ʊ�ó�� ���̹� �о���� 02
public class Net_naver02 {

	public static void main(String[] args) {
		URL url = null;
		FileOutputStream fos = null;
		try {
			url = new URL("http://www.naver.com");
			InputStream in = url.openStream();
			// URL������ openS~���� �о���� ��
			fos = new FileOutputStream("c:\\temp\\naver.txt");

			byte[] by = new byte[512];
			int readCount = 0;
			System.out.println("Read....");

			while ((readCount = in.read(by)) != -1) {
				fos.write(by, 0, readCount);
			}
			System.out.println("End....");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
