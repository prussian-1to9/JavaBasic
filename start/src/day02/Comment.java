package day02;

/**
 * 	이 클래스는 주석의 형식을 보여주기 위한 클래스
 * @author 이지쨩
 * @since 2022.02.23
 * @version v.1.0
 *
 *	참고]
 *		이 주석은 배포문서에 포함되는 주석
 *
 */
public class Comment {
	// System.out.println();
	/*
	 	클래스 블럭 바로 아래에는 일반 명령이 올 수 없다.
	 	클래스 블럭{}에 올 수 있는 것은
	 		변수, 함수
	 	뿐이다.
	 		==> '클래스는 변수와 함수로 구성된다'로 귀결 됨.
	 */
	// 진입점 함수
	public static void main(String[] args) {
	
	// 여기는 한 줄 주석~
	System.out.println("한 줄 주석 작성 끝...");
	// 다시 한 줄 주석~ System.out.println();
	
	/*
	  	여러 줄 주석
	  	이 안에서 작성되는 내용은 모두 주석으로 처리된다.
	 */
	
	int age = 27; //제니 나이 변수
	}
}
