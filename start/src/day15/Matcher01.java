package day15;
/*
	이름을 입력받아
	입력한 이름이 한글 이름인지를 검사하는 프로그램을 작성하시오.
	이름 글자수는 2글자에서 5글자까지만 허용
 */
import java.util.regex.*;
import java.util.*;
public class Matcher01 {

	public Matcher01() {
		Scanner sc=new Scanner(System.in);
		
		// 입력 메세지 출력
		System.out.println("이름을 입력하시오.");
		String name=sc.nextLine();
		
		// 정규형식 검사
		/*
			1. Pattern class 이용, 검사하고 싶은 정규식 문법 생성.
				(생성자가 감춰져 있어,
				소속 함수 중 속성이 static이고
				반환값 타입이 자기 자신인 함수를 찾아 사용하면 됨)
				이 클래스는 new 시켜 사용할 수 없다.
			
			2. 이 클래스에게 정규식 문법을 검사해달라 요청한다.
					matcher()
				이 함수는 검사 결과를 Matcher라는 클래스 타입으로 반환함.
				따라서 검사 결과가 이 클래스의 객체 내부에 모든 정보가 기억되어 있음.
				검사 결과를 꺼내오는 함수
					matches()
				를 사용한다.
		 */
		//-1. 패턴 턴정의
		Pattern form=Pattern.compile("[가-힣]{2,5}");
		
		//-2. 패턴 맞는지 검사
		Matcher mat=form.matcher(name);
		
		//-3. 결과 알아내기
		boolean bool=mat.matches();
				
		String result=bool?"올바른":"잘못된";
		
		// 결과 출력~
		System.out.println("입력된 이름 "+name+"은(는) "+result+" 이름입니다.");
	}

	public static void main(String[] args) {
		new Matcher01();
	}
}
