package day16;

import java.util.*;
import java.io.*;
public class Properties02 {

	public Properties02() {
		Properties prop=new Properties();
		prop.put("name", "황인준");
		prop.put("age", "23");
		prop.put("tel", "010-0323-0825");
		prop.put("addr", "GWANGYA");
		
		FileOutputStream fout=null;
		
		try {
			fout=new FileOutputStream("src/day16/result.txt");
			prop.store(fout, "적당히 메세지~");
			System.out.println("파일 저장 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Properties02();
	}
}
