package day11;

public class Test00_01 {
	public Test00_01() {
		Nemo[] sagak=new Nemo[5];
		
		
	}

	// 배열에 사각형 채워주기
	public void setArr(Nemo[] sagak) {
		// 건네받은 배열의 길이만큼 네모 객체 채우기
		for (int i=0; i<sagak.length; i++) {
			sagak[i]=new Nemo((int)(Math.random()*21+5),(int)(Math.random()*21+5));
			
			
		}
	}
	
	public static void main(String[] args) {
		new Test00_01();
	}
}
