package day07;

import java.util.Arrays;

/*
	10개의 정수를 랜덤하게 발생시켜 기억하는 배열을 만들고
	기억된 수 중 가장 큰 수를 알아내는 프로그램을 작성하시오.
 */
public class Test07 {
	public static void main(String[] args) {
		// 배열 만들기
		int[] num=new int[10];
		
		// 10개의 랜덤 정수 만들기
		make:
		for (int i=0; i<num.length; i++) {
			int no=(int)(Math.random()*99+1);
			
			// 중복검사
			for (int j=0; j<i; j++) {
				if(num[j]==no) {
					i--;
					continue make;
				}
			}
			num[i]=no;
		}
		
		// 데이터 확인
		System.out.println(Arrays.toString(num));
		
		int max=num[0];
		
		for (int i=1; i<num.length; i++) {
			int tmp=num[i];
			if (tmp>max) {
				max=tmp;
			}
		}
		
		// 출력
		System.out.println("최대값 : "+max);
	}
}
