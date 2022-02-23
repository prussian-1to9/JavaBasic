package day02;

/**
 * 자신의 정보를 기억하고 출력하는 기능의 클래스
 * @author 이지쨩
 * @since	2022.02.23
 * @version	v.1.0
 *
 */
public class Memory {
	/*
		자신의 이름, 나이, 이름 첫 문자, 키를 변수에 기억시키고 출력하세요.
	 */
	public static void main(String[] args) {
		String name = "최이지";
		int age = 21;
		char Initial = '최';
		double height = 155.6;
		
//		System.out.println("'가' > '나' : " + ('가' > '나'));
		// 내용 출력
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("이름 첫 문자 : "+Initial);
		System.out.println("신장 : "+height);
	}
}
