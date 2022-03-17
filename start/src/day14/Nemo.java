package day14;

public class Nemo {
	private int width, height, area;
	
	public Nemo() {}
		// 생성자 함수를 하나도 정의하지 않으면
		// JVM이 알아서 기본생성자를 만들어 사용한다.
		// 하나라도 만들면 그런짓 안함!
	
	public Nemo(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
	}
	
	// 면적 계산, 셋팅 함수
	public void setArea() {
		area=width*height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	// 문자열로 변환해주는 햄쑤.
	// 출력할 때 자동호출되는 함수
	@Override
	public String toString() {
		return "사각형\n\t가로 : "+width+"\n\t세로 : "+height+"\n\t면적 : "+area;
	}
	
	// 면적이 같으면 같은 사각형이라고 처리해주는 함수
	@Override
	public boolean equals(Object o) {// equals 함수의 원형 살려주기!
		// 반환값 변수
		boolean bool=false;
		
		// 입력된 데이터를 원래 형태로 강제 형변환
		Nemo nam=(Nemo)o;
		
		// 남의꺼 면적 꺼내오기
		int namArea=nam.getArea();
		
		bool=(area==namArea);
		
		return bool;
	}
}
