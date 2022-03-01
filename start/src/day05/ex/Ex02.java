package day05.ex;

/*
	문제2. 'A' 부터 문자를 10개를 만들어서 출력하세요. 
*/
public class Ex02 {
	public static void main(String[] args) {
		// char 타입 변수 생성, 초기화
		char ch='A';
		
		// 반복문 생성
		for (int i=0; i<10; i++) {
			ch+=i;
		// 출력
			System.out.println(ch);
		// 초기화
			ch='A';
		}
	}
}
