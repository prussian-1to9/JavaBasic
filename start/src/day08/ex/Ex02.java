package day08.ex;
/*
	문제 2. Ex01에서 만든 배열의 내용을
			다섯과목의 7학생의 배열로 바꾸어 해결하시오.
	
	출력 예시)
		과목1 : 점수 점수 점수 점수
			과목1 총점 : 점수	평균 : 점수
		...
		학생1 총점 : 점수	평균 : 점수
 */
public class Ex02 {
	public static void main(String[] args) {
		// 5개 과목(+평균)당 7명 학생 배정+과목 총점
		int[][] score=new int[6][8];
		
		// 점수 입력
		for (int i=0; i<score.length-1; i++) {
			System.out.print("과목"+(i+1)+" 학생당 점수 :");
			for (int j=0; j<score[i].length-1; j++) {
				// 과목 점수 입력 및 출력
				score[i][j]=(int)(Math.random()*(100-70+1)+70);
				System.out.print(" "+score[i][j]);
				
				// 과목 총점 입력
				score[i][score[i].length-1]+=score[i][j];
				
				// 학생 총점 입력, 변수 생성
				score[score.length-1][j]+=score[i][j];
			}
			System.out.println();
			
			// 과목 총점, 평균 생성
			int sum=score[i][score[i].length-1];
			int ave=sum/(score[i].length-1);
			
			// 과목 총점, 평균 출력
			System.out.println("\t총점 : "+sum+"\t평균 : "+ave+"\n");
		}
		
		// 학생 총점, 평균 변수 생성
		for (int i=0; i<score.length; i++) {
			int stuSum=score[score.length-1][i];
			int stuAve=stuSum/(score.length-1);
			
			// 출력
			System.out.println("학생"+(i+1)+" 총점 : "+stuSum+"\t평균 : "+stuAve);
		}
	}
}
