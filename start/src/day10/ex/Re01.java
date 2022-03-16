package day10.ex;
/*
문제 1. 다음 변수를 가지는 Student 클래스를 제작하시오.
		
		String name;
		int ban, no, kor, eng, math;
		
		1. 클래스 만들기
		2. Ex01 클래스에서
			 한 명의 데이터를 입력해 출력하기
			 7명의 데이터를 배열로 만들어 데이터 입력하고 출력하고 어쩌고..!
			 
		방법 두 가지
			 1. 한 개의 함수 내에서 처리하기!
			 2. 기능별로 분리해서 함수 만들고 처리!
			 
		extra)
			int total, rank;
			double ave;
*/
public class Re01 {
	// 전역변수 만들기
	String[] name;
	int ban;
	int[] no=new int[7];
	int[] kor=new int[7];
	int[] eng=new int[7];
	int[] math=new int[7];
	// extra
	int[] total=new int[7];
	double[] ave=new double[7];
	int[] rank=new int[7];
	
	public Re01() {
		// 배열변수 생성
		Student[] nDream=new Student[7];
		
		// 데이터 입력
		rollRank();
		nDream=insert(nDream);
		toPrint(nDream);
	}
	
	// 데이터 초기화
	public void setData() {
		// 고정 데이터 입력
		name=new String[] {"이민형", "황인준", "이제노", "이동혁", "나재민", "종천러", "박지성"};
		ban=825;
		
		// 랜덤 데이터 입력
		for (int i=0; i<7; i++) {
			kor[i]=(int)(Math.random()*(100-70+1)+70);
			eng[i]=(int)(Math.random()*(100-70+1)+70);
			math[i]=(int)(Math.random()*(100-70+1)+70);
			// extra
			total[i]=kor[i]+eng[i]+math[i];
			ave[i]=total[i]/3.;
			rank[i]=1;
		}
	}
	
	// 석차 내림차순 정리
	public void rollRank() {
		setData();
		for (int i=0; i<7; i++) {
			for (int j=0; j<7; j++) {
				if (total[j]>total[i]) {
					rank[i]++;
				}
			}
		}
	}
	
	// 데이터 입력
	public Student[] insert(Student[] arr) {
		Student[] dr=new Student[7];
		
		// 객체화
		for (int i=0; i<dr.length; i++) {
			dr[i]=new Student();
		}
		
		// 입력
		for (int i=0; i<dr.length; i++) {
			Student d=dr[i];
			
			d.setName(name[i]);
			d.setBan(ban);
			d.setNo(no[i]);
			d.setKor(kor[i]);
			d.setEng(eng[i]);
			d.setMath(math[i]);
			// extra
			d.setTotal(total[i]);
			d.setAve(ave[i]);
			d.setRank(rank[i]);
		}
		
		// 반환
		return dr;
	}
	
	// 출력
	public void toPrint(Student[] arr) {
		for (Student n : arr) {
			System.out.println(n.toString());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Re01();
	}
}
