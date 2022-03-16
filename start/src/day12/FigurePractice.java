package day12;
/*
	랜덤하게 3~5까지 정수를 발생 시켜
		3 : 삼각형
		4 : 사각형
		5 : 원
	의 형태로 10개의 도형을 만드시오.
	하나의 배열로 관리하고, 각 도형의 내용을 출력하시오.
 */
public class FigurePractice {
	private Figure[] fig;
	
	public FigurePractice() {
		setFig();
		figPrint();		
	}
	
	// 3~5의 숫자 랜덤생성 함수
	public int getNo() {
		return(int)(Math.random()*3+3);
	}
	
	// 배열변수 초기화+도형 결정 함수
	public void setFig() {
		fig=new Figure[10];
		
		// 배열마다 도형 채워넣기
		for (int i=0; i<fig.length; i++) {
			// 아 돌려 돌려
			int no=getNo();
			
			switch(no) {
			case 3:
				fig[i]=new Semo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
				break;
			case 4:
				fig[i]=new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
				break;
			case 5:
				fig[i]=new Dongle((int)(Math.random()*21+5));
			}
		}
	}

	// 출력 함수
	public void figPrint() {
		for (Figure f : fig) {
			f.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new FigurePractice();
	}
}
