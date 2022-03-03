package day07;
/*
	1~10까지 정수를 순서대로 배열에 기억시키고
	이 숫자를 랜덤하게 섞어, 출력되도록 하시오.
 */
public class Test06 {
	public static void main(String[] args) {
		// 1~10을 기억하는 배열을 만든다.
		int[] num=new int[10];
		for (int i=0; i<10; i++) {
			num[i]=(i+1);
		}
		// 배열 ready
		
		// 숫자 위치 섞어 출력하기
		for (int i=0; i<100; i++) {
			int idx1=(int)(Math.random()*10);
			int idx2=(int)(Math.random()*10);
			
			// 같으면 다시 뽑아주기
			if (idx1==idx2) {
				i--;
				continue;
			}
			// idx1의 위치에 있는 데이터 이전
			int tmp=num[idx1];
			
			// 두번째 위치의 데이터를 첫 번째 위치에 기억시킨다.
			num[idx1]=num[idx2];
			num[idx2]=tmp;
		}
		// 출력
		for (int no : num) {
			System.out.print("| "+no+" ");
		}
	}
}
