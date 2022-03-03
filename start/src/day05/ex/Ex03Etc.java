package day05.ex;
/*
문제 3-etc. 0~225사이의 정수 10개를 랜덤하게 만들고
	그 정수를 ascii 코드값으로 하는 문자열을 만들어
	만들어진 문자열의 문자를 하나 씩 추출해
	추출한 문자가 대문자인지 소문자인지 특수문자인지
	출력하는 프로그램을 작성하시오
	
	+ 문자열의 길이를 알아내는 방법
		int 변수=문자열.length();
*/
public class Ex03Etc {
	public static void main(String[] args) {
		// 0~225 사이의 정수 10개 만들기
		int a=(int)(Math.random()*(225-1+1)+1);
		int b=(int)(Math.random()*(225-1+1)+1);
		int c=(int)(Math.random()*(225-1+1)+1);
		int d=(int)(Math.random()*(225-1+1)+1);
		int e=(int)(Math.random()*(225-1+1)+1);
		int f=(int)(Math.random()*(225-1+1)+1);
		int g=(int)(Math.random()*(225-1+1)+1);
		int h=(int)(Math.random()*(225-1+1)+1);
		int i=(int)(Math.random()*(225-1+1)+1);
		int j=(int)(Math.random()*(225-1+1)+1);
		
		// 아스키 코드값으로 변환, 문자열 만들기
		char A=(char)a;
		char B=(char)b;
		char C=(char)c;
		char D=(char)d;
		char E=(char)e;
		char F=(char)f;
		char G=(char)g;
		char H=(char)h;
		char I=(char)i;
		char J=(char)j;
		String souwha=""+A+B+C+D+E+F+G+H+I+J;
		
		// 출력
		System.out.println("만들어진 문자열 : "+souwha+"\n");
		
		// 길이 따오기
		int length=souwha.length();
		
		// 반복문 생성
		for (int z=0; z<length; z++) {
			// 추출
			char one=souwha.charAt(z);
			
			// 판별하는 변수 생성
			String judge="특수문자";
			
			// 조건문 생성 : 소문자일 경우
			if ((one>='a')&(one<='z')) {
				judge="소문자";
				
			}else if((one>='A')&(one<='Z')){// 대문자일 경우
				judge="대문자";
			}else {// 나머지 : 특수문자일 경우
			}
			
			// 출력
			System.out.println(one+"은 "+judge+"입니다.");
		}
	}
}
