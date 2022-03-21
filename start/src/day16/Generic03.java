package day16;

import java.util.*;
public class Generic03 {

	public Generic03() {
		ArrayList<Grand> list1=new ArrayList<Grand>();
		ArrayList<Mom> list2=new ArrayList<Mom>();
		ArrayList<Daugther> list3=new ArrayList<Daugther>();
		ArrayList<GDaugther> list4=new ArrayList<GDaugther>();
		
		abc(list1);
		abc(list2);
		abc(list3);
//		abc(list4); super아니고 sub class라 안됨
		
//		xyz(list1);
//		xyz(list2);	sub아니고 super class라 안됨
		xyz(list3);
		xyz(list4);
	}

	// 함수중에 이런게 있대.
	public void qwe(ArrayList<?> list) {
		// ?는 모든것을 의미, Object타입을 Generic선언한것과 같음!
	}
	
	public void abc(ArrayList<? super Daugther> list) {
		// Daugther 포함, super class 들이 파라미터로 올 수 있음.
		// (Daugther, Mom, Grand, Object)
	}
	
	// 반대는?
	public void xyz(ArrayList<? extends Daugther> list) {
		// 야는 Daugther, GDaugther가 가능하다는거여.
		// 근디 야는 인자 ArrayList<Daugther>랑도 똑겉지?
		// 그래서 잘 안쓴다는겨.
	}

	public static void main(String[] args) {
		new Generic03();
	}
}

class Grand{}

class Mom extends Grand{}

class Daugther extends Mom{}

class GDaugther extends Daugther{}