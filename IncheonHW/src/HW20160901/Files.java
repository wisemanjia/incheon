package HW20160901;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Files {

	public static void main(String[] args){
		String id = null;
		String pw = null;
		String email = null;
		String path = "C:/temp/temp.txt";
		
		ArrayList<String> als = new ArrayList<String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(path));
			String line = "";
			while((line = br.readLine()) != null){
				als.add(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		HashMap<String, String> map = new HashMap<String, String>(); 
		
		for(String str : als){
			String strs[] = str.replaceAll(" ", "").split(":");
			map.put(strs[0], strs[1]);
		}
		
		id = map.get("id");
		pw = map.get("pw");
		email = map.get("email");
		
		System.out.println("id => " + id);
		System.out.println("pw => " + pw);
		System.out.println("email => " + email);
		
	}
}
