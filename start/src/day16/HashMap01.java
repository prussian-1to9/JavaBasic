package day16;

import java.util.*;
public class HashMap01 {
// 전화번호부를 HashMap으로 만들어봐용용
	public HashMap01() {
		HashMap map=new HashMap();
		
		// 데이터 추가
		map.put("이동혁", "010-0606-0825");
		map.put("황인준", "010-0323-0825");
		map.put("나재민", "010-0813-0825");
		map.put("이제노", "010-0423-0825");
		
		// 출력
		System.out.println("런쥔 : "+map.get("황인준"));
		
		// 모든 값을 출력해보자!
		System.out.println("\n[모든 데이터를 출력해보자!]");
		Set keys=map.keySet();
		for (Object k : keys) {
			System.out.println(k+" : "+map.get(k));
		}
	}

	public static void main(String[] args) {
		new HashMap01();
	}
}
