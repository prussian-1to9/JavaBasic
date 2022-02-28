package day05;

/*
	나이를 입력받아
		유년기
		10대
		20대
		30대
		40대
		장년층
	으로 구분해서 출력하세요.
 */
import java.util.Scanner;
public class EsleIfErrorEx {
	public static void main(String[] args) {
		// 조건이 여러가지인 경우는 ~else if 구문으로 처리하면 편하다.
		
		// 스캐너 준비
		Scanner sc=new Scanner(System.in);
		
		// 메세지 출력
		System.out.println("나이 입력 : ");
		
		// 변수에 입력
		int age=sc.nextInt();
		
		// 판별 후 결과 기억
		String strAge="나이";	//결과 변수 만들기
		
		// 결과 출력
		if (age>=50) {	
			strAge="장년층";
		}else if (age<50) {	//여기에 해당하면 무조건 40대가 나옴.
							// 이 후 else if 구문을 처리하지X
			strAge="40대";
		}else if(age<40) {
			strAge="30대";
		}else if(age<30) {
			strAge="20대";
		}else if(age<20) {
			strAge="10대";
		}else {
			strAge="유년기";
		}
		System.out.println("입력된 나이는 "+age+"이고, "+strAge+"입니다.");
	}
}
