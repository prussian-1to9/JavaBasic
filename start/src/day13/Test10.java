package day13;

public class Test10 {

	public Test10() {
		Test1001 t01=new Test1001();
		
		try{
			t01.abc(); // 예외를 전이하는 함수는 호출하는 곳에서 예외처리를 해줘야 함.
		}catch (Exception e) {
		}
	}
	

	public static void main(String[] args) {
		new Test10();
	}

}
