package day08.ex;
/*
다음 내용은 다중 반복문과 2원배열 연습용 문제입니다.
모두 풀 수 있다면 좋겠지만
풀지 못하는 문제가 있다 해도 상관없으니
미진한 부분 연습용으로 활용하시기 바랍니다.

1. 
	1  1  1  1  1
	2  2  2  2  2
	3  3  3  3  3
	4  4  4  4  4
	5  5  5  5  5
	
2. 
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5

3. 
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1

4.
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
	
5. 
	 1  2  3  4  5
	 6  7  8  9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25
	
6.
	 1  2  3  4  5
	10  9  8  7  6
	11 12 13 14 15
	20 19 18 17 16
	21 22 23 24 25
	
7.
	1  0  0  0  0
	1  2  0  0  0
	1  2  3  0  0
	1  2  3  4  0
	1  2  3  4  5
	
8.
	 1  0  0  0  0
	 2  3  0  0  0
	 4  5  6  0  0
	 7  8  9 10  0
	11 12 13 14 15
	
9.
	 0  0  0  0  1
	 0  0  0  1  2
	 0  0  1  2  3
	 0  1  2  3  4
	 1  2  3  4  5
	     
10.
	 0  0  0  0  1
	 0  0  0  2  3
	 0  0  4  5  6
	 0  7  8  9 10
	11 12 13 14 15
*/
public class PreEx {
	public static void main(String[] args) {
		// 1.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print((5-j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i%2==0) {
					// 짝수줄 : 12345
					System.out.print((1+j)+" ");
				} else {
					// 홀수줄 : 54321
					System.out.print((5-j)+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 5.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (((i*5)+j+1)<10) { // 10이하일 경우 띄어쓰기
					System.out.print(" "+((i*5)+j+1)+" ");					
				} else {
					System.out.print(((i*5)+j+1)+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 6.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i%2==0) {
					// 짝수줄 : 순행
					if (((i*5)+j+1)<10) { // 10이하일 경우 띄어쓰기
						System.out.print(" "+((i*5)+j+1)+" ");					
					} else {
						System.out.print(((i*5)+j+1)+" ");
					}
				} else {
					
					// 홀수줄 : 역행
					if ((((i+1)*5)-j)<10) { // 10보다 작을 경우 띄어쓰기
						System.out.print(" "+(((i+1)*5)-j)+" ");					
					} else {
						System.out.print((((i+1)*5)-j)+" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 7.
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i>=j) {
					System.out.print((j+1)+" ");
				} else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 8. (변수 수정해야됨^^!)
		// 변수 만들기
		int num=0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				
				if (i>=j) {// 0이 아닌 숫자를 출력하는 경우
					num++;
					
					if (num<10) {// 10보다 작을 경우 띄어쓰기
						System.out.print(" "+num+" ");
					} else {
						System.out.print(num+" ");
					}
				} else {
					System.out.print(" "+0+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 9.
		for (int i=0; i<5; i++) {
			// 값 증가시켜 줄 변수 생성
			int e=0;
			
			for (int j=4; j>-1; j--) {
				if (j<=i) {// 0이 아닌 숫자를 출력하는 경우
					e++;
					System.out.print(e+" ");
				} else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 10.
		// num 초기화
		num=0;
		for (int i=0; i<5; i++) {
			for (int j=4; j>-1; j--) {
				if (j<=i) {
					// 0이 아닌 숫자를 출력하는 경우
					num++;
					if (num<10) {// 10보다 작을 경우 띄어쓰기
						System.out.print(" "+num+" ");
					} else {						
						System.out.print(num+" ");
					}
				} else {
					System.out.print(" "+0+" ");
				}
			}
			System.out.println();
		}
	}
}
