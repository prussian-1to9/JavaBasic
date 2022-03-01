package day04.exEx;
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
import javax.swing.JOptionPane;
public class Ex02 {
	public static void main(String[] args) {
		// 팝업 띄워, 변수 받기.
		String ch=JOptionPane.showInputDialog("임의의 문자를 입력하시오.");
		char chr=ch.charAt(0);
		
		// 소문자면 대문자로, 대문자면 소문자로, 특수문자면 그대로 출력.
		int cha='a'-'A'; // 대문자와 소문자의 차이
		
		// 대문자->소문자
		if ((chr>='A')&&(chr<='Z')) {
			System.out.println("변환결과 : "+(char)(chr+cha));
		
		// 소문자-> 대문자
		}else if ((chr>='a')&&(chr<='z')) {
			System.out.println("변환 결과 : "+(char)(chr-cha));
		}else {
			System.out.println("변환 결과 : "+chr);
		}
	}
}
