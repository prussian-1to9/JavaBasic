package day05.ex;

/*
	문제 8. 숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
 */
import javax.swing.JOptionPane;
public class Ex08 {
	public static void main(String[] args) {
		// 5자리 정수 입력받기
		String num=JOptionPane.showInputDialog(null,"5자리 정수를 입력하세요.");
		
		// 자릿수 구하는 변수 생성
		int length=num.length();
		
		// 합을 구할 변수 생성
		int sum=0;
		
		// 각 자리의 수 합하는 조건문 만들기
		for(int i=0; i<length; i++) {
			int letter=(num.charAt(i)-'0');
			sum+=letter;
		}
		
		// 결과값 출력
		System.out.println("입력된 5자리 정수 : "+num);
		System.out.println("각 자리 수의 합 : "+sum);
	}
}
