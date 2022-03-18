package day15;

import java.util.*;
public class LinkedList01 {

	public LinkedList01() {
		LinkedList member=new LinkedList();
		
		member.add("카리나");
		member.add("지젤");
		member.add("윈터");
		member.add("닝닝");
		
		// 요롷고롬 한가지 형태의 데이터만 입력하면
		// 꺼내 쓸 때 한가지 방식으로 처리할 수 있어서 편하다!
		
		int len=member.size();	// capacity 아님!!
		for (int i=0; i<len; i++) {
			String name=(String)member.get(i);
			
			System.out.println(name);
		}
		System.out.println(member);
	}

	public static void main(String[] args) {
		new LinkedList01();
	}
}
