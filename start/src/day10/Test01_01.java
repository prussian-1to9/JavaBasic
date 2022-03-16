package day10;

public class Test01_01 {
	/*
		Test01 클래스의 변수에 접근해서 데이터를 읽어보자~!
	 */
	private int num1, num2, num3, num4;
	
	// Test01의 변수 내용 읽어와 전역변수에 셋팅해주는 함수
	public void getNo() {
		// Test01의 맴버를 사용하려면 먼저 Heap영역에 클래스 내용을 복사해둬야 함
		// new 명령으로 해줄 수 있다.
		Test01 t1=new Test01();
		
//		num1=t1.no1;	no1은 private라 Test01클래스를 벗어나면 사용 불가
		num2=t1.no2;	// 생략 : Test01과 같은 패키지라 사용 가능
		num3=t1.no3;	// 같은 패키지 내라 가능~
		num4=t1.no4;	// public 이라 가능~
	}
}
