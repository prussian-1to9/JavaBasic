package day07.ex;
/*
	5명의 학생 이름을 기억할 배열을 만들고
	각 학생의 시험 성적(1과목)을 기억할 배열을 만들어서
	결과를 출력하는 프로그램을 작성하시오.
	
	출력 예)
		런쥔 : 323
		...
		지성 : 205
 */
public class Ex04 {
	public static void main(String[] args) {
		// 학생이름 배열변수 생성
		String[] name=new String[5];
		// 이름 집어넣기
		name[0]="제노";
		name[1]="런쥔";
		name[2]="재민";
		name[3]="천러";
		name[4]="지성";
		
		// 점수 배열변수 생성
		int[] score=new int[name.length];
		
		// 점수 생성
		for (int i=0; i<name.length; i++) {
			score[i]=(int)(Math.random()*100+1);
			// 출력
			System.out.println(name[i]+"의 점수 : "+score[i]+"점");
		}
	}
}
