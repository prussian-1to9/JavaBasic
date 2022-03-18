package day15;
/*
	특정 문자열에서
	원하는 규칙에 맞는 부분만 추출하여 출력해봅쉬다~
 */
import java.util.regex.*;
public class Matcher02 {

	public Matcher02() {
		String tel="HP : 010-0825-0323";
		// 위 전화번호에서 실제 번호만 추출하여 출력하고 쉽다~
		
		// 1. 패턴 만들기
		Pattern form=Pattern.compile("01[0-9]-\\d{3,4}-\\d{4}");
		
		// 2. 검사~
		Matcher mat=form.matcher(tel);
		
		// 3. 검사 결과에서 형식에 맞는 부분 꺼내오기
		/* 자자 새로운 함수 나옵니다
			find()	: 규칙에 맞는 부분을 확인해주는 함수 (논리값)
			group()	: 규칙에 맞는 부분을 반환해주는 함수
		*/
		if (mat.find()) {
			String hp=mat.group();
			// 출력도 같이~
			System.out.println("전화번호 : "+hp);
		}
	}

	public static void main(String[] args) {
		new Matcher02();
	}
}
