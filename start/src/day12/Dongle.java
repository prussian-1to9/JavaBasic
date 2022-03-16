package day12;

public class Dongle extends Figure {
	private int rad;
	private double l, area;
	
	public Dongle() {}
	public Dongle(int rad) {
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
	
	public void setL() {
		l=rad*2*Math.PI;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void setArea() {
		area=rad*rad*Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d, 둘레가 %6.2f, 면적이 %6.2f이다", 
				rad, l, area);
		System.out.println();
	}
}
