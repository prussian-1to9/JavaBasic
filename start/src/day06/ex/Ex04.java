package day06.ex;

/*
	4. 다음 형태로 출력하세요.
	
	1.	*****
		*****
		*****
		*****
		*****
		
	2.	*****
		****
		***
		**
		*
		
 	3.	    *
 		   **
 		  ***
 		 ****
		*****
		
	4.	  *
		 ***
		*****
 */
public class Ex04 {
	public static void main(String[] args) {
		// 1.
		int j;
		for(int i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.
		for (int i=0; i<5; i++) {
			for (j=5; j>0; j--) {
				if (j>i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 3.
		for (int i=0; i<5; i++) {
			for (j=4; j>-1; j--) {
				if (j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 4.
		for (int i=0; i<3; i++) {
			for (j=-2; j<3; j++) {
				if (j==0) {
					System.out.print("*");
				}else if(((j<0)&(-j<=i))|((j>0)&(j<=i))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
