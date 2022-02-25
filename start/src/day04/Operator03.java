package day04;

/*
	정수를 입력받아
	짝수인지 홀수인지 판별하시오 (단, 0은 짝수로 간주.
 */

import java.util.Scanner;
public class Operator03 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		// 입력된 메세지 출력&변수 생성
		int n=sc.nextInt();
		System.out.print("입력된 정수는 "+n+"이며, ");
				
		//짝수 홀수 판별&출력
		String result=(n%2==0)?"짝수":"홀수";
		System.out.println(result+"입니다.");
	}
}
