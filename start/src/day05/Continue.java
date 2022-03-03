package day05;

public class Continue {
	public static void main(String[] args) {
		// 구구단 5단을 출력하지만, 곱이 5인 경우는 제외하시오.
		
		int dan=5;
		
		for(int i=0; i<9; i++) {
			int gop=(i+1);
			if (gop==5) {
				continue;
			}
			System.out.println(dan+"X"+gop+"="+(dan*gop));
		}
	}
}
