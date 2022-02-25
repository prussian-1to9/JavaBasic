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
public class ReEx01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로 : ");
		
		int width=sc.nextInt();
		System.out.println("가로 : "+width);
		
		System.out.print("세로 : ");
		
		int hight=sc.nextInt();
		System.out.println("세로 : "+hight);
		
		int quad=width*hight;
		double tri=quad*0.5;
		System.out.println("사각형 넓이 : "+quad);
		System.out.println("삼각형 넓이 : "+tri);
	}
}
