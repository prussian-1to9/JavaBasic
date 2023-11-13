package i_basic_syntax;

import javax.swing.*;

/**
 *  javax.swing 패키지를 이용하여
 * 	System.out.println()과는 다른 형식으로 데이터를 출력해봅니다.
 */
public class VariableTest02 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("출력할 문자열을 입력해 보세요.");
		JOptionPane.showMessageDialog(null, "입력된 문자열 : " + s1);
	}
}
