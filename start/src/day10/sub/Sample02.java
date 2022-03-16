package day10.sub;

import day10.Test01;
public class Sample02 extends Test01 {
	public Sample02 () {
//		System.out.println("no1 : "+no1);	   상속은 받았으나 동일 클래스가 아님
//		System.out.println("no2 : "+no2);	   동일 패키지가 아님
		System.out.println("no3 : "+no3);	// protect : 상속 받아서 사용 가능
		System.out.println("no4 : "+no4);	// pubilc : 그냥 가능
		
		/*
		[ㄹㅇ 참고'만' 할 내용]
		
		상속 관계에 있는 경우, 
		상위 클래스 타입의 변수로 하위 클래스 타입의 인스턴스를 기억시킬 수 있다.
		
		이 때,
		변수는 변수쪽의 데이터를,
		함수는 인스턴스쪽 함수를 사용하게 된다.
		 */
		noPrint();
		
		Sample02 s1=new Sample02();
		s1.no4=400;
		
		Test01 t1=s1;
		
		System.out.println("t1.no3 : "+t1.no4);
	}
	public static void main(String[] args) {
		new Sample02();
	}
	
	// override
	public void noPrint() {
		super.noPrint();
		System.out.println("********************************");
	}
}
