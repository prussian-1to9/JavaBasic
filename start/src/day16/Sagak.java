package day16;

public class Sagak {
	private int width, height, area;
	
	public Sagak() {}
	public Sagak(int width, int height) {
		this.width=width;
		this.height=height;
		setArea(width*height);
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
	/*	toString 함수를 Override하여 기능을 수정할 때
		오타가 나서, 새로운 함수가 하나 만들어진걸로 인정이 되면?
	 */
	@Override
	public String toString() {
		return String.format("이 클래스는 면적이 %6.2f인 사각형", area);
	}
}
