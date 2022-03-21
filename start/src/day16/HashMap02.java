package day16;

import java.util.*;
public class HashMap02 {
//	학생 4명의 점수를 Map에 담아 관리해봅쉬다.
	public HashMap02() {
		HashMap map=new HashMap();
		ArrayList names=new ArrayList();
		names.add("카리나");
		names.add("지젤");
		names.add("윈터");
		names.add("닝닝");
		
		// 객체 채워주기
		for (int i=0; i<4; i++) {
			Student std=new Student((String)names.get(i),
					(int)(Math.random()*(100-70+1)+70),
					(int)(Math.random()*(100-70+1)+70),
					(int)(Math.random()*(100-70+1)+70),
					(int)(Math.random()*(100-70+1)+70));
			
			map.put(names.get(i), std);
		}
		
		// 출력
		Set keys=map.keySet();
		ArrayList list=new ArrayList(keys);
		
		for(Object key : list) {
			System.out.println(map.get(key));
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new HashMap02();
	}
}
