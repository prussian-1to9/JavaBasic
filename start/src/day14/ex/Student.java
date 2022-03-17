package day14.ex;

public class Student {
	private String name;
	private int ban, kor, eng, math;
	private double sum;
	
	public Student() {}

	// Getter Setter
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

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	public void setSum() {
		sum=kor+eng+math;
	}

	@Override
	public boolean equals(Object obj) {
		boolean bool=false;
		
		// 강제 형변환 후, 반/이름 따오기
		Student s=(Student)obj;
		int sban=s.getBan();
		String sname=s.getName();
		
		// 비교
		bool=(ban==sban)&(sname.equals(name));
		
		return bool;
	}

	@Override
	public String toString() {
		return ban+"반 "+name+"\n\t국어 : "+kor
				+"\n\t영어 : "+eng+"\n\t수학 : "+math+"\n\t총점 : "+sum;
	}
	
}
