package day13;

public class Test07 {

	public Test07() {
		int[] arr= {25, 30, 38, 75, 47};
		
		int idx=5;
		int no=6;
		int result=0;
		
		try {
			result=arr[idx]/no;
			
		}catch(ArithmeticException e) {
			System.out.println(e);	// 예외의 정보만 출력
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();	// 예외의 위치, 클래스도 추적
			System.out.println("***");
			System.out.println(e);
		}catch(Exception e) {
			System.out.println("나머지 예외 발생");
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
