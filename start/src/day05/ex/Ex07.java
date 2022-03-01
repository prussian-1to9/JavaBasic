package day05.ex;

/*
	문제 7. 5자리의 숫자를 입력한 후,
	각 자리의 수를 합을 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 5자리 정수 입력받기
		System.out.println("5자리 정수를 입력하세요.");
		int num=sc.nextInt();
		
		// 입력값 출력
		System.out.println("입력된 5자리 정수 : "+num);
		
		// 합을 구할 변수와 자리수를 받을 변수 생성
		int sum=0;
		int letter=0;
		
		// 반복문 생성
		for (int i=0; i<5; i++) {
			if (i==0) {
				letter=num/10000;
				num%=10000;
			}else if(i==1) {
				letter=num/1000;
				num%=1000;
			}else if (i==2) {
				letter=num/100;
				num%=100;
			}else if (i==3) {
				letter=num/10;
				num%=10;
			}else {
				letter=num;
			}
			sum+=letter;
		}
		
		// 결과값 출력
		
		System.out.println("각 자리 수의 합 : "+sum);
	}
}
