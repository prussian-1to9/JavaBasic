package day04.Ex;

/*
	문제2.
		문자를 임의로 랜덤하게 입력한 후
		그 문자가 대문자면 소문자로,
		소문자면 대문자로 되고,
		특수문자이면 그대로 출력되는 프로그램을 만드시오.
		(if문은 쓰지 않는다)
		
		+ ascii코드는 특수문자-숫자(0~9)
					-특수문자-영문대문자(A~Z)
					-특수문자-영문 소문자(a~z)
					
		+ 문자열에서 문자를 추출하는 법
			문자열.charAt(위치값)
		맨 먼저 오는 알파벳이 0에 속한다.
			ex. "abcd".charAt(1)
			==>'b'
 */
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		//문자 입력
		System.out.println("문자를 입력하시오.");
		String ch=sc.nextLine();
		
		//char 추출
		char ahh=ch.charAt(0);
		System.out.println("입력된 문자 : "+ahh);
		
		// 추출된 char 판별
		char trans=((ahh>='a')&&(ahh<='z'))?(char)(ahh-32)
				:((ahh>='A')&&(ahh<='Z'))?(char)(ahh+32):ahh;
		// 출력
		System.out.println("변형된 값 : "+trans);
	}
}
