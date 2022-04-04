package day15.ex;
/*
	학생 한명의 정보를 저장할 클래스를 제작하세요
	(배열 사용 금지!!)
	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고

	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
*/
import java.util.*;
public class Ex03 {
	TreeSet set=new TreeSet();
	Student[] stu=new Student[10];

	String[] name;
	int[] no;
	int[] ban;
	int[] java=new int[10];
	int[] db=new int[10];
	int[] web=new int[10];
	int[] spring=new int[10];

	public Ex03() {
		setData();
		setStu();
		toPrint();
	}

	// 데이터 만들어주기
	public void setData() {
			name=new String[] {"태일", "쟈니", "태용", "유타", "도영", "재현", "윈윈", "정우", "마크", "해찬"};
			no=new int[] {33, 29, 00, 07, 26, 77, 107, 05, 100, 58};
			ban=new int[] {127, 127, 127, 127, 127, 127, 127, 127, 825, 825};
		for (int i=0; i<10; i++) {
			java[i]=(int)(Math.random()*(100-60+1)+60);
			db[i]=(int)(Math.random()*(100-60+1)+60);
			web[i]=(int)(Math.random()*(100-60+1)+60);
			spring[i]=(int)(Math.random()*(100-60+1)+60);
		}
	}
	
	// Student 객체 생성+데이터 입력
	public void setStu() {
		// 메모리할당
		for(int i=0; i<stu.length; i++) {
			stu[i]=new Student();
		}
		
		// 객체 생성, 데이터 채워넣기
		for(int i=0; i<stu.length; i++) {
			Student s=stu[i];

			s.setName(name[i]);
			s.setBan(ban[i]);
			s.setNo(no[i]);
			s.setJava(java[i]);
			s.setDb(db[i]);
			s.setWeb(web[i]);
			s.setSpring(spring[i]);
			s.setAve();
			
			// Set에 채워주기
			set.add(s);
		}
	}
	
	// 출력
	public void toPrint() {
		Iterator itor=set.iterator();
		while(itor.hasNext()) {
			Student s=(Student)itor.next();
			System.out.println(s);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}
