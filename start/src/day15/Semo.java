package day15;

public class Semo implements Comparable {
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
	public void setArea() {
		area=width*height*0.5;
	}
	
	@Override
	public int compareTo(Object o) {
		Semo hoka=(Semo)o;
		
		// 내림차순이니까 마지막은
		int result=height-hoka.getHeight();
		return -result;	// 부호, 이제부터가 반전!
	}
	
	@Override
	public String toString() {
		return "밑변이 "+width+", 높이가 "+height+", 넓이가"+area+"인 삼각형";
	}	
}
