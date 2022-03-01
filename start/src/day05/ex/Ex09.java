package day05.ex;

/*
	문제 9. 1 -2 +3 -4 +5 ... 했을 경우
	어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하시오.
 */
public class Ex09 {
	public static void main(String[] args) {
		// 합계에 대한 변수 생성 및 초기화
		int sum=0;
		
		// 반복문 생성
		for (int i=0; ; i++) {
			if (sum>=100) {
				// 합계가 100상이 됐을 경우 계산 및 출력.
				System.out.println(" = "+sum);
				System.out.println("합계가 "+sum+"이 되어 실행을 종료합니다\n"
						+i+"까지 연산하였습니다.");
				break;
				
			} else {	// 합계가 100보다 작을 경우에만 계산.
				if (i==0){
					// 처음은 +, - 출력하지 않음.
					sum+=(i+1);
					System.out.print((i+1));
					
				} else if (i%2==0) {
					// i가 짝수일 경우 홀수 덧셈.
					sum+=(i+1);
					// 출력
					System.out.print(" + "+(i+1));
					
				} else {
					// i가 홀수일 경우 짝수 뺄셈.
					sum-=(i+1);
					// 출력
					System.out.print(" - "+(i+1));
				}				
			}
		}
	}
}
