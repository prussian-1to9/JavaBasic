package day16;

public class Student {
	private String name;
	private int java, db, web, spring, sum;
	private double ave;
	
	public Student() {}
	public Student(String name, int java, int db, int web, int spring) {
		this.name=name;
		this.java=java;
		this.db=db;
		this.web=web;
		this.spring=spring;
		setSum(java+db+web+spring);
		setAve(sum/4.);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	
	@Override
	public String toString() {
		return String.format("%5s]\n\tjava : %3d\n\tDB : %3d\n\tWeb : %3d\n\tSpring : %3d\n\t총점 : %3d\t평균 : %6.2f", 
				name, java, db, web, spring, sum, ave);
	}
}
