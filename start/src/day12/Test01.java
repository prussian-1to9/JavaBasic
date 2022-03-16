package day12;

public class Test01 {
	public Test01() {
		Mother m1=new Daugther();
//		Daugther d1=new Mother();	==> NG!
		
		Mother m2=new Mother();
		Daugther d1=(Daugther)m2;	// 되긴 하는디 실행시키면 에러남.
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}

class Mother{
	void abc() {
		System.out.println("뀨");
	}
}

class Daugther extends Mother {
	void abc() {
		System.out.println("뀨우우.");
	}
}