package day09.ex;
/*
	문제 5. 10명 학생의 국어, 영어, 수학 점수를 랜덤하게 입력해
			총점과 석차를 구하는 프로그램을 작성하시오
			
			점수 입력 함수
			총점 계산 함수
			석차 계산 함수
			내용 출력 함수
			
 */
public class Ex05 {
	public Ex05() {
		int[][] stud=new int[10][5];
		toPrint(stud);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	// 점수 입력 함수
	public void setScore(int[][] arr) {
		for(int i=0; i<arr.length; i++) {// 학생당
			for(int j=0; j<arr[i].length-2; j++) {
				arr[i][j]=(int)(Math.random()*(100-60+1)+60);
			}
			// 석차 기본 데이터 입력
			arr[i][arr[i].length-1]=1;
		}
	}
	
	// 총점 계산 함수
	public void calSum(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-2; j++) {
				arr[i][arr[i].length-2]+=arr[i][j];
			}
		}
	}
	
	// 석차 계산 함수
	public void calRank(int[][] arr) {
		// 내림차순 정렬
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[j][arr[j].length-2]>arr[i][arr[i].length-2]) {
					arr[i][arr[i].length-1]++;
				}
			}
		}
	}
	
	// 출력함수
	public void toPrint(int[][] arr) {
		setScore(arr);
		calSum(arr);
		calRank(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print("학생"+(char)('A'+i)+" 점수 :");
			for(int j=0; j<arr[i].length-2; j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
			System.out.println("\t총점 : "+arr[i][arr[i].length-2]+"\t석차 : "+arr[i][arr[i].length-1]);
			System.out.println();
		}
	}
}
