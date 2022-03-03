package day05.ex;

public class Ex09Resolve {

	public static void main(String[] args) {
		// 부호 변수, 합계 변수 생성 및 초기화
		int pulma=-1, sum=0;

		// 반복문 생성
		for (int i=0; ; i++) {
			// 변수 바꿔주기
			pulma*=-1;
			
			// 합해주기
			sum+=pulma*(i+1);
			
			// 합이 100을 넘었을 경우
			if (sum>100) {
				System.out.println("1부터 "+(i+1)+"까지 계산하여 "+sum+"으로 100을 넘었습니다.\n"
									+"시스템을 종료합니다.");
				break;
			}
		}
	}
}
