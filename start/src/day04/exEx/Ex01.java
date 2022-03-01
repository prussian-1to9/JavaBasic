package day04.exEx;
/*
1~25의 숫자 3개를 랜덤하게 발생시켜
그 수들 중 가장 큰수만 출력하는 프로그램을 작성하세요.
*/
public class Ex01 {
	public static void main(String[] args) {
		// 랜덤발생 숫자 3개 (1~25)
		int a=(int)(Math.random()*(25-1+1)+1);
		int b=(int)(Math.random()*(25-1+1)+1);
		int c=(int)(Math.random()+(25-1+1)+1);
		
		System.out.println("랜덤 발생한 1~25까지의 숫자 3개는 \n"
				+a+", "+b+", "+c+"입니다.");
		
		// 가장 큰 수 출력
		
		System.out.print("이 중 가장 큰 수는 ");
		if ((a>b)&&(a>c)) {
			System.out.print(a);
		}else if((b>a)&&(b>c)) {
			System.out.print(b);
		}else {
			System.out.print(c);
		}
		System.out.print("입니다.");
	}
}
