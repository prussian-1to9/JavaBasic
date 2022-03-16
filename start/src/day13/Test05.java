package day13;

public class Test05 {

	public Test05() {
		int no=25;
		int result=0;
		
		try {
			for(int i=-3; i<=3; i++) {
				result=no/i;
				System.out.println(no+" / "+i+" = "+result);
			}
		}catch(Exception e) {
			result=no;
			System.out.println("[에러] 숫자를 0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new Test05();
	}

}