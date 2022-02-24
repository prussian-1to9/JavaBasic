package day03.ex;

/*
	문제 3.
		84232원을 지불하려 한다.
		우리나라 화폐단위로 이 금액을 지불하려면
		어떤 지폐가 각각 몇개 씩 필요한지 계산해 출력하세요.
		
	화폐단위
		50,000
		10,000
		5,000
		1,000
		500
		100
		50
		10
		1
 */
public class Ex03 {
	public static void main(String []args) {
		int money=84232;
		
		System.out.println("50,000원 권 : "+(money/50000)+"장");
		System.out.println("10,000원 권 : "+(money%50000/10000)+"장");
		System.out.println("5,000원 권 : "+(money%10000/5000)+"장");
		System.out.println("1,000원 권 : "+(money%5000/1000)+"장");
		System.out.println("500원 동전 : "+(money%1000/500)+"개");
		System.out.println("100원 동전 : "+(money%500/100)+"개");
		System.out.println("50원 동전 : "+(money%100/50)+"개");
		System.out.println("10원 동전 : "+(money%50/10)+"개");
		System.out.println("1원 동전 : "+(money%10)+"개");
		
		
		// 강사님 풀이
		
		int total=84232;
		int tmp=total;
		
		int oman=tmp/50000;
		tmp=tmp%50000;
		int man=tmp/10000;
		tmp=tmp%10000;
		int ochun=tmp/5000;
		tmp=tmp%5000;
		int chun=tmp/1000;
		tmp=tmp%1000;
		int obaek=tmp/500;
		tmp=tmp%500;
		int baek=tmp/100;
		tmp=tmp%100;
		int osip=tmp/50;
		tmp=tmp%50;
		int sip=tmp/10;
		tmp=tmp%10;
		int ill=tmp;
		
		System.out.println("50,000원 권 : "+oman+"장");
		System.out.println("10,000원 권 : "+man+"장");
		System.out.println("5,000원 권 : "+ochun+"장");
		System.out.println("1,000원 권 : "+chun+"장");
		System.out.println("500원 동전 : "+obaek+"개");
		System.out.println("100원 동전 : "+baek+"개");
		System.out.println("50원 동전 : "+osip+"개");
		System.out.println("10원 동전 : "+sip+"개");
		System.out.println("1원 동전 : "+ill+"개");
	}
}

