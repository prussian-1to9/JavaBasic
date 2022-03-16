package day11;

public class Tri extends Moyang {
	private int width, height;
	private double area;
	
	public Tri() {}
	public Tri(int width, int height) {
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
		this.area=width*height/2.;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("밑변이 %3d, 높이가 %3d, 넓이가 %6.2f인 삼각형", width, height, area);
		System.out.println();
	}
}
