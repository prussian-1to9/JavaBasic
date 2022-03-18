package day15;

import java.util.*;
public class TreeSet01 {
/*
	TreeSet처럼 Tree가 붙은 애들은 정렬 가능한 애들만 올 수 있다.
	정렬이 불가능한 타입이라면, 조건을 정해주거나
	클래스 안에서 compareTo(Object o)함수를 지정해주어야 함.
 */
	public TreeSet01() {
/*		TreeSet set=new TreeSet();
		Won w1=new Won(5);
		Won w2=new Won(10);
		
		set.add(w1);
		set.add(w2);
		
		ArrayList list=new ArrayList(set);
		for(Object o : list) {
			Won w=(Won)o;
			
			System.out.println(w);
		}
		==> 에러가 나는디요..
			Won이 정렬할 수 없는 참조형 변수라 그렇심다.
			
			해결방법!
			1. TreeSet을 만들 때 정렬 방식을 알려주면서 만듦
				(Comparator 이용)
			2. Won을 정렬 가능한 클래스로 만든 후 입력
				(정렬 가능한 클래스로 만듦)
				==> Comparable 인터페이스를 구현하는 클래스로 제작
					소속함수 중 compareTo(Object o)를 override.
					
			1은 나중에 해주는거고
			2는 원래부터 정렬 가능한 클래스로 만들어주는 차이임.
 */	
		// 1. Comparator이용
		TreeSet set=new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Won w1=(Won)o1;
				Won w2=(Won)o2;
				
				int result=w1.getRad()-w2.getRad();
				return -result;
			}
		});
		Won w1=new Won(5);
		Won w2=new Won(10);
		
		set.add(w1);
		set.add(w2);
		
		// 출력
		Iterator itor=set.iterator();
		while(itor.hasNext()) {
			Won w=(Won)itor.next();
			System.out.println(w);
		}
	}
	public static void main(String[] args) {
		new TreeSet01();
	}
}
