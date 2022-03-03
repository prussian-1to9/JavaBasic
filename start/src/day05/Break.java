package day05;

public class Break {
	/*
		for 명령문에 증감식, 조건식, 카운터 변수 초기화 부분은
		모두 기술하지 않아도 된다. (;은 써줘야 함!!)
		이 때는 무한반복으로 처리 된다.
		
		for(;;){} ==> 무한 반복하는 반복문!
		-> 이 때, 이 반복문 내에서 종료 시점을 지정해 줘야 함.
			※ 종료시점에 break;를 기입한다.
	 */
	public static void main(String[] args) {
		// 1부터 숫자를 만들어 출력하고,
		//	50이 되면 반복을 종료하시오.
		for (int i=0; ; i++) {
			/*
				※ for 명령에서 조건식에 아무것도 쓰지 않으면
					조건식의 결과는 무조건 true다.
			 */
			int no=i+1;
			if (no>50) {
				break;
			}
			System.out.print(no+", ");
		}
		System.out.println();
		
		int no=1;
		while(true) {
			if(no>50) break;
			/*
				블럭의 내용이 명령 하나만 기술되는 경우,
				중괄호 {}를 생략할 수 있다.
			 */
			System.out.print(no+", ");
			++no;
		}
		System.out.println();
	}

}
