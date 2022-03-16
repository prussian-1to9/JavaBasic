package day13;

public class Test06 {

	public Test06() {
		int no1=25;
		int no2=0;
		int result=0;
		
		try {
			result=no1/no2;
		}catch(ArithmeticException e) {
			System.out.println("[에러] 숫자를 0으로 나눌 수 없습니다.");
		}catch(RuntimeException e) {
			System.out.println("Runtime Exception 소속 예외.");
		}catch(Exception e) {
			System.out.println("Runtime Exception 비소속 모든 예외.");
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
