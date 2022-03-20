package day11;

public class Samgak extends Figure{
	private int width, height;
	
	public Samgak() {}	// 기본 생성자
	
	public Samgak(int width, int height) {
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

	@Override
	public void setArea() {
		area=width*height/2.;
	}
}
