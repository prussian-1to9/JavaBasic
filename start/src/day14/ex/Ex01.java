package day14.ex;
/*
	문제 1. 원의 정보를 기억할 클래스를 작성하시오.
			필요한 정보는
				반지름, 면적, 둘레
				
			Method는 변수에 접근할 수 있는 함수들.
			
			+ 반지름이 같으면 같은 원으로 처리해주는 equals
			이 클래스 타입의 변수를 출력하면 해당 원의 정보를 출력하는 함수.
*/
public class Ex01 {

	public Ex01() {
		Cir kku=new Cir(12);
		Cir nya=new Cir(9);
		
		String result=kku.equals(nya)?"같은":"다른";
		
		System.out.println(kku);
		System.out.println(nya);
		System.out.println("두 원은 "+result+" 원이다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
