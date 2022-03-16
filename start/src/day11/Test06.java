package day11;
/*
	랜덤하게 0~2 사이의 정수를 발생시켜서
		0 : 원
		1 : 삼각형
		2 : 사각형
 */
public class Test06 {
	public Test06() {
		Moyang[] mo=new Moyang[10];
		
		for (int i=0; i<mo.length; i++) {
			// 도형 결정 정수 발생
			int kimari=(int)(Math.random()*3);
			
			int no1=(int)(Math.random()*21+5);
			int no2=(int)(Math.random()*21+5);
			
			switch (kimari) {
			case 0:
				mo[i]=new Circ(no1);	// 원의 객체를 만들어 채워준다
				break;
			case 1:
				mo[i]=new Tri(no1, no2);
				break;
			case 2:
				mo[i]=new Rec(no1, no2);
			}
		}
		
		// 출력
		for (int i=0; i<mo.length; i++) {
			mo[i].toPrint();
		}
	}
	

	
	public static void main(String[] agrs) {
		new Test06();
	}
}
