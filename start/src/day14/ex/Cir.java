package day14.ex;

public class Cir {
	private int rad;
	private double l, area;
	
	public Cir() {}
	public Cir(int rad) {
		this.rad=rad;
		setL();
		setArea();
	}
	
	// Getter Setter
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
	public void setArea() {
		area=rad*rad*Math.PI;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean bool=false;
		
		// 강제 형변환 후 rad따오기
		Cir c=(Cir) obj;
		int hikaku=c.getRad();
		
		// 일치 조건 대입
		bool=rad==hikaku;
		
		return bool;
	}
	
	@Override
	public String toString() {
		return "원\n\t반지름 : "+rad+"\n\t원주 : "+l+"\n\t넓이 : "+area;
	}
}
