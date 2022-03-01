package day05.ex;

/*
	문제 10. 주사위 2개를 던질 경우
	눈의 합이 6이 되는 경우를 모두 출력하세요. 
 */
public class Ex10 {
	public static void main(String[] args) {
		// 안내문구 출력
		System.out.println("주사위 합이 6이 되는 경우를 출력합니다.");
		
		// 반복문 생성
		for (int d1=0; d1<6; d1++) {
			
			// 주사위 2 롤링
			for(int d2=0; d2<6; d2++) {		
				
				// 조건문 생성 및 출력
				if ((d1+1)+(d2+1)==6) {
					System.out.println((d1+1)+", "+(d2+1));
			}
			}
		}
	}
}
