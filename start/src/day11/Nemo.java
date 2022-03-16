package day11;

public class Nemo {
	private int garo, sero, area;
	private int rank=1;
	
	// 기본 생성자
	public Nemo() {}
	
	public Nemo (int garo, int sero) {
		setGaro(garo);
		setSero(sero);
		setArea();
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void setArea() {
		this.area=garo*sero;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank=rank;
	}

	@Override
	public String toString() {
		return "가로  : " + garo + "\t세로 : " + sero + "\t넓이 : " + area;
	}
	
	
}
