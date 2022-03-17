package day13.ex;

public class WrongIndex extends Exception {

	@Override
	public String toString() {
		return getClass().getName()+"배열의 크기를 정확하게 입력하세요.";
	}

}
