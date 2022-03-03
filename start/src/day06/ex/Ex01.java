package day06.ex;

/*
	문제 1. 3~100 사이의 정수를 랜덤하게 생성해,
	이 정수가 소수인지 판단하는 프로그램을 작성하세요.
	
	extra) 3~100 사이의 정수 중, 소수를 모두 출력하시오.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 3~100 사이의 랜덤 정수 생성
		int num=(int)(Math.random()*(3-100)+100);
		// 출력
		System.out.println("3~100 사이 랜덤 생성된 정수 : "+num);
		
		// 약수가 몇개인지 세는 변수 생성
		int count=0;
		
		// 소수인지 판단
		for(int i=0; i<num; i++) {
			if (num/(i+1)>=1&num%(i+1)==0) {
				count++;
			}
		}
		// 소수의 조건
		boolean sosu=count==2;
		
		if (sosu) {
			System.out.println(num+"은 소수입니다.");
		}else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
//--------------------------------------------------------------
		// extra 문제 : 3~100 사이의 정수 중, 소수 출력하기
		// (모르겠음!!)
		System.out.print("3~100 사이의 소수는 ");
		for (int i=3; i<301; i++) {
			// sosu 재정의를 위한 반복문
			for (int n=0; n<i; n++) {
				count=0;
				if (i/(n+1)>=1&i%n==0) {
					count++;
				}
				if (sosu) {
					System.out.print(num+" ");					
				}
			}
			System.out.print("입니다.");
		}
	}
}
