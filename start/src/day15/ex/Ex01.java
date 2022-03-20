package day15.ex;
/*
	문제 1. ID를 입력받아
		입력받은 ID가 유효한지 아닌지 판별해주는 프로그램을 작성하시오.
		
		ID 조건
			첫글자는 영문 대문자
			그 뒤엔 영문/숫자를 사용할 수 있다.
			글자 수는 전체 5글자 이상이여야 한다.
 */
import java.util.regex.*;
import java.util.Scanner;
public class Ex01 {
	String id;
	public Ex01() {
		insertId();
		judgeIdDetail();
	}

	
	// ID 입력 메소드
	public void insertId() {
		// 스캐너 생성
		Scanner sc=new Scanner(System.in);
		
		// 입력 받기~
		System.out.println("사용할 아이디를 입력하세요");
		System.out.println("(첫글자를 영문 대문자, 5글자 이상의 영문/숫자로 구성되어야 함)");
		id=sc.nextLine();
		
		// 확인차 출력
		System.out.println("입력된 ID : "+id);
	}
	
	// ID 조건 판별
	public void judgeId() {
		// 조건 만들기
		Pattern form=Pattern.compile("[A-Z]{1}[A-Za-z0-9]{4,}");
		
		// 판별~
		Matcher mat=form.matcher(id);
		if (mat.matches()) {
			System.out.println("생성 가능한 ID입니다.");
		}else {
			System.out.println("정확한 ID를 입력해주세요.");
		}
				
	}
	
	// 조건을 좀더 디테일하게 해봅시다
	public void judgeIdDetail() {
		String[] idDetail=new String[2];
		
		idDetail[0]=id.substring(0, 1);
		idDetail[1]=id.substring(1);
		
		// 조건 생성
		Pattern form1=Pattern.compile("[A-Z]");
		Pattern form2=Pattern.compile("[0-9a-zA-Z]");
		Pattern len=Pattern.compile(".{4,}");
		
		// 판별
		Matcher mat1=form1.matcher(idDetail[0]);
		Matcher mat2=form2.matcher(idDetail[1]);
		Matcher mat3=len.matcher(idDetail[1]);
		if (!mat1.matches()) {
			System.out.println("첫 글자가 알파벳 대문자여야 합니다.");
		}else if (!mat3.find()) {
			System.out.println("ID는 5글자 이상이여야 합니다.");
		}else if (!mat2.matches()) {
			System.out.println("ID는 영문과 숫자만 사용 가능합니다.");
		}else {
			System.out.println("생성 가능한 ID입니다!");
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
