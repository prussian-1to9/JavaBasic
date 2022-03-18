package day15;

public class Won {
	private int rad;
	private double l, area;
	public Won() {}
	public Won(int rad) {
		this.rad=rad;
		setL();
		setArea();
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void setArea() {
		area=rad*rad*3.14;
	}
	public void setL() {
		l=rad*2*3.14;
	}
	
	@Override
	public String toString() {
		return "반지름이 "+rad+"이고, 원주가 "+l+", 면적이 "+area+"인 원";
	}
}
