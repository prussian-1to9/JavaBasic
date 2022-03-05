package day07.ex;
/*
	문제 2.
		int[] coin={10000, 5000, 1000, 500, 100, 50, 10, 1}
		을 준비하고
		
		79456원을 coin에 기억된 화폐단위로 지불하려 할 때,
		각각의 단위로 몇 장(개)씩 필요한지 기억시켜
		배열의 내용을 출력하시오.
		
		출력 예)
			10000	: 7
			5000	: 1
			...
			1		: 6
 */
public class Ex02 {
	public static void main(String[] args) {
		// 배열 준비
		int[] coin={10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		// 나눌 돈 만들기
		int money=79456;
		int tmp=money;
		
		// 반복문 만들기
		for (int i=0; i<coin.length; i++) {
			System.out.print(coin[i]+"원 짜리 : ");

			// 나누기
			int[] gaesu=new int[coin.length];
			gaesu[i]=tmp/coin[i];
			tmp%=coin[i];
			
			// 출력
			System.out.print(gaesu[i]+"개\n");
		}
	}
}
