package day16.ex;
/*
	문제 2. 학생들의 과목점수를 기억하는 HashMap을 만들고
			다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하시오.
				과목 : 국어, 영어, 수학, 과학, 국사
			의 점수를 기억하도록 하세요.
 */
import java.util.*;
public class Ex02 {
	// 학생-과목Hashmap 먼저 만들기
	HashMap<String, HashMap<String, Integer>> total=new HashMap<String, HashMap<String, Integer>>();

	public Ex02() {
		setScore("아이린");
		setScore("웬디");
		setScore("슬기");
		setScore("조이");
		setScore("예리");
		
		toPrint("아이린");
		toPrint("웬디");
		toPrint("슬기");
		toPrint("조이");
		toPrint("예리");
	}

	// 학생 생성~
	public void setStu(String name) {
		if (!total.containsKey(name)) {
			total.put(name, new HashMap<String, Integer>());
		}
	}
	
	// 점수 입력~
	public void setScore(String name) {
		setStu(name);
		HashMap<String, Integer> map=total.get(name);
		
		map.put("국어", (int)(Math.random()*(100-70+1)+70));
		map.put("영어", (int)(Math.random()*(100-70+1)+70));
		map.put("수학", (int)(Math.random()*(100-70+1)+70));
		map.put("과학", (int)(Math.random()*(100-70+1)+70));
		map.put("국사", (int)(Math.random()*(100-70+1)+70));
	}
	
	// 출력 함수
	public void toPrint(String name) {
		System.out.println("["+name+"]");
		// 이름에 해당하는 데이터 꺼내주기
		HashMap <String, Integer> map=total.get(name);
		Set <String> set=map.keySet();
		Iterator <String> itor=set.iterator();
		
		while (itor.hasNext()) {
			String subject=itor.next();
			int score=(total.get(name)).get(subject);
			
			System.out.println("\t"+subject+" : "+score+"점");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
