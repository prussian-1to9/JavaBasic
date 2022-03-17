package day14.ex;

public class Nemo {
	private int width, height, area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		area=width*height;
	}
	@Override
	public boolean equals(Object obj) {
		boolean bool=false;
		
		// 비교할 네모 형 변환 후 width, height따오기.
		Nemo n=(Nemo)obj;
		int width_hikaku=n.getWidth();
		int height_hikaku=n.getHeight();
		
		// 비교
		bool=(width==width_hikaku)&(height==height_hikaku);
		
		return bool;
	}
	@Override
	public String toString() {
		return "사각형\n\t가로 : "+width+"\n\t세로 : "+height+"\n\t넓이 : "+area;
	}
	
	
}
