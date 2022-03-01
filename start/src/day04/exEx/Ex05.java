package day04.exEx;
/*
3자리 숫자(100~999)를 입력받아
이 숫자에 가장 가까운 100의 배수를 만들기 위해선
얼마가 필요한지를 계산해 출력하는 프로그램을 작성하시오.
*/
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		// 3자리 숫자 입력하기
			// 출력 문구 생성
		System.out.println("세 자리 숫자를 입력하세요.");
		
			// 스캐너 생성&변수 생성
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		// 입력된 정수 출력
		System.out.println("입력된 세 자리 숫자 : "+num);
		
		// 변수 생성
		int cha;
		
		// 판별 값 도출&출력
		if (num%100>50) {		// 더하는게 더 가까운 경우
			cha=(num/100+1)*100-num;	// 도출
			// 출력
			System.out.println("100의 배수 중 "+(num+cha)+"와 가장 가까우며, "+cha+"만큼 더해 주어야 합니다.");
		
		}else {					// 빼는게 더 가까운 경우
			cha=num-((num/100)*100);	// 도출
			// 출력
			System.out.println("100의 배수 중 "+(num-cha)+"와 가장 가까우며, "+cha+"만큼 빼 주어야 합니다.");
		}

	}
}
