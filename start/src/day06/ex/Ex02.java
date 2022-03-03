package day06.ex;

/*
	문제 2. 두 사람이 등산을 한다.
			동혁이는 산 입구에서 0.5m/s의 속도로 올라가고,
			인준이는 산 정상에서 1.07m/s의 속도로 내려온다.
			
			동런이 같은 등산로를 이용하고, 그 등산로가 7564m라면
			두 사람이 만나는 시점은 출발 후 몇분 몇초 후인지 출력하시오.
			(단, 둘은 동시에 출발한다.)
 */
public class Ex02 {
	public static void main(String[] args) {
		
		// 조건문 만들기
		for (int sec=0; ; sec++) {
			// 동런이 산을 올라간다!
			double d=0;
			double r=0;
			d+=(sec*0.5);
			r+=(sec*0.5);
			
			if (d+r>=7564) {
				System.out.println("동혁이와 런쥔이는 산 "+d+"m 지점에서 만났습니다!\n"
						+(sec/60)+"분 "+(sec%60)+"초가 소요되었습니다!");
				break;
			}
		}
	}
}
