package day04;

/*
	1~25 사이의 정수를 랜덤하게 발생시켜
	그 숫자가 짝수인지 홀수인지를 판별 후 출력하시오.
	
	+ 특정 범위 내 랜덤 숫자만들기
		Math 클래스 내 0<=x<1 실수를 발생시켜주는 함수가 잇다.
			Math.random();
			
		형식)
			A~B사이의 랜덤한 정수
				(int)(Math.random()*(B-A+1)+A)
 */

public class RandomMaker02 {
	public static void main(String[] args) {
		
		int n=(int)(Math.random()*(25-1+1)+1);		
		String holjjak=(n%2==0)?"짝수":"홀수";
		
		System.out.println("1~25사이 랜덤생성된 숫자 "+n+"은/는 "+holjjak+"입니다.");
	}
}
