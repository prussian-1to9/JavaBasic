package day04.Ex;

/*
1~25의 숫자 3개를 랜덤하게 발생시켜
그 수들 중 가장 큰수만 출력하는 프로그램을 작성하세요.

단, 3항 연산자를 사용해 처리할 것.
*/
public class Ex01 {
	public static void main(String[] args) {
		// 랜덤 숫자 3개 만들기
		int a=(int)(Math.random()*(45-1*1)+1);
		int b=(int)(Math.random()*(45-1*1)+1);
		int c=(int)(Math.random()*(45-1*1)+1);
		
		// 출력
		System.out.println("랜덤 생성된 수 3개 \n\t"+a+" "+b+" "+c);
		
		// 가장 큰 수 구하기
		int biggestHit=((a>b)&&(a>c))?a:(((b>a)&&(b>c))?b:c);
		
		// 출력
		System.out.print("생성된 수들 중 가장 큰 수 : "+biggestHit);
		
		/*
			\" : 문자열 내에 "를 표기한다.
			\n : 한 줄 내림 기호
			\r : 캐리지 리턴
			\t : tab
			\b : back space
		 */
	}
}
