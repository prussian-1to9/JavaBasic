package day13;

public class Test12 {

	public Test12() {
		String sno="7llin' in the dream";
		
		int no=0;
		/*
			sno를 정수로 변환하는 데 예외가 발생할 시,
			-999로 변환하시오.
		 */
		try {
			no=Integer.parseInt(sno);
		}catch(Exception e) {
//			e.printStackTrace();
			no=-999;
		}
		System.out.println("no : "+no);
	}

	public static void main(String[] args) {
		new Test12();
	}

}
