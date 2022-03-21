package day16;
/*
	전화번호를 관리하는 프로그램을 작성합니다.
	추가될 친구들은
		그룹, 이름, 전화번호
	를 입력할 것임.
	
	전화번호부 프로그램을 작성하시오.
	친구	제니	010-0000-0000
			리사	010-0000-0000
	회사
	웬수
	
	동호회	둘리	010-0000-0000
 */
import java.util.*;
public class MapInMap01 {
	// 전체 그룹을 관리하는 맵
	HashMap groupMap=new HashMap();
	
	// 새로운 그룹을 만들어주는 함수
	public void makeGroup(String name) {
		// 그룹 이름을 입력하면 그 그룹을 만들어줌~
		
		if (!groupMap.containsKey(name)) {
			// 만들고자 하는 그룹이 없으면~
			groupMap.put(name, new HashMap());
		}
	}
	
	// 친구를 등록하는 함수
	public void setFriend(String group, String name, String tel) {
		// 등록하는 그룹이 groupMap에 없으면 추가해줘야함.
		makeGroup(group);
		
		// 이 친구를 등록할 그룹의 해당 맵을 알아낸다.
		HashMap tmp=(HashMap)groupMap.get(group);
		
		// 맵에 등록
		tmp.put(name, tel);
	}
	
	// 한 사람만 꺼내는 함수
	public void getPerson(String group, String name) {
		// 꺼내야 하는 그룹 알아내기
		HashMap tmp=(HashMap)groupMap.get(group);
		
		// 해당 그룹에서 친구의 정보 꺼내기
		String tel=(String)tmp.get(name);
		
		System.out.println("("+group+") "+name+"\t"+tel);
	}
	
	// 특정 그룹의 전체를 알아내는 함수
	public void getAll(String group) {
		System.out.println(group+"에 저장된 사람들의 정보를 출력합니다.");
		// 꺼내는 그룹 알아내기
		HashMap tmp=(HashMap)groupMap.get(group);
		
		// 모든 키값 꺼내오기
		Set set=tmp.keySet();
		Iterator itor=set.iterator();
		while(itor.hasNext()) {
			String key=(String)itor.next();
			String value=(String)tmp.get(key);
			
			System.out.println(key+"\t"+value);
		}
	}
	
	public MapInMap01() {
		setFriend("에스파", "카리나", "010-0411-1117");
		setFriend("에스파", "윈터", "010-0101-1117");
		setFriend("에스파", "지젤", "010-1030-1117");
		setFriend("에스파", "닝닝", "010-1023-1117");
		setFriend("회사", "두식", "010-1234-5678");
		
		getAll("에스파");
		System.out.println();
		getAll("회사");
		
		System.out.println("\n데이터 하나만 뽑아봅쉬다~");
		getPerson("에스파", "윈터");
	}

	public static void main(String[] args) {
		new MapInMap01();
	}
}
