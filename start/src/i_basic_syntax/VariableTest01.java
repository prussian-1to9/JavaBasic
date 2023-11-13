package i_basic_syntax;

/**
 * 데이터를 변수에 저장하고 출력해 보는 클래스입니다.
 */
public class VariableTest01 {
	public static void main(String[] args) {
		String s1 = "테스트 문자열";
		int n1 = 2048;
		char ch1 = 'A';
		double f1 = 3.14159;

		// 내용 출력
		System.out.println("문자열 : " + s1);
		System.out.println("정수 : " + n1);
		System.out.println("문자 : " + ch1);
		System.out.println("실수 : " + f1);
	}
}
