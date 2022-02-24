package day03;

/*
	문자열 데이터의 비교는
	equals()를 사용한다.
		(문자열).equals(비교할 문자열)
 */
public class CompareString {
	public static void main(String[] args) {
		String D="황인준";
		String R=new String("황인준");
		
		// 비교연산자로 비교
		boolean NotRealDR=D==R; // 변수가 기억하는 주소를 기억.
		// equals()로 비교
		boolean RealDR=D.equals(R);
		
		System.out.println("D==R : "+NotRealDR);
		System.out.println("D.equals(R) : "+RealDR);
		
	}
}
