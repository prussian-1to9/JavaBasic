package day14;
// Test05 확인 후 이 클래스를 확인하시오!!
/*
	Test03에서 만든 문자열을
	줄바꿈 기호를 기준으로 분리해
	배열에 담아봅쉬달~
	
	+ 배열을 만들 때 필요한 것!
		1. 타입
		2. 개수(크기)
 */
import java.util.*;
public class Test04 {

	public Test04() {
		// 1. StringBuffer 객체 만들기
		StringBuffer buff=new StringBuffer();
			
		// 2. 반복해 결합작업 하기
		buff.append("Oh you and I 넌 유일한 나의 바다\n");
		buff.append("난 너의 눈에 잠겨\n");
		buff.append("You and I 그 안에 난 살고 싶어\n");

				
		// 3. 문자열로 변환이 필요한 순간 변환 이키마쇼!
		String whale=buff.toString();
		
		// 4. 출력
		System.out.println(whale);
		System.out.println("------------------------------\n");
//----------------------------------------------------------------
		
		// 줄바꿈기호로 분리해봅쉬다~
		StringTokenizer token=new StringTokenizer(whale, "\n");
		
		// 데이터를 담을 변수와 배열을 준비해 봅쉬다~
		int len=token.countTokens();
		String[] diveIntoYou=new String[len];
		int idx=0;
		
		// 하나씩 꺼내서 배열에 담아주겠서여~
		for (int i=0; token.hasMoreTokens(); i++) {
			// 데이터 꺼내고
			String tmp=token.nextToken();
			// .nextElement를 쓰려면
//			String tmp=(String)token.nextElement();
			diveIntoYou[i]=tmp;	// 배열에 담자~
		}
		
		// 출력
		for (String song : diveIntoYou) {
			System.out.println(song);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}
}
