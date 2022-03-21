package day15.ex;
/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
	10개를 TreeSet에 입력한 후
	내림차순으로 정렬해서 출력하세요.
*/
import java.util.*;
public class Ex02 {
	TreeSet num=new TreeSet(new Comparator() {
		@Override
		public int compare(Object o1, Object o2) {
			int n1=(int)o1;
			int n2=(int)o2;
			
			int result=n1-n2;
			return -result;
		}	
	});
	
	public Ex02() {
		rollRan();
		toPrint();
	}
	
	// 랜덤 롤링
	public void rollRan() {
		for(int i=0; num.size()<10; i++) {
			num.add((int)(Math.random()*98+1));
		}
	}

	// 출력
	public void toPrint() {
		Iterator itor=num.iterator();
		while(itor.hasNext()) {
			int n=(int)itor.next();
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
