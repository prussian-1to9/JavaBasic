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
import java.text.*;
import java.util.Date;

import jdbc.sql.EmpSQL;

import java.util.*;
public class JdbcTest01 {
	// 작업에 필요한 변수 선언
	public final int SEL_ALL = 1001;	// final 변수 쓸땐 대문자로!!
	public final int SEL_DNO_INFO = 1002;
	public final int SEL_JOB_INFO = 1003;
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	EmpSQL eSQL;
	
	public JdbcTest01() {
		try {
			// 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			eSQL = new EmpSQL();
			getInput();
		}catch(Exception e) {
			System.out.println("- + - 서버로딩 실패 - + -");
			e.printStackTrace();
		}
	}
	
	// 코드 (정수)를 입력받으면 그 코드에 해당하는 질의 명령을 반환해 주는 함수.
	public String getSql(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		
		case SEL_DNO_INFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno=d.deptno ");
			buff.append("	AND e.deptno = ? ");
			break;
			
		case SEL_JOB_INFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션 없음') comm ");
			buff.append("FROM ");
			buff.append("	emp, salgrade ");
			buff.append("WHERE ");
			buff.append("	sal BETWEEN losal AND hisal ");
			buff.append("	AND job = ? ");
			break;
		}
		// buffer에 담긴 내용을 문자열로 반환한다.
		return buff.toString();
	}
	
	// 문자열 입력받는 함수
	public void getInput() {
		// 스캐너로 문자열을 입력받고, 각 문자열들마다 입력받을 내용을 받아
		// 실행시켜주는 함수.
		// 메세지 출력
		System.out.print("부서 번호로 조회 : dno\n직급으로 조회 : job\n모든 사원 정보 조회 : all\n프로그램종료 : exit\n명령 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// switch문으로 처리
		switch(str) {
		
		case "dno":
			getDnoInfo(sc);
			break;
			
		case "job":
			getJobInfo(sc);
			break;
			
		case "all":
			getAll();
			break;
			
		case "exit":
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
	}
	
	// 모든 사원 조회
	public void getAll() {
		try {
			// 데이터 베이스에 연결해
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			con = DriverManager.getConnection(url, user, pw);
			
			// 질의 명령을 보내고, 결과를 받아 출력한다.
//			String sql = getSql(SEL_ALL);
			String sql = eSQL.getSQL(SEL_ALL);
			
			// 명령 전달도구 준비
			stmt = con.createStatement();
			
			// 질의명령 보내고 결과 받기
			rs = stmt.executeQuery(sql);
			
			// 몇개 꺼냈는지 모르니
			while(rs.next()) {
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				// JDBC에서 날짜 데이터를 꺼낼 땐, 날짜와 시간을 따로 꺼내오도록 되어있다.
				// 날짜 먼저 꺼내기
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				// 날짜 데이터를 원하는 문자열로 바꿔주는 형식화 클래스 : SimpleDateFormat
				SimpleDateFormat form = new SimpleDateFormat("YYYY년 MM월 dd일");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String sdate = form.format(hdate) + form2.format(htime);
				
				// 출력
				System.out.printf("%5d | %10s | %10s | %24s\n", eno, name, job, sdate);
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
	
	// 해당 부서 사원 조회
	public void getDnoInfo(Scanner sc) {
		// 스캐너로 부서 번호 입력받기 - 새로 new 시키면 에러난대.
		// 고로 매개변수로 주소만 가져오는걸 해주겠어요.
		System.out.println("검색할 부서번호를 입력하세요. 이전단계로 가려면 -1을 입력하세요.");
		int no = sc.nextInt();
		
		// -1이면 함수 즉시종료
		if (no == -1) {
			System.out.println("---------------------------------------------------------------------");
			getInput();
		}
		
		// 필터링을 빠져나왔다면,
		try {
			// 접속할 준비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 질의명령 보내기
			String sql = eSQL.getSQL(SEL_DNO_INFO);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			// 결과받고 출력
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				
				//hiredate는 특별히 변환해주기~
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				// 문자열로 변환
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String sdate = form1.format(hdate) + form2.format(htime);
				
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");	// 인라인 테이블에선 deptno라고 떠서 e.는 생략함.
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				// 출력
				System.out.printf("%5d | %10s | %10s | %24s | %6d | %2d | %10s | %10s\n", empno, ename, job, sdate, sal, deptno, dname, loc);
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
	
	// 해당 직급 사원 조회
	public void getJobInfo(Scanner sc) {
		System.out.println("검색할 직급을 입력하세요. 이전단계로 가려면 quit을 입력하세요.\n(모든 직급 조회 : list)");
		String j = sc.nextLine().toUpperCase();
		
		// -1이면 이전단계로 가기
		if (j.equals("QUIT")) {
			System.out.println("---------------------------------------------------------------------");
			getInput();			
		}
		if (j.equals("LIST")) getJobList(sc);
		
		// 필터링 됐다면
		try {
			// DB 접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 질의명령 가져오기
			String sql = eSQL.getSQL(SEL_JOB_INFO);
			
			// 명령 전달도구 준비
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, j);
			
			// 질의명령 보내고 결과 받기
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String ejob = rs.getString("job");
				
				// 시간 추출하기~
				Date hdate = rs.getDate("hiredate");				
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일");
				String sdate = form1.format(hdate);
				
				
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");

				System.out.printf("%5d | %10s | %10s | %12s | %6d | %1d | %6s\n",
						empno, ename, ejob, sdate, sal, grade, comm);
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

	// 사원들의 모든 직급을 조회해 출력해주는 함수
	public void getJobList(Scanner sc) {
		try {
			System.out.println("모든 직급을 조회합니다.");
			// 커넥션 준비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 질의명령 꺼내오기
			String sql = eSQL.getSQL(eSQL.SEL_JOBLIST);
			
			// 명령 전달도구 준비
			stmt = con.createStatement();
			
			// 질의명령 전송, 결과 받기
			rs = stmt.executeQuery(sql);
			
			// 출력
			while (rs.next()) {
				String job = rs.getString("job");
				
				System.out.print(job+" ");
			}
			System.out.println();
			System.out.println("---------------------------------");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
		getJobInfo(sc);
	}
	
	public static void main (String[] args) {
		new JdbcTest01();
	}
}
