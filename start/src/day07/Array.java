package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
			정수 6개를 관리할 배열 arr를 만들고
			1~6까지 채워서
			한 개식 꺼내, 출력하세요.
		 */

		// 배열 변수 선언
		int[] arr;
		
		// 배열 변수 초기화
		arr=new int[6];
		
		// 출력
		// + 배열의 길이를 알아내는 방법 : 배열.length;
		int len=arr.length;
		for (int i=0; i<len; i++) {
			// 배열에 기억된 데이터 꺼내는 방볍 : 배열변수 [index];
			int no=arr[i];
			
			System.out.println(no);
			
			/*
				Help에 만들어지는 기본 데이터타입 변수들은
				모두 자동초기화 된다.
					boolean : flase
					char	: 아스키 코드값 0
					정수형	: 0
					실수형	: 0.0
			 */
		}
		
		/*  엔시티 드림 이름을 기억할 배열을 만들어 출력하세요.
			엔드림은 7명입니다.
			재민, 지성, 런쥔, 제노, 천러, mark and 이동혁.
		*/
		
		String[] nctDream=new String[7];
		
		// 출력
		for (int i=0; i<nctDream.length; i++) {
			// int len=nctDream.length
			System.out.println(nctDream[i]);
		}
		
		// 맴버 이름 추가
		nctDream[0]="재민";
		nctDream[1]="지성";
		nctDream[2]="런쥔";
		nctDream[3]="제노";
		nctDream[4]="천러";
		nctDream[5]="mark";
		nctDream[6]="이동혁";
		
		// 출력
		System.out.println(Arrays.toString(nctDream));
		
		// 데이터를 하나씩 꺼내서 출력
		for (int i=0; i<nctDream.length; i++) {
			/*
				+ 여러개의 데이터를 관리하는 데이터 타입들은
				데이터 한 개를 꺼냈을 때
				그 데이터 타입을 먼저 생각해야 한다.
			 */
			// i번째 맴버의 이름을 꺼내서 변수에 기억
			String name=nctDream[i];
			
			// 출력
			System.out.println(name);
		}
		
		// 명예 엔드림 맴버를 추가해 출력하세요.
		/*
			+ 배열을 한번 만들어지면 크기와 타입을 수정할 수 없다.
			따라서 배열 크기의 수정이 필요하면
			배열을 다시 만들어야 한다.
		 */
		
		// 배열을 다시 만들고
		String[] royalnDream=new String[8];
		
		for (int i=0; i<7; i++) {
			royalnDream[i]=nctDream[i];
		}
		// 이렇게 하면 나머지 방은 아직 비어있다.
		royalnDream[7]="태일";
		
		nctDream=royalnDream;
		
		// 하나씩 꺼내서 출력
		// 배열과 같은 데이터는 향상된 for 명령이 데이터를 꺼내 사용하는데 편하다.
		for (String name : nctDream) {
			// 의미 : nct dream의 데이터를 순차적으로 하나씩 꺼내, name변수에 기억시키세요
			
			// 출력
			System.out.print(name+" ");
		}
		System.out.println();
		
		// (참고용) 향상된 for 명령 사용
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("재민");
		list.add("지성");
		list.add("런쥔");
		list.add("제노");
		list.add("천러");
		list.add("mark");
		list.add("이동혁");
		
		// 출력
		for(String name : list) {
			System.out.print(name+" | ");
		}
	}
}