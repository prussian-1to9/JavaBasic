package day16;
/*
	프로그램에 관련된 정보를 자동으로 뽑아 구경해보자~
 */
import java.util.*;
public class Properties03 {

	public Properties03() {
		Properties prop=System.getProperties();
//		System.getProperties() : 프로그램에 관련된 정보를 Map으로 변환
		
		// 키값 꺼내오기
		Enumeration en=prop.keys();
		while(en.hasMoreElements()) {
			String key=(String)en.nextElement();
			
			System.out.println(key+" : "+(String)prop.get(key));
		}
	}

	public static void main(String[] args) {
		new Properties03();
	}
}
