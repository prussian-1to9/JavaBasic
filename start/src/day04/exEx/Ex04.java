package day04.exEx;
/*
문제4.
	1,000~3,000 사이의 숫자를 랜덤하게 발생시켜
	(입력시켜도 괜찮다.)
	이 숫자를 년도로 하는 해는
	윤년인지, 평년인지를 판별해 출력하는 프로그램을 작성하시오.
	
	+ 윤년은 4의 배수 - 100의 배수 + 400의 배수
*/
public class Ex04 {
	public static void main(String[] args) {
		// 1000~3000 사이의 숫자 랜덤 발생
		int year=(int)(Math.random()*(3000+1-1000)+1000);
		
		// 랜덤 발생한 년도 출력
		System.out.println("랜덤 생성된 해는 "+year+"년 입니다.");
		
		// String 타입 변수 생성
		String judge="평년";
		
		// 판별
		if (year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					judge="윤년";	// 100의 배수이고 400의 배수일 때
				}else {		// 100의 배수이지만 400의 배수가 아닐 때
				}
			}else {		
				judge="윤년";	// 4의 배수이고 100의 배수가 아닐 때
			}
		}else {	// 4의 배수가 아닐 때
		}
		// 결과값 출력
		System.out.println(year+"년은 "+judge+"입니다.");
	}
}
