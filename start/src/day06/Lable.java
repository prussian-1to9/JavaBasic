package day06;

public class Lable {
	public static void main(String[] args) {
		
		loop:
		for(int i=0; i<8; i++) {
			
			for (int j=0; j<9; j++) {
				if(i==3&j==2) {
					break loop;
				}
				System.out.println((i+2)+"X"+(j+1)+"="+((i+2)*(j+1)));
			}
		}
	}	
}
