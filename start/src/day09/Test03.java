package day09;
/*
	5개의 숫자를 배열로 입력받아 더하는 프로그램을 작성하세요.
	
	단, 입력, 계산, 출력은 함수로 처리하시오.
 */
public class Test03 {
	public Test03() {
		// 배열 생성 및 입력
		int[] a=getArr();
		
		// 출력
		toPrint(a);
	}
	public static void main(String[] args) {
		new Test03();
	}
	// 실행되면 5개의 정수를 관리하는 배열을 완성해 반환시켜주는 함수
	public int[] getArr() {
		// 반환값 변수
		int[] arr=new int[5];
		
		// 배열 채우기
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*99+1);
		}
		
		// 반환값 반환
		return arr;
	}
	// 계산해줄 함수
	public int addAll(int[] arr) {
		// 반환값 변수
		int sum=0;
		
		// 계산
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		// 반환값 반환
		return sum;
	}
	
	// 출력해줄 함수
	public void toPrint(int[] arr) {
		// 배열 내용 출력
		System.out.print("입력된 배열 : ");
		for (int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		// 합 출력
		System.out.println("배열의 총합 : "+addAll(arr));
	}
}
