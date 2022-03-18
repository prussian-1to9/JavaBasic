package day15;

import java.util.*;
public class TreeSet02 {
/*
	삼각형의 정보를 기억하는 Semo 클래스를 만들고!
	15개의 삼각형을 높이가 큰 삼각형 부터 정렬되게 저장되도록
	TreeSet을 만들고
	내용을 출력하쉐이~
	
	이 예제에선 Semo 클래스에서 정렬 기준을 만들어 저장합니당.
 */
	public TreeSet02() {
		TreeSet set=new TreeSet();
		while(true) {
			Semo s=new Semo((int)(Math.random()*21+5), (int)(Math.random()*21+5));
		
			set.add(s);
			
			// 15개 채우면 break
			if (set.size()==15) {
				break;
			}
		}
		
		// 출력
		ArrayList list=new ArrayList(set);
		for(Object o : list) {
			Semo ss=(Semo)o;
			System.out.println(ss);
		}
	}

	public static void main(String[] args) {
		new TreeSet02();
	}
}
