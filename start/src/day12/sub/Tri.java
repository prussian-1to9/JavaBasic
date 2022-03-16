package day12.sub;

public class Tri implements Figure {
	private int width, height;
	private double area;
	
	public Tri() {}
	public Tri(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
	}

	@Override
	public void setArea() {
		area=width*height*0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 삼각형의 밑변은 %3d, 높이는 %3d, 넓이는 %6.2f이다.", 
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
