package day08.ex;

import java.util.Arrays;

/*
	문제 1. 7학생의 5과목 점수를 랜덤하게 만들어 기억시키시오.
			각 학생 배열의 맨 마지막엔 총점을 계산해서 입력되게 하고
			점수, 총점과 평균을 출력하시오.
			
	extra )
		각 학생 항목에 석차도 입력되도록 하시오.
		내림차순으로 출력되게 하시오.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 배열변수 생성
		int[][] score=new int[7][7];
		// [][6]은 총점, [][7]은 석차.
		
		// 데이터 입력
		for(int i=0; i<score.length; i++) {
			//점수 입력
			for (int j=0; j<score[i].length-2; j++) {
				score[i][j]=(int)(Math.random()*(100-70+1)+70);
				
				// 총점 입력
				score[i][score[i].length-2]+=score[i][j];
			}
			// 석차 기본값 입력(extra)
			score[i][score[i].length-1]=i+1;
		}
		
		// 데이터 출력, 석차 내림차순 정렬
		for (int i=0; i<score.length; i++) {
			// 학생 출력
			System.out.print("학생"+(i+1)+" 과목별 점수 :");
			
			// 점수 출력
			for (int j=0; j<score[i].length-2; j++) {
				System.out.print(" "+score[i][j]);
			}
			System.out.println();
			
			// 총점, 평균 변수 생성
			int sum=score[i][score[i].length-2];
			int ave=sum/(score[i].length-2);
			
			// 석차 내림차순 정렬
			roll:
			for (int j=0; j<score[i].length-2; j++) {
				// 비교대상(총점) 변수 생성
				int ato=score[j][score[j].length-2];
				// 판별
				if (ato>sum) {
					// 석차 갖고 있어줄 변수 생성
					int tmp=score[i][score[i].length-1];
					// 값 뒤바꾸기
					score[i][score[i].length-1]=score[j][score[j].length-1];
					score[j][score[j].length-1]=tmp;
				}
			}
			
			// 석차 변수 생성 (extra)
			int rank=score[i][score[i].length-1];
			
			// 총점, 평균, 석차(extra) 출력
			System.out.println("\t총점 : "+sum);
			System.out.println("\t평균 : "+ave);
			System.out.println("\t석차 : "+rank+"\n");
		}
	}
}
