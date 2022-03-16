package day09;
/*
	두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어 실행하세요.
 */
public class Test05 {
	public Test05() {
		int no1=getInt();
		int no2=getInt(1,10);
		int result=plus(no1, no2);
		
		toPrint(no1, no2, result);
		toPrint(no1, no2);
	}
	public static void main(String[] args) {
		new Test05();
	}
	
	// 랜덤 정수 만드는 함수
	public int getInt() {
		int no=(int)(Math.random()*10+1);
		return no;
	}
	
	// 범위를 입력하면 랜덤하게 범위 안의 정수를 만드는 함수
	public int getInt(int pos1, int pos2) {
		int min=(pos1<pos2)?pos1:pos2;
		int max=(pos1>pos2)?pos1:pos2;
		int no=(int)(Math.random()*(max-min+1)+min);
		return no;
	}
	
	// 두 수 더해서 반환해주는 함수
	public int plus(int no1, int no2) {
		return (no1+no2);
	}
	
	// 출력함수 1
	public void toPrint(int no1, int no2, int result) {
		System.out.println(no1+"+"+no2+"="+result);
	}
	// 출력함수 2
	public void toPrint(int no1, int no2) {
		System.out.println(no1+"+"+no2+"="+plus(no1, no2));
		// 이 경우, 먼저 add함수를 호출한 후 문자열을 만든다.
	}
}
