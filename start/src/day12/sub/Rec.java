package day12.sub;

public class Rec implements Figure {
	private int width, height, area;
	
	public Rec() {}
	public Rec(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
	}

	@Override
	public void setArea() {
		area=width*height;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 사각형은 가로 %3d, 세로가 %3d, 넓이는 %3d이다.", 
				width, height, area);
		System.out.println();
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
}
