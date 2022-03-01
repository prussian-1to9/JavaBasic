package day04.ex;

/*
	문제4.
		1,000~3,000명 사이의 숫자를 랜덤하게 발생시켜
		(입력시켜도 괜찮다.)
		이 숫자를 년도로 하는 해는
		윤년인지, 평년인지를 판별해 출력하는 프로그램을 작성하시오.
		
		+ 윤년은 4의 배수 - 100의 배수 + 400의 배수
 */
import java.util.Scanner; 
public class Ex04 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 숫자 입력
		System.out.println("타임워프 하고 싶은 해를 입력해주세요.");
		int year=sc.nextInt();
		
		// 출력
		System.out.println("당신이 타임워프한 해는 "+year+"년 입니다.");
		
		// 계산하는 변수 만들기
		String judge=(year%4==0)?
				((year%100==0)?((year%400==0)?"윤년":"평년"): "윤년"):"평년";
				
		//출력
		System.out.println("당신이 도착한 곳은 "+judge+"이네요!");
	}
}
