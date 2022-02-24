package day03.ex;

/*
	1년은 365.2426일이다.
	1년을 일, 시간, 분, 초 단위로 계산하고 출력하시오.
	
	Hint.
		하루는 24시간, 0.5일은 12시간이다.
 */
public class Ex04ex {
	public static void main(String[] args) {
		double year=365.2426;
		int day=1;
		double hour=day/24., min=hour/60., sec=min-60.;
		
	System.out.println("1년은 "+(int)(year/day)+"일 "
			+(int)(year%day/hour)+"시간 "
			+(int)(year%hour/min)+"분 "
			+(year%min/sec)+"초 입니다.");
		
		
	}
}
