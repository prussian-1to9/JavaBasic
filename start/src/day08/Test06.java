package day08;
/*
	샤이니 맴버들의 이름을 기억할 배열을 만들고
	이름을 입력해서 출력하시오
 */
public class Test06 {
	public static void main(String[] args) {
		// 이름 배열변수 만들기
		String[] shinee=new String[5]; // 데이터를 기억할 공간만 만들어짐
		
		// 입력
		shinee[0]="온유";
		shinee[1]="키";
		shinee[2]="민호";
		shinee[3]="종현";
		shinee[4]="태민";

		// 출력
		for(int i=0; i<shinee.length; i++) {
			System.out.println(shinee[i]);
		}
	}
}
