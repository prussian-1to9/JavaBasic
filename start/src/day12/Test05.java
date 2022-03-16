package day12;
/*
	변수는 reference를 따르는 예시
 */
public class Test05 {
	public Test05() {
		Num num=new Num();
		Num no=new No();	//==> 가능!
		
		System.out.println("Num.num : "+num.num );	// 10
		System.out.println("No.num : "+no.num);	// 999가 아닌 10
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}

class Num{
	int num=10;
}

class No extends Num{
	int num=999;
}