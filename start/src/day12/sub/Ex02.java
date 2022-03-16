package day12.sub;
/*
	랜덤하게 3~5까지 정수를 발생 시켜
		3 : 삼각형
		4 : 사각형
		5 : 원
	의 형태로 7개의 도형을 만드시오.
	하나의 배열로 관리하고, 각 도형의 내용을 출력하시오.
	
	단, 인터페이스의 구현은 무명 내부 클래스로 작성하시오.
*/
public class Ex02 {
	Figure[] f;
	public Ex02() {
		setFigure();
		figPrint();
	}
	
	public void setFigure() {
		f=new Figure[10];
		
		for (int i=0; i<f.length; i++) {
			int no=(int)(Math.random()*3+3);
			
			switch(no) {
			case 3:
				f[i]=new Figure() {
					int width=(int)(Math.random()*10+1);
					int height=(int)(Math.random()*10+1);
					double area;
					
					@Override
					public void toPrint() {
						System.out.printf("이 삼각형의 밑변은 %3d, 높이는 %3d, 넓이는 %6.2f이다.", 
								width, height, area);
						System.out.println();
					}
					
					@Override
					public void setArea(){
						area=width*height*0.5;
					}
				};
				break;
			case 4:
				f[i]=new Figure() {
					int width=(int)(Math.random()*10+1);
					int height=(int)(Math.random()*10+1);
					int area;
					
					@Override
					public void toPrint() {
						System.out.printf("이 사각형은 가로 %3d, 세로가 %3d, 넓이는 %3d이다.", 
								width, height, area);
						System.out.println();
					}
					
					@Override
					public void setArea(){
						area=width*height;
					}
				};
				break;
			case 5:
				f[i]=new Figure() {
					int rad=(int)(Math.random()*10+1);
					double area;
					double l=rad*2*Math.PI;
					
					@Override
					public void toPrint() {
						System.out.printf("이 원은 반지름이 %3d, 둘레가 %6.2f, 면적이 %6.2f이다", 
								rad, l, area);
						System.out.println();
					}
					
					@Override
					public void setArea(){
						area=rad*rad*Math.PI;
					}
				};
			}
		}
	}

	public void figPrint() {
		for (Figure fig : f) {
			fig.setArea();
			fig.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
