package day04.Ex;

/*
1~25의 숫자 3개를 랜덤하게 발생시켜
그 수들 중 가장 큰수, 중간 수, 작은 수를
출력하는 프로그램을 작성하세요.

단, 3항 연산자를 사용해 처리할 것.
*/
public class Ex01_01 {
	public static void main(String[] args) {
		
		// 랜덤 숫자 3개 만들기
		int a=(int)(Math.random()*(25-1+1)+1);
		int b=(int)(Math.random()*(25-1+1)+1);
		int c=(int)(Math.random()*(25-1+1)+1);
		
		// 큰/중간/작은 수를 나타내는 변수 만들기
		int biggest=((a>b)&&(a>c))?a:
			((b>c)&&(b>a))?b:c;
		int smallest=((a<b)&&(b<c))?a:
			((b<c)&&(b<a))?b:c;
		int mid=((a!=biggest)&&(a!=smallest))?a:
			((b!=biggest)&&(b!=smallest))?b:c;
		
		// 새로운 함수를 찾아냄!
		int max=Math.max(a, (Math.max(b, c)));
		int min=Math.min(a, (Math.min(b, c)));
		int Mid=((a!=max)&&(a!=min))?a:
			((b!=max)&&(b!=min))?b:c;
		
		System.out.println("1~25의 숫자 중 생성 된 정수 3가지는 \n"
				+a+" "+b+" "+c+" 이며, \n"+
				"가장 큰 수는 "+max+", 두 번째로 큰 수는 "+Mid+", 가장 작은 수는 "+min+"입니다.");
	}
}
