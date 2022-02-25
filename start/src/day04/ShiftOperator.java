package day04;

/*
	한 문자를 입력받아, 이 수가 0인지 홀수인지 짝수인지를 판별하세요.
 */
import java.util.*;
public class ShiftOperator {
	public static void main(String[] args) {
		int no=20;
		int result=20>>2; // 2의 2승으로 나누는 결과=
		
		System.out.println("result : "+result);
		
		result=result<<3;
		
		System.out.println("<<1 : "+(-64>>1));
		System.out.println(">>>1 : "+(-64>>>1));
	}
}