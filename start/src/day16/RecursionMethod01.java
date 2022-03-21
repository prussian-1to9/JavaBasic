package day16;

public class RecursionMethod01 {
/*	재귀 호출함수 (or 재귀함수, recursion)
	
	반드시, 호출 종료지점을 지정해줘야 함.
*/
	public RecursionMethod01() {
		System.out.println("1부터 50까지 합 : "+getSum(50));
	}
	
	public int getSum(int n) {
		if(n<1) {
			return 0;
		}else {
			return n+getSum(n-1);
		}
	}

	public static void main(String[] args) {
		new RecursionMethod01();
	}
}
