package day15;

import java.util.*;
public class Random01 {

	public Random01() {
		Random rd=new Random();
		System.out.println(rd.nextInt());
		
		Random rd1=new Random(10);
		/*
			난수표에서 10번위치부터 난수를 뽑아달라는 뜻.
			seed를 알려주면서 가져오기 때문에 항상 순서가 동일함.
		 */
		for (int i=0; i<10; i++) {
			int no=rd1.nextInt(100);	// 0~100 사이의 난수 발생

			// 출력
			System.out.print(no+" ");
		}// seed를 정했기 때문에 일정하게 출력이 된다.
	}

	public static void main(String[] args) {
		new Random01();
	}
}
