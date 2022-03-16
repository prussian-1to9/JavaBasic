package day13;

import day12.sub.*;
/*
	day12.sub 패키지의 Figure 인터페이스를 구현한 사각형을
	무명 내부클래스를 만들어 사용해 봅시다!
 */
public class Test01 {
//	int width=(int)(Math.random()*21+5);
//	int height=(int)(Math.random()*21+5);	>> Heap에 저장됨
	public Test01() {
		// 사각형
		Figure squ=new Figure() {
			int width=(int)(Math.random()*21+5);	//>> Stack에 저장됨
			int height=(int)(Math.random()*21+5);
			int area;
			
			@Override
			public void setArea() {
				area=width*height;
			}

			@Override
			public void toPrint() {
				setArea();
				System.out.printf("이 사각형은 가로가 %3d, 세로가 %3d, 넓이가 %3d이다.", 
						width, height, area);
				System.out.println();
			}
		};
		Figure tri=new Figure() {
			int width=(int)(Math.random()*21+5);
			int height=(int)(Math.random()*21+5);
			double area;
			
			@Override
			public void setArea() {
				area=width*height*0.5;
			}
			
			@Override
			public void toPrint() {
				setArea();
				System.out.printf("이 삼각형은 밑변이 %3d, 높이가 %3d, 넓이가 %6.2f이다.", 
						width, height, area);
				System.out.println();
			}
		};
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
