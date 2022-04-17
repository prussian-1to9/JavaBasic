package formatTest;

import java.text.*;
public class ChoiceFormat02 {// Test03

	public ChoiceFormat02() {// Test03
		/*
			ChoiceFormat을 만들 때 limits와 format을 하나로 만들 수 있다.
			형식
				60#D		: <=의 의미
				70<C		: < 의 의미
				
			이것을 | (OR)를 이용해, 연결해서 사용한다.
		 */
		try {
			// 위 형식을 이용해 패턴 만들기
			String pattern = "0#F|60#D|70#C|80#B|90<A";
			ChoiceFormat form = new ChoiceFormat(pattern);
			
			// 점수 입력
			int score = 90;
			String grade = form.format(score);
			
			// 출력
			System.out.println("점수 : " + score + "\n학점 : " + grade);
			
		}catch(Exception e) {e.printStackTrace();}
	}

	public static void main(String[] args) {
		new ChoiceFormat02();
	}

}
