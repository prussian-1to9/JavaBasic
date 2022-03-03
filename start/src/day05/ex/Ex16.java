package day05.ex;

/*
	문제15.
	구구단을 다음 형식으로 출력하시오
	
	2x1=2	4x1=4	6x1=6	8x1=8
	2x2=4	4x2=8	6x2=12	8x2=16
	...		...		...		...
	2x2=9	4x9=36	6x9=54	8x9=72
	
	3x1=3	5x1=5	7x1=7	9x1=9
	3x2=6	5x2=10	7x2=14	9x2=18
	...		...		...		...
	3x9=27	5x9=45	7x9=63	9x9=81
 */
public class Ex16 {
	public static void main(String[] args) {
		// 배수에 대한 변수 만들기
		int baesu=0;
		
		// 반복문-짝수 구구단 만들기
		for (int even=0; baesu<9; even+=2) {
			// i+2가 8을 넘었을 경우 초기화.
			if (even>6) {
				even=0;
				// 뜸들이기(?)
				++baesu;
				try {Thread.sleep(1000);}catch(Exception e) {}
				System.out.print("\n");
			}
			// 2x10이 출력되지 않기 위해 break
			if (baesu>=9) {break;}
			System.out.print((even+2)+"x"+(baesu+1)+"="+((even+2)*(baesu+1))+"\t");
		}
		
		System.out.println("\n");
		
		// 배수 변수 초기화
		baesu=0;
		
		// 반복문-홀수 구구단 만들기 (복붙. even->odd로 바꿔주고 2->3로 바꿔주기)
		for (int odd=0; baesu<9; odd+=2) {
			// i+2가 8을 넘었을 경우 초기화.
			if (odd>6) {
				odd=0;
				++baesu;
				// 뜸들이기(?)
				try {Thread.sleep(1000);}catch(Exception e) {}
				System.out.print("\n");
			}
			// 3x10이 출력되지 않기 위해 break
			if (baesu>=9) {break;}
			System.out.print(((odd)+3)+"x"+(baesu+1)+"="+((odd+3)*(baesu+1))+"\t");
		}
	}
}
