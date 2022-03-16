package day13;

public class Test08 {

	public Test08() {
		abc();
	}

	public void abc() {
		int no1=25;
		int no2=0;
		int result=0;
		
		try {
			result=no1/no2;
		}catch(Exception e) {
			System.out.println("[예외 발생]");
			return;
		}finally {
			System.out.println("this is finally world");
		}
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
