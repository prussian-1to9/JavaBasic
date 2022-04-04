package day08;

import java.util.Arrays;

/*
	얕은 복사의 특징
		Heap영역에 있는 데이터는 프로그램이 종료할 때까지 살아남는다.
 */
public class Test03 {
	int[]no;
	public void setNo() {
		for(int i=0; i<no.length; i++) {
			no[i]=(int)(Math.random()*99+1);
		}
	}
	
	public static void main(String[] args) {
		int[] a;
		{
			int[] b;
			// b 변수는 블럭 안에서 만들어진 변수이므로,
			// 블럭을 벗어나면 사라지는 변수이다.
			
			b=new int [5];
			// new 라는 명령으로 계열을 만들고,
			// 변수에 기억 시켰으나
			// 이 영역이 닫히면 변수가 사라지는 건 같다.
			
			b[2]=500;
			
			// 얕은복사
			a=b;
			
			a[2]=1000;
			System.out.println("b[2] : "+b[2]);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
