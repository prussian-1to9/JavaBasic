package empProj.controller;

import empProj.dao.*;
import empProj.vo.*;
import java.util.*;
public class JEmpCont {
	private JEmpDao jDao;
	
	public JEmpCont() {
		jDao = new JEmpDao();
		
		fireD30();
	}
	
	// emp 테이블을 복사해 jemp 테이블 생성 함수
	public void addTable() {
		jDao.addJEmp();
		
	}
	
	// jemp 테이블이 존재하는지 확인하는 함수
	public void isExist() {
		int cnt = jDao.tabCnt();
		if(cnt == 0) {
			addTable();
		}else if(cnt ==1) {
			System.out.println("jemp 테이블이 존재합니다.");
		}
	}
	
	// 가장 최근에 추가된 사원 조회, 출력 함수
	public void lastNewbie() {
		// 가장 최근 추가된 사원 정보 조회하기
		EmpVO evo = jDao.getLast();
		System.out.println("가장 최근에 들어온 사원 : "+evo.getEname());
		System.out.println("\t사번 : " + evo.getEno() +"\n\t직급 : " + evo.getJob());
		System.out.println("\t입사일 : " + evo.getHdate() + "\n\t배정 부서 : " + evo.getDno());		
	}
	
	// 런쥔이 입력하는 함수
	public void addRenjun() {
		// vo 만들기
		EmpVO eVO = new EmpVO();
		
		// 데이터 채우기
		eVO.setEname("RENJUN");
		eVO.setJob("MANAGER");
		eVO.setDno(40);
		
		// DB작업 함수 호출
		int result = jDao.insertJemp(eVO);
		
		// 성공여부 출력
		if(result == 1) {
			System.out.println("데이터 입력에 성공했습니다.");
		}else if(result == 0) {
			System.out.println("데이터 입력에 실패했습니다.");
		}
	}

	// 30번 부서 사원 해고 함수
	public void fireD30() {
		// 데이터 백업
		int cnt = jDao.bupD30();
		
		if (cnt == 1) {
			System.out.println("30번 부서 사원들 (" + cnt + "명) 데이터 백업 완료");
			
		}else {
			System.out.println("30번 부서 사원들 데이터 백업 실패");
		}
		
		// 데이터 삭제
		int result = jDao.delD30();
		
		if (result == cnt) {
			System.out.println("30번 부서 퇴사처리 정상 완료.");
		}else {
			System.out.println("30번 부서 데이터 삭제 실패");
		}
	}
	
	public static void main(String[] args) {
		new JEmpCont();
	}
}
