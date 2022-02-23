package day02;

public class TypeConversion {
/*
	3.14를 강제 형변환을 이용해서
	float타입 변수 pi에 기억시키고 출력하세요.
 */
	public static void main(String[] args) {
		// 변수 선언
		float pi;
		// 강제 형변환을 이용한 초기화
		pi = (float) 3.14;
		
		
		
		// 자동 형변환
		/*
		타입이 다른 두 데이터의 연산 결과는
		항상 큰 타입쪽을 따른다.
		 */
		
		double no = 3.14 + 10;
		
		// 'a'의 다섯번 째 이후 문자를 출력하세요.
		char ch = 'a';
		int num = ch + 5; //char(2)+int(4)이기 때문에 4byte인 int에 맞춤
		
		char trans_ch = (char) num;
		
		System.out.println("a의 다섯번 째 이후 문자 : " + trans_ch);
		
		
		// 리터럴 형변환
		// 3.14를 float 타입 변수 pi에 기억해보자.
		
				float Pi; //변수 선언
				
				Pi = 3.14f;
			
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
