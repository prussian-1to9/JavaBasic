package day16;

public class Nemo {
	private int width, height;
	private double area;
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width=width;
		this.height=height;
		setArea(width*height);
	}
	
	// Getter Setter
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
	
	@Override	// 가로가 같으면 같은 네모로~
	public boolean equals(Object obj) {
		boolean bool=false;
		
		Nemo n=(Nemo)obj;
		bool=n.getWidth()==width;
		
		return bool;
	}
	
	@Override
	public String toString() {
		return String.format("이 사각형은 가로가 %3d, 세로가 %3d, 면적이 %6.2f이다.", width, height, area);
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}
