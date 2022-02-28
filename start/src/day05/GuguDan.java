package day05;
/*
	구구단 7단을 출력하시오.
 */
public class GuguDan {
	public static void main(String[] args) {
		int dan=7;
		for (int i=0; i<9; i++) {
			System.out.println(dan+"X"+(i+1)+"="+((i+1)*dan));
		}
	}
}
