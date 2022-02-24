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

public class Ex03ex {
	public static void main(String[] args) {
		int money=84232;
		System.out.println(money+"원을 지폐와 동전으로 분류합니다.");
		
		int cal=money;
		int oman=cal/50000;
		cal%=50000;
		int man=cal/10000;
		cal%=10000;
		int ochun=cal/5000;
		cal%=5000;
		int chun=cal/1000;
		cal%=1000;
		int obaek=cal/500;
		cal%=500;
		int baek=cal/100;
		cal%=100;
		int osip=cal/50;
		cal%=50;
		int sip=cal/10;
		cal%=10;
		
		if (oman>0) {
			System.out.println("50,000원 권 : "+oman+"장");}
		if (man>0) {
			System.out.println("10,000원 권 : "+man+"장");}
		if (ochun>0) {
			System.out.println("5,000원 권 : "+ochun+"장");}
		if (chun>0) {
			System.out.println("1,000원 권 : "+oman+"장");}
		if (obaek>0) {
			System.out.println("500원 동전 : "+obaek+"개");}
		if (baek>0) {
			System.out.println("100원 동전 : "+baek+"개");}
		if (osip>0) {
			System.out.println("50원 동전 : "+osip+"개");}
		if (sip>0) {
			System.out.println("10원 동전 : "+sip+"개");}
		if (cal>0) {
			System.out.println("1원 동전 : "+cal+"개");}
		
	}
}
