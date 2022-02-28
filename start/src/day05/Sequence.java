package day05;
/*
	1~6을 기억하는 데이터의 배열을 만들어
	출력하시오.
	
	+ 배열이란?
		타입이 같은 데이터를 모아
		하나로 관리하게 만들어놓은 자바의 데이터 타입.
			
			데이터타입[] 변수이름=new 데이터타입[사이즈];
			==> 이 땐 데이터 값을 지정해 주어야 한다.
			
			데이터타입[] 변수이름={데이터1, 데이터2, ...};
		
		※ 한번 사이즈(갯수)가 결정되면
			추후 수정할 수 없다.
			
	+ 배열 데이터 사용하는 방법
		데이터타입 변수이름=배열변수[위치값];
	※ 이 때, 첫번째 위치값은 0이다.
		위치 값을 index라고 한다.
 */
public class Sequence {
	public static void main(String[] args) {
		int num1[]=new int[6];
		num1[0]=0;
		num1[1]=1;
		num1[2]=2;
		num1[3]=3;
		num1[4]=4;
		num1[5]=5;	// 도 되고
		
		int num2[]= {1,2,3,4,5,6}; // 도 됨!
		
		// 배열 갯수 알아내기
		int len=num1.length;
		
		// 반복문 만들기
		for(int i=0; i<len; i++) {
			System.out.println((i+1)+"번째 데이터 : "+num1[i]);
			
		}
		// 향상된 for명령으로 처리
		for(int no : num2) {
			System.out.println("###"+no);
		}
		System.out.println();
	}
}
