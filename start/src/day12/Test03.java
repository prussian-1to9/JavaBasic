package day12;

public class Test03 {
	public Test03() {
		// getData 5번 가본다제www
		// 반환값 숫자에 횟수 *10 을 더해본다제
		// 결과도 출력 이쿠조
		
		// 우효~ getData() 의 결과에 따라 변환값은 강제 형변환 시켜줘야 된다구w
		for (int i=0; i<5; i++) {
			Object o= getData();
			
			int result=0;
			
			if(o instanceof Integer) {
				result=(((Integer)o)+i*10);	//unboxing : wrapper class->primitive type
			
			} else if (o instanceof String) {
				String str= (String) o;
				result= Integer.parseInt(str)+(i*10);
			}
			// 출력
			System.out.println((i+1)+"번째 결과 : "+result);
		}
		
	}
	public static void main(String[] args) {
		new Test03();
	}
	
	public Object getData() {
		// 0~2 랜덤 숫자 생성
		//	0  --> 정수 100
		//	1  --> 문자열 "100"	을 반환
		int no=(int)(Math.random()*2);
		
		Object obj=null;
		
		if (no==0) {
			obj=100;	// int->Integer->Object
		} else if (no==1) {
			obj="100";	// String->Object
		}
		return obj;
	}
}
