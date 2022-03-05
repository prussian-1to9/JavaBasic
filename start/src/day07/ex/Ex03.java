package day07.ex;
/*
	반지름 5개를 기억하는 배열을 만들어
	랜덤하게 만들어진 값을 기억시키고
	
	각각 원의 넓이를 계산해서 출력해주는 프로그램을 작성하시오.
	넓이도 배열에 기억시키시오.
 */
public class Ex03 {
	public static void main(String[] args) {
		// 반지름 배열변수 만들기
		int[] r=new int[5];
		System.out.print("랜덤 생성된 원의 반지름 :");
		
		// 랜덤값 입력
		roll:
		for (int i=0; i<r.length; i++) {
			int no=(int)(Math.random()*50+1);
			// 중복검사
			for (int j=0; j<r.length; j++) {
				if (no==r[i]) {
					i--;
					continue roll;
				}
			}
			r[i]=no;
			System.out.print(" "+r[i]);
		}
		System.out.println("\n");
		
		// 넓이 배열변수 만들기
		double[] result=new double[r.length];
		
		// 계산
		for (int i=0; i<r.length; i++) {
			result[i]=r[i]*r[i]*3.14;
			System.out.println(i+1+"번째 원의 넓이 : "+result[i]);
		}
	}
}
