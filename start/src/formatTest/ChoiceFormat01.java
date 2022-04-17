package formatTest;
/*
	학생 점수를 입력받아
	학점을 출력하는 프로그램을 작성하시오.
	
	범위
		100			: A
		99 ~ 90		: A
		89 ~ 80		: B
		79 ~ 70		: C
		69 ~ 60		: D
		59 ~ 0		: F
		
	앞자리가 다르니까, / 연산자를 이용한다.
		int score = jumsoo / 10;
		switch(score) {
		case 10:
			'A'
			break;
		case 9:
			'A'
			break;
			. . .
		default:
			'F'
		}
 */
import java.text.*;
public class ChoiceFormat01 {// Test02

	public ChoiceFormat01() {
		double[] limits = {0, 60, 70, 80, 90};
		// 주의사항 : 오름차순으로 정렬한다.
		// 점수 세팅
		String[] formats = {"F", "D", "C", "B", "A"};
		
		// formats 생성시 주의사항
		// 		limits 개수와 동일하게 만들어줘야 함.
		
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		// 랜덤 점수 발생
		int score = (int)(Math.random() * 101);
		
		// 학점 추출
		String grade = form.format(score);
		
		// 출력
		System.out.println("점수 : " + score + "\n학점 : " + grade);
	}

	public static void main(String[] args) {
		new ChoiceFormat01();
	}

}
