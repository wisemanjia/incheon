package Aug30.FileIO;

//파일입출력\\\쓰고 읽기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileInput20160831 {
	public static void main(String args[]) {

		String name = null ;
		String pw = null;
		String email = null;
		ArrayList<String> als = new ArrayList<String>();
		
		try {
			BufferedReader in = 
					new BufferedReader(
							new FileReader("c:\\temp\\temp.txt"));
			String line = "";
			while ((line = in.readLine()) != null) {
				als.add(line);
				//System.out.println(line);
				
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*for (int i = 0; i < als.size(); i++) {
			System.out.println(als.get(i));
		}*/
		//indexOf();
		String temp = als.get(0);
		name = new String(temp);
		
		System.out.println(name);
	}
}
