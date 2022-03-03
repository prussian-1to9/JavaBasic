package day05.ex;

/*
	문제 6. 랜덤하게 컴퓨터가 만들어낸 정수를
	알아맞추는 게임을 만드시오.
	
	EX.
		발생숫자 : 54
		
		사용자 입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지를 출력해 사용자가 숫자를 알아맞추는 게임.
		
		횟수도 같이 출력되게 하시오.
 */
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 안내문구 출력
		System.out.println("컴퓨터와 업다운 게임 시작!\n"
				+"(범위 : 1~99)");
		
		// 컴퓨터의 랜덤 발생 숫자 만들기
		int com=(int)(Math.random()*(99+1-1)+1);
		
		// 정답 변수 생성 및 초기화
		int user=0;
		
		try{Thread.sleep(1000);}catch(Exception e){}
		
		//반복문 만들기
		for (int i=0; user!=com; i++) {
			if(i==0) {
				System.out.println("첫 도전! 맘 편히 아무 숫자나 입력하세요!");
			}else {
				System.out.println((i+1)+"번째 도전! 정답을 입력하세요!");
			}
			// 정답 입력 및 출력
			user=sc.nextInt();		// 입력
			System.out.print("입력한 숫자 : "+user);		// 출력

			try{Thread.sleep(1000);}catch(Exception e){}
			
			// 업다운 판별
			if (user==com) {
				System.out.println("\n축하합니다! "+(i+1)+"번째 시도만에 정답을 맞췄습니다!");
			}else if (user>com) {
				System.out.println(" DOWN!\n");
			}else {
				System.out.println(" UP!\n");
			}
		}
	}
}
