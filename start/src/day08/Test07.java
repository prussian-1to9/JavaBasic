package day08;
/*
	문자열 5개를 기억할 배열을 만들어 보기를 입력해 놓고
	문제와 같이 화면에 출력 하시오.
	
	사용자가 정답을 입력하면 답안을 채점하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 문제에 대한 변수 만들기
		String quest="다음 중 NCT맴버가 아닌 사람은?";
		
		// 보기 변수 생성 및 입력
		String[] ans=new String[5];
		ans[0]="태용";
		ans[1]="런쥔";
		ans[2]="루이";
		ans[3]="샤오쥔";
		ans[4]="도영";
		
		// 정답 위치값 변수
		int atari=2;
		
		// 출력
		System.out.println(quest);
		for(int i=0; i<ans.length; i++) {
			System.out.println("\t"+(i+1)+". "+ans[i]);
		}
		
		// 사용자 정답 입력
		System.out.print("답 : ");
		int user=sc.nextInt()-1;
		
		// 채점
		if (user==atari) {
			System.out.println("정답입니다! 루이는 귀여운 반려 고양이 입니다!");
		} else {
			System.out.println("오답입니다! "+ans[user]+"은 NCT맴버가 맞습니다.");
		}
	}
}
