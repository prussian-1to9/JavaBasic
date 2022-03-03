package day05.ex;

/*
	문제 13. 두 정수를 입력 후
	두 수의 최대 공약수를 구하는 프로그램을 작성하시오.
	
	extra ) 최소 공배수도 구하시오.
 */
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 안내 문구 출력
		System.out.println("두 정수의 최대 공약수와 최소 공배수를 구합니다.");
		
		// 정수 a 입력받기
		System.out.println("정수 하나를 입력해주세요.");
		int a=sc.nextInt();
		
		// 정수 b 입력받기
		System.out.println("나머지 정수를 입력하세요.");
		int b=sc.nextInt();
		
		// 두 수중; 작은 수, 큰수 찾기
		
		;
		
		// 반복문 1:최대 공약수
		for (int m=(a<b)?a:b; ; m--) {
			if ((a/m>=1)&(b/m>=1)&(a%m==0)&(b%m==0)) {
				System.out.println(a+"와 "+b+"의 최대 공약수 : "+m);
				break;
			}
		}	
		// 반복문 2:최소 공배수
		for (int M=(a>b)?a:b; ; M++) {
			if ((M/a>=1)&(M/b>=1)&(M%a==0)&(M%b==0)) {
				System.out.println(a+"와 "+b+"의 최소 공배수 : "+M);
				break;
			}
		}
	}
}
