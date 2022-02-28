package day05;

import java.util.Scanner;

/*
	정수를 입력받아
	그 숫자가 짝수인지 홀수인지를 판별하고 출력하시오.
 */
public class IfElse {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 입력메세지 출력
		System.out.println("정수를 입력하시오.");
		
		// 입력받아 변수에 기억
		int num=sc.nextInt();
		System.out.println("입력된 정수 : "+num);
		
		// 판별
		String judge="정수"; // 짝수인지 홀수인지 기억할 변수
		if (num==0) { // num이 0인 경우
			judge="0";
		}else if (num%2==0) { // num이 짝수인 경우
			judge="짝수";
		}else {		// num이 홀수인 경우
			judge="홀수";
		}
		
		// 결과 출력
		System.out.println(num+"은 "+judge+"입니다.");
		
	}
}
