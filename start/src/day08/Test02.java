package day08;
/*
	랜덤하게 5명의 학생의 점수를 만들어 배열에 기억시키고
	각 학생의 석차를 기억할 배열을 만들어
	결과를 출력하시오.
 */
public class Test02 {
	public static void main(String[] args) {
		// 점수 배열변수 만들기
		int[] score=new int[5];

		// 석차 배열변수 만들기
		int[] stu=new int[score.length];
		
		// 초기값 셋팅
		for(int i=0; i<score.length; i++) {
			stu[i]=1;
		}
		
		// 랜덤 정수 점수에 입력
		for(int i=0; i<score.length; i++) {
			score[i]=(int)(Math.random()*41+60);
		}
		
		// 석차 계산
		for(int i=0; i<score.length-1; i++) {
			
			// 비교대상 뽑아내는 반복문
			for (int j=0; j<score.length; j++) {
				if (score[j]>score[i]) {
					stu[i]++;
				}
			}
		}
		
		// 출력
		for (int i=0; i<stu.length; i++) {
			// 학생 만들어 주기
			String man=(char)('A'+i)+"";
			
			System.out.println(man+"학생 : "+score[i]+"점, "+stu[i]+"등");
		}
	}
}
