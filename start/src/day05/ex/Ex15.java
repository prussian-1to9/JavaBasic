package day05.ex;

/*
문제 15 ]
	구구단을 다음 형식으로 출력하세요.
	
	2 x 1 = 2		3 x 1 = 3		4 x 1 = 4 		5 x 1 = 5
	2 x 2 = 4		3 x 2 = 6		4 x 2 = 8 		5 x 2 = 10
	...
	2 x 9 = 18		3 x 9 = 27		4 x 9 = 36 		5 x 9 = 45
	
	6 x 1 = 6		7 x 1 = 7		8 x 1 = 8 		9 x 1 = 9
	6 x 2 = 12		7 x 2 = 14		8 x 2 = 16 		9 x 2 = 18
	...
	6 x 9 = 54		7 x 9 = 63		8 x 9 = 72 		9 x 9 = 81
	
	
*/
public class Ex15 {
	public static void main(String[] args) {
		// 대수, 결과값 변수 생성
		int daesu=1;
		int result=0;
		
		for(int even=0; daesu<10; even++) {
			result=(even+2)*daesu;
			System.out.print((even+2)+"X"+daesu+"="+result+"\t");
			if (even>=3) {
				++daesu;
				even=-1;
				System.out.print("\n");
				// 뜸들이기(?)
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
		// 대수 초기화
		daesu=1;
		System.out.println();
		
		for(int even=0; daesu<10; even++) {
			result=(even+2)*daesu;
			System.out.print((even+6)+"X"+daesu+"="+result+"\t");
			if (even>=3) {
				++daesu;
				even=-1;
				System.out.print("\n");
				// 뜸들이기(?)
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
}
