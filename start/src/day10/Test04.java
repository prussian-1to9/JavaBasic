package day10;

public class Test04 {
	String[] names;
	String[] tels;
	String[] mails;
	String[] birthday;
	String addrs;
	int[] ages;
	char gen;

	Friend[] nctDream;
	
	public Test04() {
		// 데이터 변수 셋팅
		setData();
		
		setDream();
		
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
	
	// 데이터 입력해주는 함수
	public void setDream() {
		// 데이터 공간 확보
		nctDream=new Friend[7];
		
		for(int i=0; i<nctDream.length; i++) {
			nctDream[i]=new Friend();
		}
		// 각방 객체에 데이터 채워주기
		for(int i=0; i<nctDream.length; i++) {
			Friend f=nctDream[i];
			
			f.setName(names[i]);
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(mails[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
			f.setAge(ages[i]);
		}
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
		new Test04();
	}
}
