package day16;

import java.util.*;
public class Generic01 {
//	aespa 맴버들의 이름을 기억하는 set을 만듭시다!
//	출력도 해봅시다! 근데 이제 generic을 곁들인
	public Generic01() {
		HashSet<String> set=new HashSet<String>();
		
		set.add("카리나");
		set.add("지젤");
		set.add("윈터");
		set.add("닝닝");
		
		// for-each로 꺼내는 방법
		for(String str : set) {// 어차피 generic처리해서 다 String
			System.out.println(str);
		}
		
		// Generic은 전파되지 않는댔져?
		ArrayList <String> aespa=new ArrayList<String>(set);// 요로코롬 하면
		// generic 선언 안해주면 노란줄 뜨자나여? 얘 Object로 변경됐다고 알림주는겨.
		for(int i=0; i<aespa.size(); i++) {
			String name=aespa.get(i);
			System.out.println(name);
		}
		
		Iterator <String> itor=set.iterator();	// 얘도 해줘야함!
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}

	public static void main(String[] args) {
		new Generic01();
	}
}
