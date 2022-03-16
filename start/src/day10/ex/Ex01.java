package day10.ex;
/*
	문제 1. 다음 변수를 가지는 Student 클래스를 제작하시오.
			
			String name;
			int ban, no, kor, eng, math;
			
			1. 클래스 만들기
			2. Ex01 클래스에서
				 한 명의 데이터를 입력해 출력하기
				 5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고 어쩌고..!
				 
			방법 두 가지
				 1. 한 개의 함수 내에서 처리하기!
				 2. 기능별로 분리해서 함수 만들고 처리!
				 
			extra)
				int total, rank;
				double ave;
 */
public class Ex01 {
	// 전역변수 만들어주기
	int ban;
	int[] no=new int[5];
	int[] kor=new int[5];
	int[] eng=new int[5];
	int[] math=new int[5];
	String[] name;
	// extra
	int[] total=new int[5];
	int[] rank=new int[5];
	double[] ave=new double[5];
	
	public Ex01() {
		// 학생 배열변수 만들기
		Student[] bigbang=new Student[5];
		
		// 데이터 입력
		setData();
		rollRank();
		bigbang=insert();
		
		// 출력
		toPrint(bigbang);
	}
	
	// 데이터 초기화
	public void setData () {
		// 고정 데이터 입력
		ban=819;
		name= new String[] {"최승현", "권지용", "동영배", "강대성", "이승현"};
		
		// 랜덤 데이터 입력
		for (int i=0; i<5; i++) {
			kor[i]=(int)(Math.random()*(100-50+1)+50);
			eng[i]=(int)(Math.random()*(100-50+1)+50);
			math[i]=(int)(Math.random()*(100-50+1)+50);
			no[i]=(int)(Math.random()*20+1);
			
			// extra 데이터 입력
			total[i]=(kor[i]+eng[i]+math[i]);
			ave[i]=total[i]/3;
			rank[i]=1;
		}
	}
	
	// 석차 내림차순 정리
	public void rollRank () {
		for (int i=0; i<total.length; i++) {
			for (int j=0; j<total.length; j++) {
				if (total[j]>total[i]) {
					rank[i]++;
				}
			}
		}
	}
	
	// 데이터 입력 함수
	public Student[] insert() {
		rollRank();
		Student[] stu=new Student[5];
		
		// 객체 생성
		for (int i=0; i<5; i++) {
			stu[i]=new Student();
			
		}
		
		for (int i=0; i<stu.length; i++) {
			Student s=stu[i];
			
			s.setName(name[i]);
			s.setBan(ban);
			s.setNo(no[i]);
			s.setKor(kor[i]);
			s.setEng(eng[i]);
			s.setMath(math[i]);
			s.setTotal(total[i]);
			s.setAve(ave[i]);
			s.setRank(rank[i]);
		}
		return stu;
	}
	// 출력 함수
	public void toPrint (Student[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i].toString());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
