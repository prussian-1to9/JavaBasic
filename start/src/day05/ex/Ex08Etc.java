package day05.ex;

/*
	문제 8-etc. 1바이트로 기억되는 2진수를 랜덤하게 만들어
		그 숫자가 10진수로 몇인지 출력하는 프로그램을 작성하시오,
		
		+ 문자열 2진수를 10진수 정수로 변환하는 방법
			Integer.valueOf("문자열 2진수", 2);
			Integer.parseInt("문자열 2진수", 2);
			
		+ Hint
			2진수는 0과 1을 랜덤하게 발생시켜 문자열에 덧붙여서 만든다.
*/
public class Ex08Etc {
	public static void main(String[] args) {
		// 문자열 만들기
		String jin2="";
		
		// ※ 반복문으로 0,1 만들기 (반복문 쓰면 될걸 까먹어 버렸음!!)
		for (byte i=0; i<8; i++) {
			byte bi=(byte)(Math.random()*(1-0+1)+0);
			jin2+=bi;
		}
		// 10진수로 전환
		int jin10=Integer.valueOf(jin2,2);
		
		// 출력
		System.out.println("만들어진 2진수 : "+jin2+"\n"
				+ "10진수로 변환한 값 : "+jin10);
	}
}
