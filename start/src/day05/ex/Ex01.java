package day05.ex;

/*
	1~10까지의 합을 구해
	출력해주는 프로그램을 작성하세요.
	Hint.
		합은 결과값 변수로 만들어서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		int sum=0;
		for (int i=0; i<10; i++) {
			sum+=(i+1);
		}
		System.out.println("10부터 1까지의 합은 "+sum+"입니다.");
		
		// 1~10의 곱
		int gop=1;
		for (int i=0; i<10; i++) {
			gop*=(i+1);
		}
		System.out.println("10부터 1까지의 곱은 "+gop+"입니다.");
	}
}
