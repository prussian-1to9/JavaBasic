package day08;

import java.util.Arrays;

/*
	점수 5개를 기억할 배열을 만들고
	데이터를 채워둔 후
	1~3번 방의 데이터만
	다른 배열에 깊은 복사를 해보자.
	(단, 복사될 배열은 길이를 10으로 하시오)
 */
public class Test04 {
	public static void main(String[] args) {
		// 배열 만들기
		int[] fox= {10, 20, 30, 40, 50};
		int[] bear=new int[10];
		
		// 깊은 복사
		System.arraycopy(fox, 0, bear, 0, 3);
		
		// 배열 내용 출력
		System.out.println("fox : "+Arrays.toString(fox));
		System.out.print("bear : "+Arrays.toString(bear));
	}
}
