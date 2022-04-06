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
import java.util.*;
public class JdbcTest01 {
	// 작업에 필요한 변수 선언
	public final int SEL_ALL = 0;	// final 변수 쓸땐 대문자로!!
	public final int SEL_DNO_INFO = 1;
	public final int SEL_JOB_INFO = 2;
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public JdbcTest01() {
		try {
			// 드라이버 로딩하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
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
		System.out.print("부서 번호로 조회 : dno\n직급으로 조회 : job\n모든 사원 정보 조회 : all\n명령 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// switch문으로 처리
		switch(str) {
		
		case "dno":
			getDno();
			break;
			
		case "job":
			
			break;
			
		case "all":
			getAll();
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
			String sql = getSql(SEL_ALL);
			
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
	public void getDno() {
		try {
			// 접속할 준비
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 스캐너로 부서 번호 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.println("부서번호를 입력하세요.");
			int dno = sc.nextInt();
			
			// 질의명령 보내기
			String sql = getSql(SEL_DNO_INFO);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dno);
			
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
				int deptno = rs.getInt("e.deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				// 출력
				System.out.printf("", empno);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {}
		}
	}
	
	public static void main (String[] args) {
		new JdbcTest01();
	}
}
