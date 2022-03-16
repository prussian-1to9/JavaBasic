package day11;

public class Rec extends Moyang {
	private int width, height;
	private double area;
	
	public Rec() {}
	public Rec(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {// overloading
		this.area=width*height;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("가로 %3d, 세로 %3d, 넓이가 %6.2f인 사각형", width, height, area);
		System.out.println();
	}
}
