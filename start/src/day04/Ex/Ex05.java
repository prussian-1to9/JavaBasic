package day04.Ex;

/*
	3자리 숫자(100~999)를 입력받아
	이 숫자에 가장 가까운 100의 배수를 만들기 위해선
	얼마가 필요한지를 계산해 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("3자리 숫자를 입력하시오.");
		int num=sc.nextInt();
		
		// 방법 1) 범위 활용
		int nearby=(num<150)?100:
			(num<250)?200:(num<350)?300:
				(num<450)?400:(num<550)?500:
					(num<650)?600:(num<750)?700:
						(num<850)?800:(num<950)?900:1000;
		
		// 방법 2) 나머지 활용
		int Nearby=(num%100<50)?(num/100*100):((num/100+1)*100);
		
		System.out.println("당신이 입력하신 숫자는 "+num+"이고, 100의 배수중엔 "+Nearby+"가 제일 가깝네요!");
		
		// 필요한 수를 구하는 변수 만들고, 출력
		int in_need=((num-nearby)<0)?(nearby-num):(num-nearby);
		System.out.println(nearby+"와는 "+in_need+"의 차이가 납니다.");
	}
}
