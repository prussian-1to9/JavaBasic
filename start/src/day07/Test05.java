package day07;

import java.util.Arrays;

/*
	5과목의 점수를 기억할 배열을 만들고
	과목 점수를 입력해
	'총점을 배열의 마지막에 계산에서 입력하고'
	총점과 평균을 구하고 출력하시오.
	배열에 담긴 점수도 같이 출력하시오.
*/
public class Test05 {
	public static void main(String[] args) {
		// 배열 변수 생성
		int[] score=new int[6];
		// 맨 마지막방은 총점 입력!
		
		// 반복문 생성
		for (int i=0; i<(score.length-1); i++) {
			score[i]=(int)(Math.random()*41+60);
		}
		// 점수 출력
		System.out.println(Arrays.toString(score));
		
		// 총점 입력하기
		for (int i=0; i<(score.length-1); i++) {
			score[score.length-1]+=score[i];
		}
		
		// 평균 구하기~
		double ave=score[score.length-1]/(score.length-1);
		
		// 출력 : 과목 점수
		for (int i=0; i<score.length-1; i++) {
			System.out.print(score[i]+" | ");
		}
		// 총점, 평균 출력
		System.out.println("\n"+"총점 : "+score[score.length-1]);
		System.out.println("평균 : "+ave);
	}
}
