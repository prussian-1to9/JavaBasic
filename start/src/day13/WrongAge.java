package day13;

public class WrongAge extends Exception {
	/*
		사용자 정의 예외클래스 만드는 방~법!
		1. Exception 클래스를 상속받은 클래스를 만든다!
		2. toString 함수를 override해서 예외 정보를 기술한다.
	 */

	@Override
	public String toString() {
		return getClass().getName()+"\t\t음수의 나이가 입력되었습니다.";
	}
}
