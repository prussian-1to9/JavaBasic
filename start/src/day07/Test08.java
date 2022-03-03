package day07;

import java.util.Arrays;

/*
	정수 10개를 랜덤하게 만들어서 기억하는 배열을 만들고
	기억된 정수를 내림차순 정렬해서 다시 기억시키기고
	배열의 데이터를 출력하시오.
 */
public class Test08 {
	public static void main(String[] args) {
		// 배열 만들기
		int[] num=new int[10];
		
		// 데이터 채우기
		make:
		for (int i=0; i<num.length; i++) {
			int no=(int)(Math.random()*99+1);
			
			// 중복검사
			for (int j=0; j<i; j++) {
				int izen=num[j];
				if (izen==no) {
					i--;
					continue make;
				}
			}
			num[i]=no;
		}
		// 확인 출력
		System.out.println(Arrays.toString(num));
		
		// 내림차순 정렬
		for (int i=0; i<num.length-1; i++) {
			// 데이터 담아줄 변수
			int tmp=0;
			for (int j=i+1; j<num.length; j++) {
				/* 비교할것, 비교 대상
				int sample=num[i];
				int hikkaku=num[j];
				*/
				if (num[j]>num[i]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		
		// 출력
		System.out.println("만들어진 배열의 내림차순 정리");
		for (int no:num) {
			System.out.print(no +" ");
		}
	}
}
