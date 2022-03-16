package day12;

public class Test02 {
	public Test02() {
		Abc a=new Abc();
		Efg e=new Efg();
		
		toPrint(a);
		toPrint(e);	// 자동 형변환
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void toPrint(Abc a) {
		a.abc();
	}
}

class Abc {
	public void abc() {
		System.out.println("보쿠와 에비씨.");
	}
}

class Efg extends Abc {
	public void abc() {
		System.out.println("보쿠와 이엪즤.");
	}
}