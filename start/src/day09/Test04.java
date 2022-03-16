package day09;

import java.util.Arrays;

/*
	다섯학생의 점수를 배열에 입력한 후
	총점을 구하는 프로그램을 작성하시오.
	
	단, 점수입력, 계산, 출력 함수로 처리하시오.
 */
public class Test04 {
	
	public Test04(){
		int[][] score=new int[5][4];
		// 점수 만들기
		makeArr(score);
		
		// 총점 구하기
		for (int i=0; i<score.length; i++) {
			setTotal(score[i]);
		}
		
		// 출력
		toPrint(score);
	}
	
	public static void main(String[] args) {
		new Test04();
	}

	// 배열에 점수 채워주기~
	// 데이터 값만 변경시켜주는거니까 void여도 됨!
	public void makeArr(int[][] stud) {
		for(int i=0; i<stud.length; i++) {
			
			for (int j=0; j<stud[i].length-1; j++) {
				stud[i][j]=(int)(Math.random()*41+60);
				
				// 총점에 누적
				stud[i][stud[i].length-1]+=stud[i][j];
			}
		}
	}
	
	// 총점 계산해서 셋팅해주는 함수
	public void setTotal(int[] score) {
		int sum=0;
		for (int i=0; i<score.length-1; i++) {
			sum+=score[i];
		}
		score[score.length-1]=sum;
	}
	
	// 출력하는 함수
	public void toPrint(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print("학생"+(char)('A'+i)+"의 점수 :");
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
