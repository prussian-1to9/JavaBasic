package day16;

import java.io.FileInputStream;
import java.util.*;
public class Properties01 {

	public Properties01() {
		Properties prop=new Properties();
		// 야를 외부 파일과 연결할 것이여.
		
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("src/day16/data_kor.txt");
			// 절대 경로로 사용해도 Ok.
			
			// 이제 이 내용을 Properties가 읽도록 한다!
			prop.load(fin);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(Exception e){}
		}
		
		// 위 작업이 완료가 되면 HashMap에 데이터가 저장된것처럼 사용.
		String name=(String)prop.get("name");
		// 출력
		System.out.println("저장된 이름 : "+name);
	}

	public static void main(String[] args) {
		new Properties01();
	}
}
