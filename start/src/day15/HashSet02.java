package day15;

import java.util.*;
public class HashSet02 {
/*
	HashSet에 랜덤하게 숫자 6개를 채워보쉐이
	
	Set 계열 특징
		1. 입력순서 보장 X
		2. 중복데이터 입력 X
 */
	public HashSet02() {
		HashSet set=new HashSet();
		
		int count=0;
		
		while(true) {
			// 랜덤 정수 만들기
			int no=(int)(Math.random()*10+1);
			
			set.add(no);
			// 6개만 채울거니까..
			int len=set.size();
			if(len==6) {
				break;
			}
			count++;
		}
		// 출력
		System.out.println("반복횟수 : "+count);
		// 내용 출력
		Iterator itor=set.iterator();
		while (itor.hasNext()) {
			System.out.print((int)itor.next()+" ");
		}
	}

	public static void main(String[] args) {
		new HashSet02();
	}
}
