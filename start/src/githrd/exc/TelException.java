package githrd.exc;

public class TelException extends Exception {

	@Override
	public String toString() {
		return "전화번호 형식이 잘못되었습니다. (ex. 010-1234-5678)";
	}

}
