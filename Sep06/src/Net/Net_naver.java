package Net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

//이 클라이언트가 네이버(www.naver.com)에 접속해서 html 긁어오기

public class Net_naver {
	public static void main(String[] args) {
		// 클라이언트 객체 만들기
		HttpURLConnection httpCon = null;
		String urlParameta = "";
		String targetURL = "www.naver.com";
		String cookie = "";
		try {
			URL url = new URL("www.naver.com");
			httpCon = (HttpURLConnection) url.openConnection();
			httpCon.setRequestMethod("POST");
			httpCon.setRequestProperty("Content-Type", "application/x-www.form-urlencoded;charset=utf-8");
			httpCon.setRequestProperty("Cookie", "cookie=" + cookie);

			httpCon.setUseCaches(false);
			httpCon.setDoInput(true);
			httpCon.setDoOutput(false);

			PrintWriter pw = new PrintWriter(
					new OutputStreamWriter(
							httpCon.getOutputStream(), "utf-8"));
			pw.write(urlParameta);
			pw.flush();
			pw.close();

			
			
			InputStream is = httpCon.getInputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is));
			
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
