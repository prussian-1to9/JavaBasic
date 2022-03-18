package day15;

import java.util.Vector;

public class Vector03 {

	public Vector03() {
		Vector vec=new Vector();
		
		vec.add("황인준");
		vec.add('M');	
		vec.add(23);
		vec.add(171.);
		vec.add(true);
		
		// 시작해볼까요~ 자동화 처~리~
		for (int i=0; i<vec.size(); i++) {
			// 데이터 꺼내기
			Object o=vec.get(i);
			
			// 데이터 타입에 따른 처리 달리하기~
			if(o instanceof String) {
				String str=(String)o;
				System.out.println("이름 : "+o);
			}else if(o instanceof Integer){
				int age=(int)o;
				System.out.println("나이 : "+age);
			}else if(o instanceof Character) {
				char gen=(char)o;
				System.out.println("성별 : "+gen);
			}else if(o instanceof Double) {
				double height=(double)o;
				System.out.println("키 : "+height);
			}else if(o instanceof Boolean) {
				boolean dr=(boolean)o;
				System.out.println("동혁이 남친인가요? : "+dr+"!");
			}
			// 일케 여러 형태의 데이터가 입력된 경우
			// 데이터를 사용하는 시점에선 원래 데이터로 강제 형변환 해줘야 함!
		}
		/*
			컬렉션의 특징은 여러 형태의 데이터를 동시에 보관할 수 있다는 것!
			
		 */
	}

	public static void main(String[] args) {
		new Vector03();
	}
}
