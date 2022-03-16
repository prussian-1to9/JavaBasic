package day09.ex;
/*
	문제 3. 사각형의 넓이를 계산하는 프로그램을 작성하시오.
		
		길이를 랜덤하게 만들어주는 함수
		넓이 계산 함수
		내용 출력 함수
 */
public class Ex03 {
	
	public Ex03() {
		int width=setLength();
		int hight=setLength();
		
		toPrint(width, hight);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	// 길이 랜덤하게 만들어주는 함수
	public int setLength() {
		int no=(int)(Math.random()*45+1);
		return no;
	}
	
	// 넓이 계산 함수
	public int area(int no1, int no2) {
		int area=no1*no2;
		return area;
	}
	
	// 출력 함수
	public void toPrint(int no1, int no2) {
		System.out.println("랜덤 생성된 가로 : "+no1+"\t세로 : "+no2);
		System.out.println("\t넓이 :"+area(no1, no2));
	}
}
