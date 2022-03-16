package day09;

public class Test01 {
	int no=10;
	
	// abc라는 함수 만들기~
	static void abc (int no) {
		
	}
	public static void main(String[] args) {
		abc(10);
	}
	
	void xyz() {
		int no=10;
		abc(no);
		add(10,"abc");
	}
	
	public String add(int no, String str) {
		String result=str+no;
		return result;
	}
}
