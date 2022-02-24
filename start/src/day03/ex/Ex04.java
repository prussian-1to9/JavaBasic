package day03.ex;

/*
	1년은 365.2426일이다.
	1년을 일, 시간, 분, 초 단위로 계산하고 출력하시오.
	
	Hint.
		하루는 24시간, 0.5일은 12시간이다.
 */
public class Ex04 {
	public static void main(String[] args) {
		double aeyear=365.2426;
		int sec=1, min=60, hour=60*60;
		int day=hour*24;
		
		double year=aeyear*day;
				
		double tmp=year;
		double YnD=tmp/day;
		tmp=tmp%day;
		double YnH=tmp/hour;
		tmp=tmp%hour;
		double YnM=tmp/min;
		tmp=tmp%min;
		double YnS=tmp/sec;
		
		System.out.println("1년="+(int)YnD+"일 "+(int)YnH+"시간 "
				+(int)YnM+"분 "+YnS+"초");
		
	}
}
