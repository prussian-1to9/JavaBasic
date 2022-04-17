package empProj.controller;

import empProj.dao.*;
import empProj.vo.*;
import java.util.*;
public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
		atStart();
	}

	// 첫 커맨드 출력
	public void atStart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("emp테이블에 대한 작업을 시작합니다.");
		System.out.println("모든 사원 정보 조회 : all");
		System.out.println("모든 직급 정보 조회 : job list");
		System.out.println("모든 부서 정보 조회 : dept list");
		System.out.println("사번으로 정보 조회 : eno");
		System.out.println("부서 번호로 정보 조회 : dno");
		System.out.println("직급으로 정보 조회 : job");
		System.out.println("시스템 종료 : exit");
		
		String query = sc.nextLine().toLowerCase();
		
		switch(query) {
		
		case "all":
			showAll();
			break;
			
		case "dept list":
			showDept();
			break;
			
		case "job list":
			showJob();
			break;
			
		case "eno":
			searchForEno();
			break;
			
		case "dno":
			searchForDno(sc);
			break;
			
		case "job":
			break;
			
		case "exit":
			System.out.println("* * * 시스템이 종료됩니다. * * *");
			break;
			
		default:
			System.out.println("정확한 값을 입력하세요.");
			System.out.println("----------------------------------------------");
			atStart();
		}
	}

	// case "all"
	public void showAll() {
		eDao = new EmpDao();
		
		// 모든 사원의 정보를 조회
		ArrayList<EmpVO> list = eDao.getAll();
		
		System.out.println("| 사번 |사원이름|   직 급   |  입 사 일  |");
		System.out.println("------------------------------------------");
		
		for(EmpVO e : list) {
			System.out.printf("|%5d |%7s |%10s |%11s |\n", e.getEno(), e.getEname(), e.getJob(), e.getHdate());
		}
		
		System.out.println("\n----------------------------------------------");
		atStart();
	}

	// case "dept list"
	public void showDept() {
		eDao = new EmpDao();
		
		ArrayList<EmpVO> list = eDao.getDeptList();
		
		System.out.println("|부서 번호|  부서이름  |");
		System.out.println("------------------------");
		
		for(EmpVO e : list) {
			System.out.printf("|%8d |%11s |\n", e.getDno(), e.getDname());
		}
		
		System.out.println("\n----------------------------------------------");
		atStart();
	}
	
	// case "job list":
	public void showJob() {
		eDao = new EmpDao();
		
		ArrayList<EmpVO> list = eDao.getJobList();
		
		System.out.println("[조회된 직급]\n");
		
		for(EmpVO e : list) {
			System.out.print(e.getJob() + " ");
		}
		
		System.out.println("\n----------------------------------------------");
		atStart();
	}
	
	// case "eno":
	public void searchForEno() {
		// TODO
	}
	
	// case "dno":
	public void searchForDno(Scanner sc) {
		System.out.println("조회할 부서 번호를 입력하세요.");
		int dno = sc.nextInt();
		
		ArrayList<EmpVO> list = eDao.getDnoInfo(dno);
		
		System.out.println("| 사번 |사원 이름|   직 급   |  입 사 일  | 급여, 부서번호, 부서 위치");
		for (EmpVO e : list) {
			System.out.printf("|%5d |%8s |%10s |", e.getEno(), e.getEname(), e.getJob());
		}
	}
	
	public static void main(String[] args) {
		new EmpController();
	}
}
