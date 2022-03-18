package day15;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList01 {

	public ArrayList01() {
		// TODO ArrayList타입의 list(변수이름이 리스트)에
		// 		1~25사이의 정수 10개를 랜덤하게 만들어 채우시오.
		ArrayList list=new ArrayList();
		
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*25+1));
		}
		
		// 출력
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
		System.out.println("\n");
		
		// 역순 정렬
		Collections.reverse(list);
		// 재출력
		System.out.println("<역순 정렬 후>");
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
		System.out.println("\n");
		
		// 오름차순 정렬해보까여?
		Collections.sort(list);
		// 재출력
		System.out.println("<오름차순 정렬 후>");
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
		System.out.println("\n");

		// 내림차순 정렬
		Collections.reverse(list);
		// 재출력
		System.out.println("<내림차순 정렬 후>");
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		new ArrayList01();
	}
}
