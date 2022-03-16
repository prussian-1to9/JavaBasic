package day10;

public class Semo01 {
	private int height, width;
	private double area;
	
	public Semo01() {
		// 아무것도 입력받지 않고 이 클래스를 객체로 만든다면
		// 높이와 너비를 1로 세팅해 삼각형을 만들기로 하자!
/*		height=1;
		width=1;
		setArea();	this 이전에 다른 명령이 오면 안됨!*/
		this(1, 1);	// 이 함수는 아래에 정의된 생성자를 호출하는 것.
		// 이 함수를 호출할 때, 반드시 생성자의 첫 줄 첫 문장으로 기술되어야 함!
	}
	
	public Semo01(int height, int width) {// 생성자 오버로딩
		// 이 생성자는 높이와 너비를 입력받아 삼각형 객체로 만들어주는 기능의 생성자!
		this.height=height;
		this.width=width;
		setArea();
	}
	
	public void setArea() {
		area=width*height/2.;
	}
	
	public static void main(String[] args) {
	}
}
