package day08;
/*
	~ 2차원 배열 연습 ~
	3명의 학생의
	java, db, web, jsp, spring 점수를 기억할 배열을 만들고
	각 과목의 점수를 랜덤하게 만들어 입력시키시오.
	이 결과를 출력하시오.
 */
public class Test11 {
	public static void main(String[] args) {
		// 3명의 학생, 5과목 배열변수 생성
		int[][] stu=new int[3][5];
		
		// 점수 입력
		for(int i=0; i<stu.length; i++) {// 학생 선택
			for(int j=0; j<stu[i].length; j++) {// 과목 선택
				stu[i][j]=(int)(Math.random()*41+60);
			}
		}
		
		// 출력
		for (int i=0; i<stu.length; i++) {
			for(int j=0; j<stu[i].length; j++) {
				System.out.print(stu[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 총점 구하기
			// 총점 관리할 배열 만들기
		int[] total=new int[3];
		
		for(int i=0; i<stu.length; i++) {
			for(int j=0; j<stu[i].length; j++) {
				total[i]+=stu[i][j];
			}
		}
		
		// 총점 출력
		for (int no: total) {
			System.out.println("총점 : "+no);
		}
	}
}
