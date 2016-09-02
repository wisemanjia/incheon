package HW20160901;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Files {

	public static void main(String[] args){
		String id = null;
		String name = null;
		String pw = null;
		String email = null;
		String path = "C:/temp/temp.txt";
		
		ArrayList<String> als = new ArrayList<String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(path));
			String line = "";
			while((line = br.readLine()) != null) {
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
		
		System.out.println("추출된 id => " + (id = map.get("id")));
		System.out.println("추출된 name => " + (name = map.get("﻿name")));
		System.out.println("추출된 pw => " + (pw = map.get("pw")));
		System.out.println("추출된 email => " + (email = map.get("email")));

	}
}
