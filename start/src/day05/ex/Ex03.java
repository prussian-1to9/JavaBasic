package day05.ex;

/*
	문제3.
		문자열을 입력받아
		문자를 한글자씩 추출해 출력하시오.
		
	+ 문자열의 길이를 알아내는 방법
		int 변수=문자열.length();
 */
import javax.swing.JOptionPane;
public class Ex03 {
	public static void main(String[] args) {
		// 문자열 입력받기&변수 생성
		String str=JOptionPane.showInputDialog("문자 열을 입력하시오.");
		
		// 확인 차 재출력
		System.out.println("입력된 문자 열 : "+str);
		
		// 문자열 길이를 나타내는 변수 생성
		int length=str.length();
		
		// 반복문 생성
		for(int i=0; i<length; i++) {
			// 추출
			char letter=str.charAt(i);
			// 출력
			System.out.print((i+1)+"번째 문자 : ["+letter+"]\n");
		}
	}

}
