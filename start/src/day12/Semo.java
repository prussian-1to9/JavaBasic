package day12;
/*
	뼈대가 되는 추상 클래스 Figure 의 sub class입니다.
	따라서 Figure의 abstract method의 내용을 채워주어야 합니다.
 */
public class Semo extends Figure {
	private int width, height;
	private double area;
	
	public Semo() {}
	
	public Semo(int width, int height) {
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

	@Override
	public void setArea() {
		area=width*height/2.;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("이 삼각형은 밑변이 %3d, 높이가 %3d, 넓이가 %6.2f이다.", 
				width, height, area);
		System.out.println();
	}
}
