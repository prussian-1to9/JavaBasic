package day16;
/*
	Set계열의 특징~
		1. 입력순서 보장하지 않음(나름의 정렬규칙이 있기 때문)
	***	2. 중복데이터 입력을 허용하지 않는다.
	
		오늘은 그 예외에 대해 설명하고자 합뮈다.
 */
import java.util.*;
public class SetEqualsOperating {
//	Nemo 클래스를 만들고, 가로가 같은 네모면 같은 네모로 처리되도록 하시오.
	public SetEqualsOperating() {
		Nemo n1=new Nemo(5, 3);
		Nemo n2=new Nemo(5, 5);
		Nemo n3=new Nemo(6, 6);
		
		// HashSet을 만들어봅쉬다.
		HashSet set=new HashSet();
		
		// 네모 입력쓰.
		set.add(n1);
		set.add(n2);
		set.add(n3);
		
		// 출력쓰
		for(Object o : new ArrayList(set)) {
			// 값을 꺼내는게 아니면 강제형변환 해줄 필요 X
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new SetEqualsOperating();
	}
}
