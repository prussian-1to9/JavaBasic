package day13;
/*
	강제 예외 던지기~ 해보겠삼.
 */
import java.util.Scanner;
public class Test13 {
	/*
		사용자가 나이를 입력하면.
		입력된 나이를 출력하는 프로그램을 작성하시오.
		
		단, 나이를 음수로 입력하면 예외로 처리되게 하시오.
	 */
	public Test13() {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);

		try {
			setAge(sc);
		}catch(Exception e) {
			System.out.println("나이가 음수가 될 수 없습니다.");
		}
	}
	
	public void setAge(Scanner sc) throws Exception{
		int age=0;
		
		while(true) {
			// 입력 메세지 출력
			System.out.println("나이를 입력하시오.");
			
			try {
				age=sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		if (age<0) {
			// 강제 예외 발생시키기
				throw new Exception();
		}else {
			System.out.println("입력된 나이 : "+age+"살");
		}
	}
	
	public static void main(String[] args) {
		new Test13();
	}
}
