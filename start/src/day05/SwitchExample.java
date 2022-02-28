package day05;
/*
정수를 입력받아
그 숫자가 짝수인지 홀수인지를 판별하고 출력하시오.
*/
import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 입력 문구 출력
		System.out.println("나이를 입력하시오.");
		
		// 변수 생성, 입력값 기억
		int age=sc.nextInt();
		
		// 판별, 변수 생성
		String strAge="장년층";
		
		int gen=age/10*10;
		
		switch(gen) {
		case 0:
			strAge="유년기";
			break;	// break를 넣어주지 않으면 조건이 부합해도
					// 밑 명령을 실행하게 된다.
		case 10:
			strAge="10대";
			break;
		case 20:
			strAge="20대";
			break;
		case 30:
			strAge="30대";
			break;
		case 40:
			strAge="40대";
			break;
		default:
			strAge="장년층";
		}
		// 결과 출력
		System.out.println("입력한 나이 "+age+"는 "+strAge+"입니다.");
	}
}
