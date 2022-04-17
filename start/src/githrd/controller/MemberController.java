package githrd.controller;

import java.util.*;
import java.util.regex.*;

import githrd.exc.*;
import githrd.dao.*;
import githrd.vo.*;
public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);

		addMemb(sc);
	}

	// 회원 번호와 아이디 조회해 출력해주는 함수
	public void viewAll() {
		ArrayList<MemberVO> list = mDao.selAll();
		
		System.out.println("모든 회원의 기본정보를 조회합니다.");
		System.out.println("|회원번호|  이름  |       ID       |    PW    |");
		System.out.println("-----------------------------------------------");
		for (MemberVO m : list) {
			System.out.printf("|%7d |%4s |%15s |%9s |\n", m.getMno(), m.getName(), m.getId(), m.getPw());
		}
	}
	
	// 회원번호 1001을 입력하면 해당 회원의 정보를 출력해주는 함수
	public void viewMemb(Scanner sc) {
		System.out.println("회원번호로 회원 정보를 조회합니다.");
		System.out.println("조회할 회원의 회원번호를 입력하세요.");
		int mno = sc.nextInt();
		
		ArrayList<MemberVO> list = mDao.selMeb(mno);
		System.out.println("|회원번호|  이름  |       ID       |    PW    |   전화번호   |     이메일     |     가입일     |성별| 사용 아바타 |");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		for(MemberVO m : list) {
			System.out.printf("|%7d |%4s |%15s |%9s |%13s |%15s |%15s |%3s |%12d |\n", m.getMno(), m.getName(), m.getId(), m.getPw(), m.getTel(),
					m.getMail(), m.getJdate(), m.getGen(), m.getAvt());
		}
	}
	
	// 아이디를 입력해 해당 회원의 전화번호를 수정해주는 함수
	public void updTel(Scanner sc) {
		System.out.println("회원의 전화번호를 수정합니다.");
		System.out.println("수정할 회원의 id를 입력하세요!");
		String id = sc.nextLine();
		
		System.out.println("새 전화번호를 입력하세요. (하이픈 - 포함)");
		String tel = sc.nextLine();
		
		
		try {
			checkTel(tel);
			
			int suc = mDao.altTel(id, tel);
			
			if (suc == 1) {
				System.out.println("전화번호가 성공적으로 수정되었습니다.");
			}else if (suc == 0) {
				System.out.println("전화번호를 수정하는데에 실패했습니다.");
				
				if (!mDao.checkId(id)) throw new IdException();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// [선택] Scanner로 회원정보를 입력받아 회원가입을 처리해주는 함수
	public void addMemb(Scanner sc) {
		System.out.println("회원가입 처리를 진행합니다.");
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("사용할 id를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("사용할 비밀번호를 입력하세요.");
		String pw =sc.nextLine();
		
		System.out.println("전화번호를 입력하세요.");
		String tel = sc.nextLine();
		try {
			checkTel(tel);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("회원가입을 재진행합니다.");
			System.out.println("--------------------------------------------------");
			addMemb(sc);
		}
		
		System.out.println("이메일 주소를 입력하세요.");
		String mail = sc.nextLine();
		
		System.out.println("성별을 입력하세요.");
		String gen = sc.nextLine();
		try {
			gen = checkGen(gen);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("회원가입을 재진행합니다.");
			System.out.println("--------------------------------------------------");
			addMemb(sc);
		}
		
		System.out.println("사용할 아바타 번호를 입력하세요. (11~16)");
		int avt = sc.nextInt();
		try {
			checkAvt(avt);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("회원가입을 재진행합니다.");
			System.out.println("--------------------------------------------------");
			addMemb(sc);
		}
		
		// 데이터 입력
		int suc = mDao.insertMeb(name, id, pw, mail, tel, gen, avt);
		
		if(suc == 1) {
			System.out.println(name + "님의 회원가입이 성공적으로 진행되었습니다.");
		}else if (suc == 0) {
			System.out.println("회원가입에 실패했습니다.");
		}
	}
	
// 예외처리용 함수들 --------------------------------------------
	
	// 전화번호 형식 맞는지 확인하는 함수
	public void checkTel(String tel) throws Exception {
		// 전화번호 형식 맞는지 체크
		Pattern pat = Pattern.compile("010-[0-9]{4}-[0-9]{4}");
		Matcher mat = pat.matcher(tel);
		
		if (!mat.matches()) throw new TelException();
	}
	
	// 아바타 함수
	public void checkAvt(int avt) throws Exception {
		if ((avt < 11) | (avt > 16)) throw new AvtException();
	}
	
	// 성별 체크함수
	public String checkGen(String gen) throws Exception {
		
		if (gen.equals("여자")) {
			gen = "F";
		}else if (gen.equals("남자")) {
			gen = "M";
		}else {
			throw new GenException();
		}
		
		return gen;
	}
	
	public static void main(String[] args) {
		new MemberController();
	}

}
