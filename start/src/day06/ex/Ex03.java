package day06.ex;

/*
	문제 3. 다음을 반복문으로 출력하시오.
			(전부 중첩으로 처리하래요 ^^....)
			
	1.		1 1 1 1 1
			2 2 2 2 2
			3 3 3 3 3
			4 4 4 4 4
			5 5 5 5 5
			
	2.		1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			
	3.		1 2 3 4 5
			2 3 4 5 6
			3 4 5 6 7
			4 5 6 7 8
			5 6 7 8 9
			
	4.		 1	2  3  4  5
			 6  7  8  9 10
			11 12 13 14 15
			16 17 18 19 20
			21 22 23 24 25
			
	5.		1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5
			
	6.		 1
			 2  3
			 4  5  6
			 7  8  9 10
			11 12 13 14 15
 */
public class Ex03 {
	public static void main(String[] args) {
		// 1.
		for (int i=0; i<5;) {
			for (int jin=0; i<5; jin++) {
				if (jin>=5) {
					System.out.println();
					jin=-1;
					i++;
					}else {
						System.out.print((i+1)+" ");
					}
			}
			
		}		
		System.out.println("\n");
		
		// 2.
		for (int i=0; i<5;) {
			for (int jin=0; i<5; jin++) {
				if (jin>=5) {
					System.out.println();
					jin=-1;
					i++;
					}else {
						System.out.print((jin+1)+" ");
					}
			}
		}
		System.out.println("\n");
		
		// 3. (얘가 문제임^^)
		for (int i=0; i<5; ) {
			for (int j=0; i<5; j++) {
				if (j>=5) {
					j=-1;
					i++;
					System.out.println();
				}else {
					System.out.print(i+j+1+" ");
				}
			}
		}

		System.out.println("\n");

		// 4.
		int jjin=0;
		for (int i=0; i<5;) {
			for (jjin=0; i<5; jjin++) {
				if ((jjin/5>=1)&(jjin%5==0)) {
					System.out.println();
					++i;
				}
				
				if (jjin<9){
					System.out.print(" "+(jjin+1)+" ");
				} else if (jjin<25) {
					System.out.print((jjin+1)+" ");
				}
			}
		}
		System.out.println("\n");
		
		// 5. --> 배열 쓰면 안되나?
		loop5:
		for (int i=0; i<5; i++) {
			for (int j=0; i<5; j++) {
				if (j>i) {
					System.out.println();
					j=0;
					continue loop5;
				}
				System.out.print(j+1+" ");
			}
		}
		System.out.println("\n");
		
		// 6.
		int num=1;
		loop6:
		for(int i=0; i<5; i++) {
			for(int j=0; i<5; j++) {
				if(j>i) {
					System.out.println();
					j=0;
					continue loop6;
				}
				if (num<10) {
					System.out.print(" "+num+" ");
				}else {
					System.out.print(num+" ");
				}
				num++;
			}
		}
	}
}
