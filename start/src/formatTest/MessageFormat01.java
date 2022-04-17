package formatTest;

import java.text.*;
import java.util.ArrayList;
public class MessageFormat01 {// Test04

	public MessageFormat01() {
		// INSERT 명령 관련 format을 만들어보자.
		MessageFormat form = new MessageFormat("INSERT INTO emp VALUES ( {0}, {1}, {2})");
		
		/*
			동일한 내용은 그대로, 변화되는 부분은 {0}, {1}, {2} 등으로 기록.
			번호는 입력되는 데이터 순서다.
		 */
		Object[] data1 = {1234, "카리나", "karina"};
		Object[] data2 = {1234, "지젤", "giselle"};
		Object[] data3 = {1234, "윈터", "winter"};
		Object[] data4 = {1234, "닝닝", "ning_ning"};
		
		String memb1 = form.format(data1);
		String memb2 = form.format(data2);
		String memb3 = form.format(data3);
		String memb4 = form.format(data4);
		
		ArrayList<String> list = new ArrayList();
		
		list.add(memb1);
		list.add(memb2);
		list.add(memb3);
		list.add(memb4);
		
		/* 꺼내서 출력
		for (String sql : list) {
			System.out.println(sql);
		}
		*/
		
		// list에서 변화되는 데이터만 추출하고 싶다!
		String karina = list.get(0);
		
		Object[] result1 = null;
		// 예외가 발생할 수 있다!
		try {
			result1 = form.parse(karina);
			
			// 출력
			for(int i = 0; i<result1.length; i++) {
				System.out.println((i + 1) + "번째 데이터 : " + result1[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MessageFormat01();
	}
}
