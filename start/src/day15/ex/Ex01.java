package day15.ex;
/*
	문제 1. ID를 입력받아
		입력받은 ID가 유효한지 아닌지 판별해주는 프로그램을 작성하시오.
		
		ID 조건
			첫글자는 영문 대문자
			그 뒤엔 영문/숫자를 사용할 수 있다.
			글자 수는 전체 5글자 이상이여야 한다.
 */
import java.util.regex.*;
import java.util.Scanner;
public class Ex01 {

	public Ex01() {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
