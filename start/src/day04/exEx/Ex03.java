package day04.exEx;
/*
게시물을 게시판에 출력할 때, 
페이지당 게시물 15개를 출력할 예정이다.

개시물 수를 랜덤하게 발생시키고, 
몇 페이지가 필요한지 계산해서 출력해주는 프로그램을 작성하시오

+ 게시물이 없는 경우, 게시물이 없는 페이지가 적어도 1페이지는 필요하다.
*/
public class Ex03 {
	public static void main(String[] args) {
		// 랜덤 게시글 수 생성
		int num=(int)(Math.random()*(100-0+1)+0);
		
		// 출력
		System.out.println("랜덤 생성된 게시글 수는 "+num+"개 입니다.");
		
		// 변환
		int page=1;
		if (num==0) {
		}else if (num%15==0) {
			page=(num/15);
		}else {
			page+=(num/15);
		}
		
		// 결과값 출력
		System.out.println("게시글을 올리기에 필요한 페이지 수는 "+page+"개 입니다.");
	}
}
