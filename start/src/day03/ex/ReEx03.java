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
import java.util.*;
public class ReEx03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("현금 계산할 금액을 입력해주세요.");
		int money=sc.nextInt();
		System.out.println(money+"원을 현금으로 계산합니다.");
		
		int tmp=money;
		int oman=tmp/50000;
		tmp%=50000;
		int man=tmp/10000;
		tmp%=10000;
		int ochun=tmp/5000;
		tmp%=5000;
		int chun=tmp/1000;
		tmp%=1000;
		int obaek=tmp/500;
		tmp%=500;
		int baek=tmp/100;
		tmp%=100;
		int osip=tmp/50;
		tmp%=50;
		int sip=tmp/10;
		int ill=tmp%=10;
		
		if (oman>0) {
			System.out.println("50,000원 권 "+oman+"장");
		}
		if (man>0) {
			System.out.println("10,000원 권 "+man+"장");
		}
		if (ochun>0) {
			System.out.println("5,000원 권 "+ochun+"장");
		}
		if (chun>0) {
			System.out.println("1,000원 권 "+chun+"장");
		}
		if (obaek>0) {
			System.out.println("500원 동전 "+obaek+"개");
		}
		if (baek>0) {
			System.out.println("100원 동전 "+baek+"개");
		}
		if (osip>0) {
			System.out.println("50원 동전 "+osip+"개");
		}
		if (sip>0) {
			System.out.println("10원 동전 "+sip+"개");
		}
		if (ill>0) {
			System.out.println("1원 동전 "+ill+"개");
		}
		if (money>0) {
			System.out.println("가 필요합니다.");
		}
		else {
			System.out.println("오류가 발생했습니다. 정확한 값을 입력해주세요.");
		}
	}
}
