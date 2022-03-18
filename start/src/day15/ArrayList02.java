package day15;

import java.util.*;

public class ArrayList02 {

	public ArrayList02() {
		// TODO ArrayList타입의 list(변수이름이 리스트)에
		// 		1~25사이의 정수 10개를 랜덤하게 만들어 채우시오.
		ArrayList list=new ArrayList();
				
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*25+1));
		}
		// 출력
		System.out.println("<정렬 전>");
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
		System.out.println("\n");
	
		// 바로 내림차순 정리를 해봅시다.
		Collections.sort(list, new DownSort());
		// 재출력
		System.out.println("<내림차순 정렬>");
		for(int i=0; i<list.size(); i++) {
			System.out.print((int)list.get(i)+" ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		new ArrayList02();
	}
}

class DownSort implements Comparator {
/*	정렬방식을 변경하기 위해선 Comparator의 sub class를 만들어야 함
	
	이 클래스는 Object의 extends이기 때문에 이미 equals()가 존재함.
	
	정렬을 할 경우엔 Comparator에게 물려받은
	compare() 함수를 override해 정렬 방식을 직접 정해서 적용 가능함
	
	이 때, 이 함수의 반환값은 정수를 반환하도록 되어 있는디
	값의 크기는 중요허지 않구, 부호가 중하다.

	결과값이 양수가 되면 두 수의 위치를 바꾸고, 음수면 그대로!
*/
	@Override
	public int compare(Object o1, Object o2) {
		// 입력된 데이터를 원래 형태로 강제 형변환
		int no1=(int)o1;
		int no2=(int)o2;
		
		int result=no1-no2;
		
		return -result;		// 원래 compare는
		//두 수의 차가 양수면 바꾸는데, 우린 역으로 내림차순 정렬을 해주니까
		// 음수면 바꾸게 부호를 뒤집어준 것임
	}
}