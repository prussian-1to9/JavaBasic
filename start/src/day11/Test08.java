package day11;

import static java.lang.Math.*;
public class Test08 {
	public Test08() {
		Object[][] obj=new Object[3][5];
		
		Tri[] tri=new Tri[5];
		for (int i=0; i<tri.length; i++) {
			tri[i]=new Tri((int)(random()*21+5), (int)(random()*21+5));
		}
		
		Rec[] rec=new Rec[5];
		for (int i=0; i<rec.length; i++) {
			rec[i]=new Rec((int)(random()*21+5), (int)(random()*21+5));
		}
		
		Circ[] circ=new Circ[5];
		for (int i=0; i<circ.length; i++) {
			circ[i]=new Circ((int)(random()*21+5));
		}
		
		obj[0]=tri;
		obj[0]=rec;
		obj[0]=circ;
		
		// java의 모든 클래스는 Object클래스의 하위클래스이기 때문에
		// 요렇게 대입도 된다능!
		Object o1=new Tri();
		Object o2=new Rec();
		Object o3=new Circ();
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}
