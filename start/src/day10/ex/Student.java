package day10.ex;

public class Student {
	private String name;
	private int ban, no, kor, eng, math;
	// (extra)
	private int total, rank;
	private double ave;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
//--------(extra)--------------------
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	@Override
	public String toString() {
		return "[" +ban+"반 "+no+"번 "+name + "]\n"
	+"\t국어 : " + kor + "\t영어 : " + eng + "\t수학 : "+ math 
	+ "\n\t총점 : " + total + "\t평균 : " + ave + "\t석차 : " + rank;
	}
}
