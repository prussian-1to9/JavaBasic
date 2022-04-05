package jdbc;

import java.sql.*;
import java.util.*;
/*
	이 클래스는
	oracle에 있는 emp 테이블에서 부서번호가 ~~번인 사원들의 정보를 조회해
	출력해주는 기능을 가진 클래스다.
	따라서, 이 클래스는 객체가 되는 순간 DB에 연결할 준비가 되어야 한다.
 */
public class PstmtTest01 {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public PstmtTest01() {
		System.out.println("검색할 부서번호를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int dno = sc.nextInt();
		try {
			// 작업 순서
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("- - - 드라이버 로딩 성공! - - -");
			
			// 2. 커넥션 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println(" * * * 커넥션 연결 성공! * * *");
			
			// 3. 질의명령 준비
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/DD') hdate, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			
			String sql = buff.toString();
			/*
				Statement : 프로그램 -> JDBC로 명령을 전달하는 도구
				==> 이 때 사용해야 하는 질의명령은, 완벽한 질의명령이여야 한다.
				
				우리의 경우, 매번 부서번호를 정해서 바꿔야 하는, 불완전한 질의 명령이다.
				이 때 우리는 prepared statement를 쓸 수 있다!
			 */
			// 4. 명령 전달할 도구 준비
			pstmt = con.prepareStatement(sql);	// 명령도구는 있지만, 질의명령이 불완전하다.
			System.out.println("  + + + 질의 명령 성공! + + +");
			/*
				불완전한 질의명령 ( ? 이 있는 질의 명령) 에 데이터 채우기~
					set데이터종류(위치값, 데이터);
				
				이 때, 위치값은 문자열 중 ? 의 순서를 의미하고, 시작값은 1부터다.
			 */
			pstmt.setInt(1, dno);
			
			// 결과 받기
			rs = pstmt.executeQuery();
			
			// 몇 명이 조회됐을지 모르니께..
			while(rs.next()) {
				// 데이터 꺼내기
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hdate = rs.getString("hdate");
				dno = rs.getInt("dno");
				
				// 출력
				System.out.printf("%5d - %10s - %10s - %5d - %10s - %4d\n", eno, ename, job, mgr, hdate, dno);
			}
			
		}catch(Exception e) {}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new PstmtTest01();
	}
}
