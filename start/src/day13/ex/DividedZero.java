package day13.ex;

public class DividedZero extends Exception {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName()+"숫자를 0으로 나눌 수 없습니다.";
	}

}
