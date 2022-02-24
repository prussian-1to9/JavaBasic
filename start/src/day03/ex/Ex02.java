package day03.ex;

import java.util.Scanner;

/*
	문제2.
		하나의 숫자를 입력받은 후(원의 반지름)
		그 숫자를 이용해 원의 넓이와 둘레를 계산하고 출력하시오.
		
	참고)
		원의 넓이 : 반지름 * 반지름 * 3.14
		원의 둘레 : 지름*3.14
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.print("원의 반지름 : ");
	int r=sc.nextInt();
	System.out.println("입력된 반지름 : "+r);
	System.out.println("원의 넓이 : "+(r*r*3.14));
	System.out.println("원주 : "+(2*r*3.14));
	}
}
