package day08;
/*
	0~9사이의 숫자를 100개 발새 시켜.
	각각의 숫자가 몇 번씩 발생했는지 알아보자.
	
	방법)
		각 숫자의 횟수를 기억할 배열을 만들고
		각 숫자가 발생할 때마다 1씩 누적시켜준다.
 */
public class Test01 {
	public static void main(String[] args) {
		// 배열 만들기
		int[] numCount=new int[10];
		
		// 반복 작업
		for(int i=0; i<100; i++) {
			// 랜덤 숫자발생
			int no=(int)(Math.random()*(9-0+1)+0);
			// 이렇게 위에서 발생된 숫자는 numCont배열의 위치값으로 사용하고
			// 그 위치값의 숫자를 1 증가시켜주면 된다.
			
			// 발생한 숫자의 카운트 올리기
			numCount[no]++;
		}
		
		// 결과 출력
		for (int i=0; i<numCount.length; i++) {
			int no=i;
			int count=numCount[i];
			
			System.out.println(no+" : "+count);
		}
		System.out.println();
		
		// 그래프 형태로 출력
		for (int i=0; i<numCount.length; i++) {
			int count=numCount[i];
			
			System.out.print(i+" | ");
			// count 횟수만큼 특수문자를 출력해야 하므로 반복문 처리
			for (int j=0; j<count; j++) {
				// 출력
				System.out.print("♪");
			}
			System.out.println();
		}
	}
}
