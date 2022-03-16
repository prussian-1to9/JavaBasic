package day10.sub;

import day10.*;

public class Sample01 {
	private int num1, num2, num3, num4;	// private로 은닉화
	
	// day10.Test01의 맴버변수를 읽어서 위 변수에 셋팅하는 함수
	public void setNum() {
		// 힙에 객체 만들기
		Test01 t1=new Test01();
		
//		num1=t1.no1;	no1은 private
//		num2=t1.no2;	no2는 같은 패키지(주소 기준)이여야 사용 가능.
//		num3=t1.no3;	no3는 상속받으면 사용 가능
		num4=t1.no4;	// no4는 public이라 사용 가능!
	}
}
