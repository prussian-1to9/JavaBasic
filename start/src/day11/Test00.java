package day11;

public class Test00 {
	public Test00() {
		Nemo[] sagak=new Nemo[5];
		
		// 객체 채우기
		for (int i=0; i<sagak.length; i++) {
			int garo=(int)(Math.random()*21+5);
			int sero=(int)(Math.random()*21+5);
			
			Nemo n=new Nemo(garo, sero);
			
			// 배열에 네모 채우기
			sagak[i]=n;
		}
		toPrint(sagak);
	}
	
	// 출력 함수
	public void toPrint(Nemo[] sagak) {
		for (int i=0; i<sagak.length; i++) {
			Nemo n=sagak[i];
			
			int garo=n.getGaro();
			int sero=n.getSero();
			int area=n.getArea();
			
			// 출력
			System.out.printf("이 사각형은 가로가 %3d, 세로가 %3d, 넓이가 %4d인 사각형입니다.", garo, sero, area);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Test00();
	}
}
