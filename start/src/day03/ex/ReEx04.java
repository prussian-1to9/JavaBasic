package day03.ex;

/*
1년은 365.2426일이다.
1년을 일, 시간, 분, 초 단위로 계산하고 출력하시오.

Hint.
	하루는 24시간, 0.5일은 12시간이다.
*/
public class ReEx04 {
	public static void main(String[] args) {
		double aeyear=365.2426;
		int sec=1, min=60, hour=60*60, day=60*60*24;
		double year=aeyear*day;
		
		double tmp=year;
		int YtD=(int)(tmp/day);
		tmp%=day;
		int YtH=(int)(tmp/hour);
		tmp%=hour;
		int YtM=(int)(tmp/min);
		tmp%=min;
		double YtS=(tmp/sec);
		
		System.out.print("1년은 "+YtD+"일 "+YtH+"시간 "+YtM+"분 "+YtS+"초 입니다.");
		
// -----------------------------------------------------------------------------------
		// 강사님 풀이 추가 (내 풀이가 더 쉬운것 같음^^)
		
		System.out.println();
		System.out.println("강사님 풀이를 첨부했습니다.");
		double total=365.2426;
		
		double Ltmp=total;
		int Lday=(int)Ltmp;
		Ltmp-=Lday;
		
		// tmp(=0.2426)을 초로 변환한다.
		int tsec=(int)(0.2426*24*60*60);
		
		// 시간 구하기.
		int Lhour=tsec/60/60;
		tsec%=(60*60);
		
		// 분 구하기.
		int Lmin=tsec/60;
		tsec%=60;
		
		// 초 구하기
		int Lsec=tsec;
		
		
		
		// 출력
		System.out.println("출력값 : 1년은 "+total+"일 인데,");
		System.out.println("이것을 세부적인 단위로 나타내면 "+Lday+"일 "+Lhour+"시간 "
				+Lmin+"분 "+Lsec+"초 이다.");
		
	}
}
