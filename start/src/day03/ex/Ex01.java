package day03.ex;

/*
 	문제 1.
 		두 개의 숫자를 입력받은 후(가로, 세로)
 		그 숫자를 이용해 사각형의 넓이와 삼각형의 넓이를 구해서
 		결과를 출력하세요.
 		
 		출력형식)
 			가로 : (값)
 			세로 : (값)
 			사각형 넓이 : (값)
 			삼각형 넓이 : (값)
 			
 		c.f. 자바에서 *의 의미
 			연산자로써의 곱하기인, 모든 것을 의미.
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
			// 입력 도구 준비
		Scanner sc=new Scanner(System.in);
		
			// 입력 메세지 출력
		System.out.print("가로 : ");
		String aewidth=sc.nextLine();
		
		// 정수 형태의 문자열->정수로 바꾸는 방법
		int width=Integer.parseInt(aewidth);
		
		/* 입력 자체를 정수로 받는 방법
		int a=sc.nextInt();
		*/
		// 출력
		System.out.println("가로 : "+width);
		
		// 세로도 해보자!
		System.out.print("세로 : ");
		int hight=sc.nextInt();
		System.out.println("세로 : "+hight);
		
		// 계산도 해보자!
		int square=width*hight;
		double triangle=(width*hight)*0.5;
		System.out.println("사각형 넓이 : "+square);
		System.out.println("삼각형 넓이 : "+triangle);
	}
}
