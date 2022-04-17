package formatTest;

import java.text.*;
public class DecimalFormat01 {// Test01

	public DecimalFormat01() {
		// DecimaFormat
		double no = 12345.5678;
		
		// 소수점 둘째 자리까지만 보여주고, 정수는 , 표기 하기로.
		DecimalFormat form1 = new DecimalFormat("0,000,000.00");
		DecimalFormat form2 = new DecimalFormat("#,###,###.00");
		
		// 문자열 만들기
		String str1 = form1.format(no);
		String str2 = form2.format(no);
		
		// 출력
		System.out.println("0 : " + str1);
		System.out.println("# : " + str2);
	}

	public static void main(String[] args) {
		new DecimalFormat01();
	}

}
