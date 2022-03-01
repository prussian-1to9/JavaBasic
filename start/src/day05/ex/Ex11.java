package day05.ex;

/*
	문제 11. 2x +4y=10의 방정식의 해를 구하시오.
	(단, x y는 모두 0<=x,y<=10 사이의 정수.)
 */
public class Ex11 {
	public static void main(String[] args) {
		// 안내 문구 출력
		System.out.println("2x+4y=10의 해 x, y의 경우의 수를 출력합니다.\n"
				+"(단, x, y는 모두 0부터 10 사이의 정수)");
		
		// x에 대한 반복문 생성
		for (int x=0; x<11; x++) {
			// y에 대한 반복문 생성
			for (int y=0; y<11; y++) {
				
				// 조건문 생성 및 출력
				if ((2*x)+(4*y)==10) {
					System.out.println("x="+x+"	y= "+y);	
				}
			}
		}
	}
}
