package day15;

import java.util.*;
public class HashSet01 {
/*
	에스파 맴버를 HashSet에 저장한 후, 꺼내서 출력해보쉐이.
 */
	public HashSet01() {
		HashSet set=new HashSet();
		
		// 데이터 추가
		set.add("카리나");
		set.add("지젤");
		set.add("윈터");
		set.add("닝닝");
		
		// 꺼낼려면??
		// 입력된 개수 꺼내오기
		int len=set.size();
		System.out.println("채워진 맴버 수 : "+len+"명");
		/*
			Set 계열 Collection은 데이터를 꺼내는 함수! 없다!
			그럼 어케 꺼내냐?
				1. Iterator로 변환 후 꺼내 사용
				2. List계열로 변환 후 꺼내 사용
		 */
		System.out.println("<Iterator 변환을 이용한 방법>");
		// 1. Iterator로 변환해서 사용해보쉐이~
		Iterator itor=set.iterator();
		// 야는 StringTokenizer와 유사하게 buffer memory에 저장되어
		// 하나씩 꺼내야하며, 꺼내고 나면 증발해버림~!
		
		while (itor.hasNext()) {// 꺼낼 데이터가 있을 때만 실행
			// 데이터 꺼내봅쉬다.
			String name=(String)itor.next(); // 데이터 꺼내는 함수!
			System.out.println(name);
		}
		System.out.println();

		System.out.println("<List계열 변환을 이용한 방법>");
		// 2. List계열로 변환해서 사용해보쉐이~
		Vector vec=new Vector(set); // set의 데이터로 Vector 생성
		
		// 데이터 꺼내서, 출력
		for (int i=0; i<vec.size(); i++) {
			String name=(String)vec.get(i);
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new HashSet01();
	}
}
