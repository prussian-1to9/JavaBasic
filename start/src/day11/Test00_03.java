package day11;

public class Test00_03 {
	Nemo[] sagak;
	
	public Test00_03() {
	}
	
	// 배열 세팅
	public void setSagak() {
		sagak=new Nemo[5];
		
		// 객체 채워주기
		for (int i=0; i<sagak.length; i++) {
			sagak[i]=new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
		}
	}
	
	// 석차 결정
	public void setRank() {
		for (int i=0; i<sagak.length; i++) {
			// i번째 네모 꺼내기
			Nemo n1=sagak[i];
			
			// 데이터 꺼내기
			int n1Area=n1.getArea();
			
			for (int j=0; j<sagak.length; j++) {
				int n1Rank=n1.getRank();
				Nemo n2=sagak[j];
				
				int n2Area=n2.getArea();
				
				if (n2Area>n1Area) {
					n1.setArea(n1Rank+1);
				}
			}
		}
	}
	
	// 출력
	// 순위대로 정렬해서 기억시키고 출력하래.
	public void toPrint(Nemo[] sagak) {
		for (int i=0; i<sagak.length; i++) {
			Nemo n=sagak[i];
		}
	}
	
	public static void main(String[] args) {
		new Test00_03();
	}
}
