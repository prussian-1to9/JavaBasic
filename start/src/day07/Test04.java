package day07;

import java.util.Arrays;

/*
	5과목의 점수를 기억할 배열을 만들고
	괌고 점수를 입력해
	총점과 평균을 구하고 출력하시오.
	배열에 담긴 점수도 같이 출력하시오.
 */
public class Test04 {
	public static void main(String[] args) {
		// 배열변수 생성
		int[] score=new int[5];
		
		// 총점 변수 생성
		int sum=0;

		// 과목 점수 생성
		for (int i=0; i<score.length; i++) {
			// 랜덤 점수 입력
			score[i]=(int)(Math.random()*100+1);
			
			// 총점에 넣어주기
			sum+=score[i];
		}

		// 평균 변수 생성
		double ave=sum/(score.length);
		
		// 총점, 평균 출력
		System.out.println("당신의 총점은 "+sum+"점이고, 평균 "+ave+"점입니다.\n"
				+ "당신의 각 과목 점수는 ");
		
		// 점수 출력
		for (int i=0; i<score.length; i++) {
			System.out.print(score[i]+"점 ");
		}
		System.out.println("입니다.");
		
		// Array.toString 사용시
		System.out.print("각 과목 점수 : "+(Arrays.toString(score)));
	}
}
