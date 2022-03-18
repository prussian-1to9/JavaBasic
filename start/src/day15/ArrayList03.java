package day15;
/*
	5~25 사이의 랜덤한 정수를 반지름으로 하는
	원을 기억할 클래스를 만들고
	
	원 10개를 리스트에 채워, 넓이 넓은 원부터 내림차순으로 정렬해
	내용을 출력하시오.
 */
import java.util.*;
public class ArrayList03 {

	public ArrayList03() {
		ArrayList list=new ArrayList();
		
		// 데이터추가
		for(int i=0; i<10; i++) {
			Won w=new Won((int)(Math.random()*21+5));
			list.add(w);	// 리스트에 채워주기~
		}
		// 출력
		System.out.println("~정렬 전~");
		for (Object o : list) {
			Won w=(Won)o;
			System.out.println(w);
		}
		System.out.println();
		
		// 내림차순 정렬해보쉐이 (무명 내부클래스 이용)
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Won w1=(Won)o1;
				Won w2=(Won)o2;
				
				double area1=w1.getArea();
				double area2=w2.getArea();
				
				// 반환값은 크기보단 부호가 중요하므로~
				int result=(area1-area2<=0)?-1:1;
				return -result;
			}
		});
		
		// 출력
		System.out.println("~내림차순 정렬 후~");
		for (Object o : list) {
			Won w=(Won)o;
			System.out.println(w);
		}
	}

	public static void main(String[] args) {
		new ArrayList03();
	}
}