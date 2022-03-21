package day16.ex;
/*
	문제 1. 5~10사이의 정수를 랜덤하게 발생시키고
			그 수만큼의 학생의 점수를 기억하는
			HashMap을 만들어서 데이터를 기억시키시오.
			
			이 데이터를 출력할 때,
			키를 모두 추출해 꺼내는 방식으로 작업하시오.
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		// 5~10사이 정수 랜덤 발생
		int no=(int)(Math.random()*(10-5+1)+5);
		
		// 랜덤수만큼 HashMap만들어주기
		HashMap <String, Integer> map=new HashMap<String, Integer>();
		
		// 데이터 입력
		for (int i=0; map.size()<=no; i++) {
			map.put("학생"+(char)('A'+i), (int)(Math.random()*(100-60+1)+60));
		}
		
		// 키 추출
		Set<String> set=map.keySet();
		Iterator<String> itor=set.iterator();
		
		// 출력
		while (itor.hasNext()){
			String name=itor.next();
			int score=map.get(name);
			System.out.println(name+" : "+score+"점");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
