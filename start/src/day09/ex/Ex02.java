package day09.ex;
/*
	문제 2. 반지름 하나를 랜덤하게 입력한 후
			원의 넓이
			원의 둘레
			를 계산해 출력하는 프로그램을 작성하시오.
			
			1. 반지름 랜덤생성 함수
			2. 넓이 계산 함수
			3. 둘레 계산 함수
			4. 출력 함수
			를 각각 만들어 작성하시오.
 */
public class Ex02 {
	public Ex02() {
		int r=makeR();
		toPrint(r);
	}
	public static void main(String[] args) {
		new Ex02();
	}

	// 반지름 랜덤생성 함수
	public int makeR() {
		int no=(int)(Math.random()*45+1);
		return no;
	}
	
	// 넓이 계산 함수
	public double area(int no) {
		double area=no*no*3.14;
		return area;
	}
	
	// 둘레 계산 함수
	public double cir(int no) {
		double cir=3.14*2*no;
		return cir;
	}
	
	// 출력 함수
	public void toPrint(int no) {
		System.out.println("랜덤 생성된 반지름 : "+no);
		System.out.println("넓이 : "+area(no)+"\t둘레 : "+cir(no));
	}
}
