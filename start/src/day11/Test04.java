package day11;
/*
	삼각형 클래스와 사각형 클래스를 각각 객체로 만들어
	내용을 출력해 봅시다.
 */
import static java.lang.Math.*;
public class Test04 {
	public Test04() {
		Samgak sam=new Samgak((int)(random()*21+5),(int)(random()*21+5));
		Sagak nemo=new Sagak((int)(random()*21+5),(int)(random()*21+5));
		
		System.out.printf("밑변이 %3d, 높이가 %3d, 넓이가 %6.2f인 삼각형\n"
				, sam.getWidth(), sam.getHeight(), sam.getArea());
		System.out.printf("가로가 %3d, 세로가 %3d, 넓이가 %6.2f인 사각형\n"
				, nemo.getWidth(), nemo.getHeight(), nemo.getArea());
		
		Figure f1=sam;	// Figure엔 getWidth(), getHeight 메소드가 없음.
						// Figure타입의 변수가 될 경우 두 함수를 호출 할 수없다.
		Figure f2=nemo;
		
		System.out.printf("넓이가 %3.2f인 삼각형\n", f1.getArea());
		System.out.printf("넓이가 %3.2f인 사각형\n", f2.getArea());
		// 내용은 나오는디 함수호출은 못함!
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}
