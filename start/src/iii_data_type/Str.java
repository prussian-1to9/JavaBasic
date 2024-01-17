package iii_data_type;

/**
 * 	문자열(String) 변수를 생성하는
 * 	두 가지 방법에 대해 설명하는 클래스입니다.
 */
public class Str {
	public static void main(String[] args) {
		// 문자열 변수를 만드는 방법
		
		// 1. 데이터를 직접 입력해서 만드는 방법
		String name1 = "홍길동";

		// 2. 클래스를 new시켜서 만드는 방법
		String name2 = new String("홍길동");
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name1 == name2 : " + (name1 == name2));
		
		// 데이터 주소가 stack/heap으로 다르기 때문에 같다고 인식하지X
	}
}
