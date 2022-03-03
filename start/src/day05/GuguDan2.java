package day05;

public class GuguDan2 {

	public static void main(String[] args) {
		// 구구단을 출력하시오.
		
		for(int i=0; i<8; i++) {
			
			for(int j=0; j<9; j++) {
				System.out.print ((i+2)+"X"+(j+1)
						+"="+((i+2)*(j+1))+"\t");
			}
			System.out.println();
			try {
				Thread.sleep(1000);
				}catch(Exception e){
			}
		}

	}

}
