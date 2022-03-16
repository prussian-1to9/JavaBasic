package day10;
/*
	엔드림 맴버의 정보를 기억할 배열을 받아
	데이터를 입력하고
	완성이 되면 내용을 출력하시오.
	(단, 각 맴버의 정보는 Friend 클래스에 기억시키도록 함.)
 */
public class Test03 {
	String[] names;
	String[] tels;
	String[] mails;
	String[] birthday;
	int[] ages;
	char gen;
	String addrs;
	
	public Test03() {
		setData();	// 데이터 준비 완.
		
		// 배열로 만들어봅시다.
		Friend[] nctDream=get7Dream();
		
		toPrint(nctDream);
	}
	
	// 각 데이터 초기화 시켜주는 함수
	public void setData() {
		names=new String[] {"mark lee","黃仁俊", "이제노", "이동혁",
				"나재민", "钟辰乐", "박지성"};
		tels=new String[] {"010-0802-0825", "010-0323-0825", "010-0423-0825", "010-0606-0825",
				"010-0813-0825", "010-1122-0825", "010-0205-0825"};
		mails=new String[] {"onyourm__mark", "yellow_3to3", "null", "null"
				, "na.jaemin0813", "null", "null"};
		birthday=new String[] {"99.08.02","00.03.23", "00.04.23", "00.06.06"
				, "00.08.13", "01.11.22", "02.02.05"};
		ages=new int[] {24, 23, 23, 23, 23, 22, 21};
		addrs="GWANGYA";
		gen='M';
	}
	
	// 준비된 데이터를 Friend[] 타입의 데이터로 만들어 반환해주는 함수
	public Friend[] get7Dream() {
		// 이 함수는 Friend[] 배열 생성
		Friend[] dream=new Friend[7];

		// 각 방에 Friend 객체 채워넣기
		for (int i=0; i<dream.length; i++) {
			// 7명분 데이터가 입력되어야 하므로, Friend객체 7개 생성!
			dream[i]=new Friend();
		}
		// 데이터를 채우기
		for (int i=0; i<dream.length; i++) {
			Friend f = dream[i];
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setMail(mails[i]);
			f.setBirth(birthday[i]);
			f.setAge(ages[i]);
			f.setGen(gen);
			f.setAddr(addrs);
		}
		// 채워진 데이터를 반환해주면 됨!
		return dream;
	}
	
	// 출력 함수
	public void toPrint(Friend[] nctDream) {
		for (int i=0; i<nctDream.length; i++) {
			// 배열의 각 방에 기억된 변수는 직접 접근이 불가능.
			// 함수로 꺼내준다.
			
			String name=nctDream[i].getName();
			String tel=nctDream[i].getTel();
			String mail=nctDream[i].getMail();
			String birth=nctDream[i].getBirth();
			String addr=nctDream[i].getAddr();
			int age=nctDream[i].getAge();
			int gen=nctDream[i].getGen();
			
			System.out.println("["+name+"]\n"
					+"\t주소 : "+addr+"\n\t전화 : "+tel+"\n\tinstagram : "+mail
					+"\n\t생일 : "+birth+"\n\t나이 : "+age+"\n\t성별 : "+((gen=='M')?"남자":"여자"));
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
