package day03;

import javax.swing.JOptionPane;

public class OperateConvert {
	public static void main(String[] args) {
		System.out.println("3.14+10 : "+ 3.14 + 10);
		/* 연산 방향은 -->이기 때문에
			"3.14+10 : "+3.14 의 연산을 먼저 해버려서
			문자열 형태가 되고, 이후 +10의 연산도 문자열이 나온다.
		*/
		// string이 아닌 char 타입은 아스키 코드값으로 계산이 된다.
		System.out.println("J+3.14 = "+('J'+3.14));
		
		// J이후의 10번째 문자는 무엇인지 출력하세요.
		JOptionPane.showMessageDialog(null, "J 이후의 10번째 문자 : "+(char)('J'+10)); // 강제 형변환
	}
}
