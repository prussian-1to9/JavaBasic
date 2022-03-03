package day07;

/*
	6개의 메모리를 배열로 만들고
	그 안에 랜덤한 숫자를 입력 후 출력하시오.
 */
public class Test02 {
	public static void main(String[] args) {
		// 배열의 주소를 기억할 변수
		int[] lotto;
		
		// 배열 만들기
		lotto=new int[6];
		
		int len=lotto.length;
		
		loop:
		for (int i=0; i<len; i++) {
			// 랜덤 정수 만들기
			int no=(int)(Math.random()*45+1);
			
			// 중복검사
			for (int j=0; j<i; j++) {
				// 이전에 만든 번호 추출
				int tmp=lotto[j];
				
				// 이전 회차와 같은지 다른지 판별
				if (no==tmp) {
					i--;
					continue loop;
				}

				// 배열에 입력
				lotto[i]=no;
			}
			// 하나씩 꺼내 출력
			System.out.println(lotto[i]);
		}
	}
}
