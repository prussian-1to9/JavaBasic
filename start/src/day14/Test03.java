package day14;

import java.util.StringTokenizer;
public class Test03 {
/*
	Oh you and I 넌 유일한 나의 바다
	난 너의 눈에 잠겨
	You and I 그 안에 난 살고 싶어
	
	라는 문자열을 행단위로 결합하여 처리해봅시덜~
 */
	public Test03() {
		// 변화가 심한 문자열 데이터는 String 타입보다 StringBuffer로 하는것이 유리!
		
		// 1. StringBuffer 객체 만들기
		StringBuffer buff=new StringBuffer();
		
		// 2. 반복해 결합작업 하기
		buff.append("Oh you and I 넌 유일한 나의 바다\n");
		buff.append("난 너의 눈에 잠겨\n");
		buff.append("You and I 그 안에 난 살고 싶어\n");

		
		// 3. 문자열로 변환이 필요한 순간 변환 이키마쇼!
		String whale=buff.toString();
		
		// 4. 출력
		System.out.println(whale);
		
		/*
			이 클래스는 데이터베이스 작업을 할 때
			질의 명령을 만드는 작업에 많이 사용함!
			
			ex.
				SELECT
					mno, id, email, tel, gen
				FROM
					member
				WHERE
					isshow='Y'
					
				StringBuffer buff=new StringBuffer();
				
				buff.append("SELECT ");
				buff.append("	mno, id, email, tel, gen ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow='Y' ");
				
				buff.toStirng(); 을 호출해 필요한 순간에 문자열로 변환.
		 */
	}

	public static void main(String[] args) {
		new Test03();
	}
}
