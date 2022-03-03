package day07;

/*
	10개의 문자를 기억할 배열을 만들고
	A ~ J 의 알파벳을 차례로 입력하고 출력하세요.
 */
public class Test03 {
	public static void main(String[] args) {
		// 배열 변수 만들기
		char[] ch=new char[10];	//== char ch[]; ch=new char[10];
		
		for (int i=0; i<ch.length; i++) {
			// 문자 만들기
			ch[i]=(char)('A'+i);
			
			// 차례로 출력
			System.out.print(ch[i]+" ");
		}
	}
}
