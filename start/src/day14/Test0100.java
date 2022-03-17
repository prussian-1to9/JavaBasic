package day14;

public class Test0100 extends Test0101 {
/*
	@Override
	void abc() throws Exception {
		System.out.println("던지는 예외가 같은 경우 노상관");
	}
*/
	@Override
	void abc() throws RuntimeException {
		System.out.println("범위가 좁아진 경우도 노상관");
	}
/*	
	@Override
	void xyz() throws IllegalAccessException {
		System.out.println("던지지 않은 예외는 안됨!!");
	}
*/	
	@Override
	void xyz() throws ClassCastException, ArithmeticException {
		System.out.println("같은 예외 소속이면 노상관!");
	}
}

class Test0101 {
	void abc() throws Exception{
		System.out.println("###");
	}
	
	void xyz() throws ArithmeticException{
		System.out.println("***");
	}
}