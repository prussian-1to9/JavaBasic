package githrd.exc;

public class AvtException extends Exception {

	@Override
	public String toString() {
		return "아바타 번호는 11~16입니다. 번호를 확인해 주세요.";
	}

}
