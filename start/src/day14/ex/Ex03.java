package day14.ex;
/*
	문제3. 학생 성적을 관리하는 클래스 Student를 작성하시오.
			기억할 내용은
				반, 이름, 국어, 영어, 수학, 총점
			을 기억하도록 하고,
	
		필요한 Method는 필요한 만큼 추가하시오. (생성자도)
		단, 학생의 반과 이름이 같으면 같은 학생으로 처리 되도록 하시오.
		학생 변수를 출력하면 모든 내용이 출력되도록 override하시오.
 */
public class Ex03 {
	Student stu1=new Student();
	Student stu2=new Student();
	
	public Ex03() {
		setData();
		
		String result=(stu1.equals(stu2))?"같은":"다른";
		
		System.out.println(stu1);
		System.out.println();
		System.out.println(stu2);
		System.out.println("\n두 학생은 "+result+" 학생이다.");
	}

	// 점수 만들기
	public void setData() {
		// 점수 먼저 채워주기! : stu1
		stu1.setBan(825);
		stu1.setName("이동혁");
		stu1.setKor((int)(Math.random()*31+70));
		stu1.setEng((int)(Math.random()*31+70));
		stu1.setMath((int)(Math.random()*31+70));
		stu1.setSum();

		// 점수 먼저 채워주기! : stu2
		stu2.setBan(825);
		stu2.setName("황인준");
		stu2.setKor((int)(Math.random()*31+70));
		stu2.setEng((int)(Math.random()*31+70));
		stu2.setMath((int)(Math.random()*31+70));
		stu2.setSum();
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
