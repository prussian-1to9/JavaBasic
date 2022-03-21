package day16;

import java.util.*;

public class Hashtable01 {
// HashTable에 친구의 정보를 기억시켜 보자.
	public Hashtable01() {
		// 만들어주기~
		Hashtable table=new Hashtable();
		
		// 데이터 입력
		table.put("이름", "런쥔");
		table.put("나이", 27);
		table.put("전화","010-0323-0825");
		
		// 데이터를 꺼내 출력
		System.out.println("이름 : "+table.get("이름"));
		System.out.println("나이 : "+table.get("나이"));
		System.out.println("전화 : "+table.get("전화"));
		
		// 수정 후 출력해보자
		table.put("전화", "010-0929-0825");
		
		System.out.println("동혁이 전용 폰번 : "+table.get("전화"));
		// 데이터는 중복되어도 노상관인디 key값은 아니다.
		// 바뀌면 걍 바뀌는거임.
		
		int len=table.size();
		
		// 데이터만 추출~!
		System.out.println("\n[데이터만 추출]");
		Collection col=table.values();
		Iterator itor=col.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		// 키값만 추출~~
		System.out.println("\n[키값만 추출 1]");
		Enumeration en=table.keys();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		// 키값만 추출 222
		System.out.println("\n[키값만 추출 2]");
		Set set=table.keySet();
		itor=set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		// entry도 써보자구여
		System.out.println("\n[entry도 함 써봅쉬다.]");
		Set entry=table.entrySet();
		Iterator it3=entry.iterator();
		while(it3.hasNext()) {
			Map.Entry en1=(Map.Entry) it3.next();
			Object key=en1.getKey();
			Object value=en1.getValue();
			
			System.out.println(key+" : "+value);
		}
	}

	public static void main(String[] args) {
		new Hashtable01();
	}
}
