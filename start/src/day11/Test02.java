package day11;

public class Test02 {
	public Test02() {
		// 원 하나를 만듭시당~
		Won c1=new Won((int)(Math.random()*21+5));
		
		// c1의 둘레 계산
		int rad=c1.getRad();
		
		double arround=rad*2*Won.pi;
		double area=rad*rad*Won.pi;
		
		c1.setArround(arround);
		c1.setArea(area);
		
		// 출력
		System.out.printf("반지름이 %3d인 원 - 원주 : %5.2f\t넓이 %5.2f", rad, arround, area);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
