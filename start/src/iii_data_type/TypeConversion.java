package iii_data_type;

/**
 * 	원주율(pi) 3.14..., 오일러상수(e) 2.718...를 이용하여
 * 	형변환을 설명하는 클래스입니다.
 */
public class TypeConversion {
	public static void main(String[] args) {
		// ========== [0. 변수 pi 준비] ==========
		float pi; // 변수만 선언
		pi = (float) 3.14; // 강제 형변환 구문 맛보기
		
		/* ========== [1. 자동 형변환] ==========
			타입이 다른 두 데이터의 연산을 시도할 경우,
			메모리 할당량이 큰쪽에 맞춰지는것을 확인할 수 있습니다.
		*/
		// 출력 테스트용 코드
		System.out.println("data type of (pi) : " + ((Object) pi).getClass().getSimpleName()); // Float
		System.out.println("data type of (pi + 10) : " + ((Object) (pi + 10)).getClass().getSimpleName()); // Float

		/* ========== [2. 강제 형변환] ==========
		구문]	(데이터타입) 값
		
		작은 데이터 타입 -> 큰 데이터 타입	: 가능
		큰 데이터 타입 -> 작은 데이터 타입	: 불가능

		ex]
			char(1byte) -> int(4byte)	: O
			float(8byte) -> int(4byte)	: X
		*/
		char ch = 'a'; // char : 1byte

		// 숫자 더하기 : a의 15번째 이후의 문자
		int num = ch + 15; // ascii 코드 값으로 변환
		
		// 다시 문자열로 강제 형변환
		char trans_ch = (char) num;

		System.out.println("a + 15 (int) : " + num);
		System.out.println("강제 형변환된 문자열 : " + trans_ch);

		/* ========== [3. 리터럴 형변환] ==========
		literal(문자형 구문)을 사용하여 데이터 타입을 눈에 띄게 만들 수도 있습니다.
		*/
		float E; //변수 선언
		E = 2.718f;
			/*
				c.f.
					개발자가 입력하는 정수형 데이터는
					특별한 조작 없이 모든 데이터형이 기억될 수 있다.
					
					ex.
						int a = 100;
						byte b = 100;
						short c = 100;
						long d = 100;			==> 모두 가능!
			 */
	}
}
