package day12.sub;
/*
	랜덤하게 3~5까지 정수를 발생 시켜
		3 : 삼각형
		4 : 사각형
		5 : 원
	의 형태로 7개의 도형을 만드시오.
	하나의 배열로 관리하고, 각 도형의 내용을 출력하시오.
 */
public class Ex01 {
	// 변수만들기~
	Figure[] fig;
	
	public Ex01() {
		setData();
		pPrint();
	}

	// 랜덤 정수 발생
	public int getNo() {
		return (int)(Math.random()*3+3);
	}
	
	// 데이터 입력
	public void setData() {
		// 메모리 할당해주기
		fig=new Figure[7];
		
		// 객체 생성&데이터 입력
		for (int i=0; i<fig.length; i++) {
			int no=getNo();
			
			switch(no) {
			case 3:
				fig[i]=new Tri((int)(Math.random()*11+1),(int)(Math.random()*11+1));
				break;
			case 4:
				fig[i]=new Rec((int)(Math.random()*11+1),(int)(Math.random()*11+1));
				break;
			case 5:
				fig[i]=new Cir((int)(Math.random()*11+1));
			}
		}
	}
	
	// 출력
	public void pPrint() {
		for (Figure f : fig) {
			f.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
