package day16;

/*
	학생들의 점수를 기억하는 Map을 만듭쉬다~
 */
import java.util.*;

public class Generic02 {

	public Generic02() {
		HashMap<String, Integer> student = new HashMap<String, Integer>();

		student.put("이동혁", 66);
		student.put("황인준", 100);
		student.put("나재민", 93);
		student.put("이제노", 63);

		// 키값만 꺼내봅시다.
		Set set = student.keySet();

		// 키와 데이터 동시에 꺼내보자~
		Set<Map.Entry<String, Integer>> ent = student.entrySet();

		// Iteraor로 변환~
		Iterator<Map.Entry<String, Integer>> itor = ent.iterator();
		while (itor.hasNext()) {
			Map.Entry<String, Integer> stud = itor.next();
			int score = stud.getValue();
			String name = stud.getKey();

			System.out.println(name + " : " + score + "점");
		}
	}

	public static void main(String[] args) {
		new Generic02();
	}

}
