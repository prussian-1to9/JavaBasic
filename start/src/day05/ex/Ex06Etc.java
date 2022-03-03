package day05.ex;
/*
	문제 6. 컴퓨터가 랜덤하게 정수를 만들고, 그 수를 맞추는 게임을 만드시오.
	
		단, 입력횟수가 5번을 초과하면 컴퓨터의 승리, 프로그램이 종료되게 하시오.
*/
import java.util.Scanner;
public class Ex06Etc {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 랜덤한 정수 만들기 (1~99)
		int com=(int)(Math.random()*(99-1+1)+1);
		System.out.println("컴퓨터가 1~99 사이의 랜덤한 수를 만들었습니다.");
		
		// 사용자의 숫자 변수 만들고 초기화
		int user=0;
		
		// 반복문 생성
		for (int i=0; i<6; i++) {//횟수 제한이 있기 때문에 while은 사용할 수 없다.
			
			if (i<5) {// 입력횟수가 5회 미만인 경우
				// 입력받기
				System.out.println("2자리 정수를 입력해 주세요. (남은 횟수 : "+(5-i)+"회)");
				user=sc.nextInt();
				
				// 판별
				if(user>com) {// DOWN
					System.out.println("입력된 정수 : "+user+" DOWN!");
				} else if(user<com) {// UP
					System.out.println("입력된 정수 : "+user+" UP!");
				}else {// 정답
					System.out.println("축하합니다! "+(i+1)+"회 만에 정답을 맞췄습니다!");
					System.out.println("시스템을 종료합니다.");
					break;
				}
				}else {// 입력횟수가 5회 초과
					System.out.println("5회안에 정답을 맞추지 못해 컴퓨터가 승리하였습니다.\n"
						+"(정답 : "+com+")");
			}
		}
	}
}
