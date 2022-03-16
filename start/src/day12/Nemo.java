package day12;
/*
뼈대가 되는 추상 클래스 Figure 의 sub class입니다.
따라서 Figure의 abstract method의 내용을 채워주어야 합니다.
*/
public class Nemo extends Figure {
	private int width, height, area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
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


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
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
}
