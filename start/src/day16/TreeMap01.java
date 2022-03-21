package day16;

import java.util.*;
public class TreeMap01 {

	public TreeMap01() {
		
		System.out.println("[TreeSet 그냥 만들기]");
		makeTree();
		System.out.println("\n[내림차순 TreeSet만들기]");
		imTheTree();
	}
	
	// TreeSet만들기
	public void makeTree() {
		TreeMap map=new TreeMap();
		// Map의 key값을 이름으로, value를 나이로 해보장.
		map.put("카리나", 2000);
		map.put("지젤", 2000);
		map.put("윈터", 2001);
		map.put("닝닝", 2002);
		
		// 출력~
		Set keys=map.keySet();
		for (Object k : keys) {
			System.out.println(k+" : "+map.get(k)+"년생");
		}
	}

	// 내림차순 TreeMap만들기
	public void imTheTree() {
		// 이름 기준으로 내림차순 정렬을 하고 싶다!
		TreeMap maap=new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String name1=(String)o1;
				String name2=(String)o2;
				int result=name1.compareTo(name2);
				return -result;
			}
		});
		maap.put("카리나", 2000);
		maap.put("지젤", 2000);
		maap.put("윈터", 2001);
		maap.put("닝닝", 2002);
				
		// 출력
		Set ke=maap.keySet();
		for (Object k : ke) {
			System.out.println(k+" : "+maap.get(k)+"년생");
		}
		
		System.out.println("\n[Map.Entry로 꺼내기]");
		// Map.Entry로 꺼내 처리하는 법
		Set set=maap.entrySet();
		// 추가된 데이터 개수만큼 Map.Entry를 만들어, set에 추가해 반환.
		Iterator itor=set.iterator();	// 들어있는건 Map.Entry타입 객체
		
		while (itor.hasNext()) {
			Map.Entry o=(Map.Entry)itor.next();
			Object key=o.getKey();
			Object value=o.getValue();
			System.out.println((String)key+" : "+(int)value+"년생");
		}
	}
	
	public static void main(String[] args) {
		new TreeMap01(); 
	}
}
