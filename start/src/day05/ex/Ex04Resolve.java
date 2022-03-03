package day05.ex;

import java.util.Scanner;
public class Ex04Resolve {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			
			// 입력 코드 입력
			System.out.println("사용자 코드를 입력하세요.\n"
					+"(가정용 1, 산업용 2, 교육용 3, 상업용 4, 종료 0)");
			int code=sc.nextInt();
			
			// 종료 시 시스템 즉시 종료
			if (code==0) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}else if (code>4) {
				System.out.println("정확한 코드를 입력하세요.");
			}
			// 사용량 입력
			System.out.println("사용량을 입력하세요.");
			int usage=sc.nextInt();
			
			// 판별용 변수 생성
			int total;
			String use="";
			
			// switch로 판별하기
			switch (code) {
			case 1:
				use="가정용";
				total=3800+(usage*245);
				break;
				
			case 2:
				use="산업용";
				total=2400+(usage*157);
				break;
				
			case 3:
				use="교육용";
				total=2900+(usage*169);
				break;
				
			case 4:
				use="상업용";
				total=3200+(usage*174);
				break;
			}
			// 출력
			System.out.println("입력된 코드는"+use+"이며,\n"
					+usage+"의 사용량에 대한 금액은"+(3800+(usage*245))+"원 입니다.\n"
					+"--------------------------------------------------------------");
		}
	}
}
