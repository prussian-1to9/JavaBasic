package day12;
/*
	이 클래스는 삼각형, 사각형, 원의 정보를 기억할
	클래스들의 super class로써 사용합니다.
	
	abstract class로 작성하여 연습합니다.
 */
public abstract class Figure {
	// 뼈대가 될 추상함수들을 만듭니다.
	public abstract void setArea();	// 면적 계산 추상함수
	
	public abstract void toPrint(); // 출력 추상함수
	/*
		위 함수들은 sub class 들에서 내용이 모두 달라지므로
		추상함수로 지정하였습니다.
		
		sub class 들은 위 함수들을 override를 해 주어야 합니다.
	 */
}
