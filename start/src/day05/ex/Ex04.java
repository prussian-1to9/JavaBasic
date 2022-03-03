package day05.ex;

/*
	문제4. 전기요금을 계산해주는 프로그램을 작성하시오.
	
	전기요금표
				코드	기본요금	사용요금
		가정용	1		3800		245
		산업용	2		2400		157
		교육용	3		2900		169
		상업용	4		3200		174
		
		전기요금=기본요금+사용량*사용요금
		
		사용자 코드와 사용량을 입력하면
		전기요금을 계산해서 출력해주는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		// 스캐너 작성
		Scanner sc=new Scanner(System.in);
		
		// 사용자 코드입력
		System.out.println("사용자 코드를 입력하세요.\n"
				+"(일반 가정 1, 산업체 2, 교육기관 3, 상업 건물 4, 종료 0)");
		int code=sc.nextInt();

		// 사용량 입력
		System.out.println("한 달 사용량 사용량을 입력하시오.");
		int usage=sc.nextInt();
		
		// 전기요금 변수 생성
		int total;
		
		// 코드 별 계산
		if (code==1) {		// 가정용
			total=3800+(usage*245);
			
		}else if(code==2) {		// 산업용
			total=2400+(usage*157);
			
		}else if(code==3) {		// 교육용
			total=2900+(usage+169);
			
		}else {		// 상업용
			total=3200+(usage*174);
		}
		
		// 결과 출력
		System.out.println("귀하의 이번 달 전기 요금은 "+total+"원 입니다.");
	}
}