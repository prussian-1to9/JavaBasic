package day13;
/*
	25를 -3에서 3까지의 정수로 나눈 결과를 출력하는 프로그램을 작성하시오.
	필요하면 에외처리도 하시오.
 */
public class Test04 {
	public Test04() {
		int no=25;
		int result=0;
		
		// 반복문 생성
		for (int i=-3; i<=3; i++) {
			try {
				result=no/i;
				System.out.println(no+" / "+i+" = "+result);
			}catch(Exception e) {
				System.out.println("[에러] 0으로 숫자를 나눌 수 없습니다.");
				result=no;
			}
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
