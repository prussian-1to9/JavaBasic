package day11;

public class Circ extends Moyang {
	private int rad;
	private double l, area;
	private final double pi=3.14;
	
	public Circ() {}
	public Circ(int rad) {
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
		l=2*rad*pi;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area=rad*rad*pi;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("반지름이 %3d, 원주가 %6.2f, 넓이가 %6.2f인 원"
				, rad, l, area);
		System.out.println();
	}
}
