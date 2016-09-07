package Net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

//아까처럼 네이버 읽어오기 02
public class Net_naver02 {

	public static void main(String[] args) {
		URL url = null;
		FileOutputStream fos = null;
		try {
			url = new URL("http://www.naver.com");
			InputStream in = url.openStream();
			// URL내용을 openS~으로 읽어오는 것
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
