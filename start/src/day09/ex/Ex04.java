package day09.ex;
/*
	문제 4. 1차원 배열에 랜덤 정수 10개 입력한 후
		합계와 평균을 구해주는 프로그램을 작성하시오.
		
		배열에 랜덤정수 채워주는 함수
		합계를 계산해주는 함수
		평균을 계산해주는 함수
		내용 출력 함수
 */
public class Ex04 {
	public Ex04() {
		int[] score=new int[10];
		setNum(score);
		
		toPrint(score);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	
	// 배열에 랜덤 정수 채워주는 함수
	public void setNum(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*(100-60+1)+60);
		}
	}
	
	// 합계를 계산해주는 함수
	public int calSum(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	// 평균 계산해주는 함수
	public int calAve(int[] arr) {
		int ave=calSum(arr)/arr.length;
		return ave;
	}
	
	// 내용 출력 함수
	public void toPrint(int[] arr) {
		System.out.print("랜덤 생성된 점수 :");
		for (int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		System.out.print("\t총점 : "+calSum(arr)+"\t평균 : "+calAve(arr));
	}
}
