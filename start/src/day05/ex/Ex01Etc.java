package day05.ex;

/*
	문제 1-etc. 1부터 정수를 더했을 때, 합이 5000을 초과하는 수는 몇부터 인지 출력하시오.
	
	Hint. 처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/
public class Ex01Etc {
	public static void main(String[] args) {
		// 합계를 받을 변수 생성
		int sum=0;
		
		// 반복문 생성
		for (int i=0; ; i++) {
			sum+=(i+1);
			// 조건문 생성
			if (sum>5000) {
				System.out.println("1부터 정수를 더했을 때, "+i+"부터는 5000을 초과합니다.");
				break;
			}
		}
	}
}
