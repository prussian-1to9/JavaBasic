package jdbc;
/*
	emp 테이블의 데이터를 조회하는데,
	
	dno라는 문자열을 입력받으면
		부서번호를 입력받아, 해당 부서 사원들의
		사번, 사원 이름, 직급, 입사일, 급여, 부서번호, 부서이름, 부서위치
	를 출력해주고
	
	job을 입력받으면
		직급을 입력받아, 해당 직급 사원들의
		사번, 사원 이름, 직급, 입사일, 급여, 급여등급, 커미션
	을 조회하고
	
	all 을 입력받으면
		모든 사원의
		사번, 사원 이름, 직급, 입사일
	을 조회하는 프로그램을 작성하시오.
	
	단, exit라는 단어가 입력되면 프로그램이 즉시 종료되게 하시오.
 */
/*
	이 클래스는 사용자가 어떤 것을 입력하든, oracle 사용준비가 돼야함.
	따라서, 이 클래스가 new 되는 순간
	드라이버 로딩이 완료되어야 한다.
 */
import java.sql.*;
import java.util.*;
public class Alone02 {
	Connection con;
	String column;
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;
		
	public Alone02() {
		getColumn();
	}
	
	// Scanner 입력받기
	public void getColumn () {
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 column을 입력하세요! (dno, job, all 中 1, 종료는 exit)");
		
		column = sc.nextLine().toLowerCase();
		
		switch(column) {
		case "dno":
			System.out.println("검색할 부서 번호를 입력하세요.");
			int dno = sc.nextInt();
			System.out.println("입력된 부서번호 : " + dno);
			
			connectSql();
			selectDno(dno);
			
			break;
			
		case "job":
			System.out.println("검색할 직급을 입력하세요.");
			String job = sc.nextLine().toUpperCase();
			System.out.println("입력된 직급 : " + job);
			
			connectSql();
			selectJob(job);
			
			break;
			
		case "all":
			System.out.println("모든 사원의 정보를 조회합니다.");
			
			connectSql();
			selectAll();
			
			break;
			
		case "exit":
			System.out.println("시스템을 종료합니다.");
			break;
			
		default:
			System.out.println("정확한 값을 입력해주세요.");
			getColumn();
			break;
		}
		
	}
	
	// sql에 연결해주기
	public void connectSql () {
		try {
			// 드라이버 만들어주기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// connection 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("* * * SQL 연결 성공 * * *");	// 확인차 출력
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// case "dno" : 질의명령 하기
	public void selectDno (int dno) {
		String sql = "SELECT empno eno, ename, job, TO_CHAR(hiredate, 'YY/MM/DD') hiredate, sal, e.deptno dno, dname, loc"
				+ " FROM emp e, dept d"
				+ " WHERE e.deptno=d.deptno AND e.deptno = ?";
		
		// dno 에따라 다르게 명령
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dno);
			
			rs = pstmt.executeQuery();
			
			// 결과 출력
			while (rs.next()) {
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("dno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.printf("%5d|%8s|%10s|%10s|%6d|%4d|%12s|%10s\n", eno, ename, job
						, hiredate, sal, deptno, dname, loc);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	// case "job" : 질의명령하기
	public void selectJob (String job) {
		try {
			// 질의명령 작성
			String sql = " SELECT empno, ename, job, TO_CHAR(hiredate, 'YY/MM/DD') hdate, sal, grade, NVL(TO_CHAR(comm), '커미션 없음') comm "
					+ " FROM emp, salgrade "
					+ " WHERE sal BETWEEN losal AND hisal AND job = ? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, job);
			
			rs = pstmt.executeQuery();
			
			// 출력하기
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String ejob = rs.getString("job");
				String hiredate = rs.getString("hdate");
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");
				
				System.out.printf("%5d|%8s|%10s|%10s|%6d|%2d|%8s\n",
						empno, ename, ejob, hiredate, sal, grade, comm);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	// case "all": 모든사원 조회
	public void selectAll() {
		try {
			// 질의명령 만들기
			String sql = " SELECT empno, ename, job, TO_CHAR(hiredate, 'YY/MM/DD') hdate"
					+ "	FROM emp";
			
			// 전달도구
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String hiredate = rs.getString("hdate");
				
				System.out.printf("%5d|%8s|%10s|%10s\n", empno, ename, job, hiredate);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	public static void main (String[] args) {
		new Alone02();
	}
}
