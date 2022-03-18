package day15;

import java.util.*;
public class Vector01 {

	public Vector01() {
		Vector vec=new Vector(10, 5);	// 첫 공간 10, 늘어날 공간 5
		int cap=vec.capacity();
		// capacity=공간(헤드룸 포함), size=실제 데이터가 있는 공간
		System.out.println("처음 공간 : "+cap);
		
		// 데이터 채우기~
		for(int i=0; i<16; i++) {
			vec.add(i+1);
		}
		
		// 뭐가 달라졌나 확인해볼꽈여?
		cap=vec.capacity();
		System.out.println("확보된 공간 : "+cap);
		
		System.out.println("-------------------------------------");
//------------------------------------------------------------------
		Vector v2=new Vector();
		int cap2=v2.capacity();
		System.out.println("v2.capacity : "+cap2);
		
		for (int i=0; i<21; i++) {
			v2.add(i+1);
		}
		
		cap2=v2.capacity();
		System.out.println("나중의 v2.capacity : "+cap2);	// 2^2가 됐쥬.
	}// 똥싸고싶다~ 헤헤

	public static void main(String[] args) {
		new Vector01();
	}
}
