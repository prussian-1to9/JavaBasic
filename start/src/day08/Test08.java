package day08;
/*
	"요드림 쩗쭓짧"이라는 문자열을 기억하는 변수 str를 만들고
		1. 요드림만 추출해 출력
		2. 쩗쭓짧만 추출해 출력
 */
public class Test08 {
	public static void main(String[] args) {
		// 문자열 변수
		String str="요드림 쩗쭓짧";
		
		// 잘라낸 단어 변수
		String[] w=new String[4];
		
		// 요드림 추출
		w[0]=str.substring(0,3);
		w[1]=str.substring(4,5);
		w[2]=str.substring(5,6);
		w[3]=str.substring(6);
		
		// 출력
		for (int i=0; i<4; i++) {
			System.out.println(w[i]);
		}
	}
}
