package day08;
/*
	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들어
	'A'~'J'를 랜덤하게 100번 만들고
	배열에 카운트를 기억시켜, 결과를 출력하시오.
 */
public class Test12 {
	public static void main(String[] args) {
		// 문자10개, 문자당 데이터 2개씩
		int[][] munja=new int[10][2];
		
		// 문자 입력~
		for (int i=0; i<munja.length; i++) {
			munja[i][0]='A'+i;
		}
		
		// 랜덤하게 문자 100번 발생~
		for (int i=0; i<100; i++) {
			int num=(int)(Math.random()*('J'-'A'+1)+'A');
			// 카운트 올려주기
			int idx=num-'A';
			munja[idx][1]++;
		}
		
		// 결과 출력
		for (int i=0; i<munja.length; i++) {
			System.out.println((char)munja[i][0]+" : "+munja[i][1]+"번 뽑힘");
		}
	}
}
