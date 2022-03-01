package day05.ex;

/*
	문제 12. 5자리 숫자 하나를 입력받아
	이 숫자가 회문수인지 아닌지 판별하는 프로그램을 작성하시오.
	
	+ 회문수란?
		첫번째 자리수와 마지막 자리수
		두번째 자리수와 마지막에서 두번째자리수
		...
		가 동일한 수를 말한다.
 */
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 안내문구 출력
		System.out.println("입력된 정수가 회문수인지 판별합니다.");
		
		// 변수에 입력 및 출력
		System.out.println("5자리 정수를 입력하세요.");
		int num=sc.nextInt();
		System.out.print("입력된 정수 : "+num+"\n"+num+"은 ");
		
		// 각 자리별 변수 생성
		int e=num;
		int a=e/10000;
		e%=10000;
		int b=e/1000;
		e%=1000;
		int c=e/100;
		e%=100;
		int d=e/10;
		e%=10;
		
		// 판별 조건문 생성
		if ((a==e)&&(b==d)) {
			System.out.print("회문수 입니다.");
		}else {
			System.out.print("회문수가 아닙니다.");
		}
	}
}
