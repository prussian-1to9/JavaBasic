package day14;
/*
	문자열 데이터
		"카리나,지젤,윈터,닝닝"
		
	을 ,를 기준으로 분리하여 출력해봅시덜~
 */
import java.util.StringTokenizer;
public class Test05 {

	public Test05() {
		String aespa="카리나,지젤,윈터,닝닝";
		
		// ,를 기준으로 자르기~
		StringTokenizer token=new StringTokenizer(aespa, ",");
		/*
			이렇게 객체가 만들어지면
			잘려진 결과는 버퍼 메모리(임시 메모리)에 기억되고
			하나씩 꺼내서 사용해야 하는디
			
			주의사항!:한번 꺼낸 데이터는 즉시 메모리에서 사라짐!
			-> 결과를 사용하려면, 변수나 배열 등에 기억시켜야 함.
		 */
		
		int len=token.countTokens();	// 잘려진 데이터의 개수를 변환해주는 함수
		
		// 데이터를 기억할 배열
		String[] aeaespa=new String[len];
		
		// 인덱스 변수 만들기
		int idx=0;
		
		// 하나씩 꺼내 출력
		while(token.hasMoreTokens()) {
			// token.hasMoreTokens() : 임시 메모리에 꺼낼 문자열이 있는지 여부를 논리값으로 반환
			// token.hasMoreElements() : 임시 메모리에 꺼낼 객체가 있는지 여부를 논리값으로 반환
			
			// 한번 꺼낸 데이터는 사라진다. (다시 접근해 쓸 수 없다)
			// 출력만 할 예정이므로 출력만 합쉬다~
			String ae=token.nextToken();
			
			// 배열에 기억시켜보자!
			aeaespa[idx]=ae;
			// 인덱스 증가
			idx++;
			
			// 출력
			System.out.println(ae);
		}
		
		System.out.println("*************************");
		// 두번 출력이 될까?
		while(token.hasMoreTokens()) {
			String ae=token.nextToken();
			System.out.println(ae);
		}
		// 안되죵. 이미 임시메모리엔 아무것도 없어서
		// hasMoreTokens 값이 false니까용.
		
		// 기억된 배열 출력해보기
		for (String name : aeaespa) {
			System.out.print(name+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}
