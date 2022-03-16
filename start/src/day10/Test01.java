package day10;

public class Test01 {
	/*
		접근 지정자의 범위
		
		private < 생략 < protected < public
	 */
	private int no1=10;	// 클래스 안에서만 사용 가능
	int no2=20;	// 같은 클래스 + 같은 패키지에서 사용 가능
	protected int no3=30;	// 상속받은 클래스 + 같은 패키지 내
	public int no4=40;
	
	// 맴버변수의 내용을 출력해주는 기능의 함수!
	public void noPrint() {
		System.out.println("no1 : "+no1);
		System.out.println("no2 : "+no2);
		System.out.println("no3 : "+no3);
		System.out.println("no4 : "+no4);
	}
}
