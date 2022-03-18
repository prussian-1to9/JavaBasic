package day15;

import java.util.Vector;
public class Vector02 {
/*
	다양한 형태의 데이터를 Vector에 채워보쉐이
 */
	public Vector02() {
		Vector vec=new Vector();
		
		vec.add("황인준");
		vec.add('M');	// Auto Boxing : char->Character->Object
		vec.add(23);
		vec.add(171);
		vec.add(true);
		
		// Vector의 데이터를 꺼내 출력해보쉐이
		String name=(String)vec.get(0);
		char gen=(Character)vec.get(1);
		int age=(Integer)vec.get(2);
		int height=(Integer)vec.get(3);
		boolean bool=(Boolean)vec.get(4);
		
		// 출력
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gen);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("이동혁 남친인가요? : "+bool+"!\n");
		
		// 향상된 for 명령으로도 가능
		for (Object o : vec) {
			System.out.println(o);
			// 각 타입별로 override된 toString함수가 호출된다!
		}
	}

	public static void main(String[] args) {
		new Vector02();
	}
}
