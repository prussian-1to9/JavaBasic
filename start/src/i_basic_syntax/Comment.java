package i_basic_syntax;

/**
 * 주석의 형식을 보여주기 위한 클래스입니다.
 * 
 * 해당 주석은 배포 문서에 포함되는 주석입니다.
 * @author prussian.3to3@gmail.com
 * 
 * 위와 같이 annotation도 사용 가능합니다.
 */

public class Comment {
	// 한 줄 주석
	public static void main(String[] args) { // 진입점 함수
		// 한 줄 주석 작성
		System.out.println("한 줄 주석 작성 완료");
		// 한 줄 주석 재작성 System.out.println();
		// 주석 안의 구문은 콘솔창에 print 되지 않는 것이 확인 가능합니다.
		
		/*
			여러 줄 주석
			이 안에서 작성되는 내용은 모두 주석으로 처리됩니다.
		*/
	}
}