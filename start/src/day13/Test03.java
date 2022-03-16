package day13;
/*
	Test02의 문제를 예외처리 문법으로 처리해봅시다.
 */
public class Test03 {
	public Test03() {
		int no1=0;
		int no2=25;
		int result=0;
		
		System.out.println("0. try-catch 실행 전");
		try {
			System.out.println("1. 명령실행 전");
			result=no2/no1;
			System.out.println("2. 명령실행 후");
		}catch(Exception e) {
			System.out.println("3. 예외 발생");
			result=no2;
		}
		System.out.println(no2+" / "+no1+" = "+result);
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
