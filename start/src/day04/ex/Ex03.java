package day04.ex;

/*
	게시물을 게시판에 출력할 때, 
	페이지당 게시물 15개를 출력할 예정이다.
	
	개시물 수를 랜덤하게 발생시키고, 
	몇 페이지가 필요한지 계산해서 출력해주는 프로그램을 작성하시오
	
	+ 게시물이 없는 경우, 게시물이 없는 페이지가 적어도 1페이지는 필요하다.
 */
public class Ex03 {
	public static void main(String[] args) {
		// 게시물 수 랜덤 발생 (0~100)
		int random=(int)(Math.random()*(100-0+1)+0);
		// 출력
		System.out.println("랜덤 발생 된 게시물 수 : "+random+"개");
		
		// 페이지 계산 변수 만들기
		int page=((random!=0)&&(random%15==0))?(random/15):
				((random!=0)&&(random%15>=1))?(random/15+1):1;
				
		// 출력
		System.out.println("필요한 게시판 페이지 수 : "+page+"개");
	}
}
