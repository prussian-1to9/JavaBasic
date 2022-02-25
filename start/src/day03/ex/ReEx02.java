package day03.ex;

/*
문제2.
	하나의 숫자를 입력받은 후(원의 반지름)
	그 숫자를 이용해 원의 넓이와 둘레를 계산하고 출력하시오.
	
참고)
	원의 넓이 : 반지름 * 반지름 * 3.14
	원의 둘레 : 지름*3.14
*/
import java.util.*; /* *는 util 하위의 모든 클래스를 뜻한다.
						사용하는 클래스만 선택하여도 상관 X
						동명의 클래스가 다른 폴더에 존재할 경우,
						클래스 이름이 명시된 클래스가 우선된다.
					*/
public class ReEx02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		int r=sc.nextInt();
		System.out.println("원의 반지름 : "+r);
		
		double pi=3.14;
		double area=r*r*pi, cir=2*r*pi;
		System.out.println("원주 : "+cir);
		System.out.println("원의 넓이 : "+area);
		
		/*
			c.f. 형변환에서 큰 타입 데이터->작은 타입으로 변환시
				포함시킬 수 없는 부분은 버린다.
		 */
		int intArea=(int)area;
		int intCir=(int) cir;
		System.out.println("형변환 예시를 출력합니다.");
		System.out.println(intArea);
		System.out.println(intCir);
	}
}
