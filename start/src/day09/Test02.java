package day09;
/*
	두 수를 이용해, 더하는 프로그램을 작성하시오.
	단, 입력, 계산, 출력을 함수로 만들어 처리하시오.
 */
public class Test02 {
	public Test02() {
		// 기본생성자
		// 생성자함수는 반환값 타입을 기술하면 안된다.
		abc();
		int no1=makeInt();
		int no2=makeInt();
		
		// 두수 계산
		int result=calc(no1, no2);
		
		// 출력
		toPrint(no1, no2);
		toPrint(no1, no2, result);
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void abc() {
		System.out.println("abc 함수 호출...");
	}
	
	// 1~100 사이의 랜덤한 정수를 발생시켜 변환해주는 함수
	public int makeInt() {
		// 반환값 변수
		int no=0;
		
		// 랜덤 정수 만들어 입력
		no=(int)(Math.random()*100+1);
		
		// 반환값 내보내기
		return no;
	}
	// 두 수를 입력받아 계산해 주는 함수
	public int calc(int no1, int no2) {
		// 반환값 변수
		int result=no1+no2;
		
		// 반환값 내보내기
		return result;
	}
	
	// 출력함수
	public void toPrint(int no1, int no2) {		
		// 결과값 변수
		int result=calc(no1, no2);
		
		// 출력
		System.out.println("두 정수 "+no1+", "+no2+"의 합은 "+result+"입니다.");
//		return; 은 생략 가능
	}
	
	public void toPrint(int no1, int no2, int no3) {
		/*
			함수의 오버로딩
				같은 이름으로 함수를 한 클래스 내에 추가하는 방법
				
				0. 함수에 오버로딩하려는 함수가 있어야 함.
				1. 함수 이름이 같아야 함.
				2. 매개 변수 리스트가 달라야 함.
					(개수, 형태, 순서 중 하나가 달라야 함)
		 */
		System.out.println("두 정수 "+no1+", "+no2+"의 합은 "+no3+"입니다.");
	}
}
