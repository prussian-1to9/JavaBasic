package empProj.dao;
/*
	이 클래스는 oracle 의 scott 계정으로 emp에 대한
	조회/수정/삭제 작업을 JDBC를 통해 실행하는 부품이 될 것이다.
	
	그렇다면, oracle이 접속된 상태여야 하며,
	드라이버가 준비되어야 할 것이다.
 */
import java.sql.*;
import java.sql.Date;
import java.util.*;
import empProj.db.*;
import empProj.sql.*;
import empProj.vo.*;
public class EmpDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private ScottJDBC db;
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new ScottJDBC();
		// new 되자마자 드라이버 로딩 상태가 된다!
		
		// 질의명령 사용 준비
		eSQL = new EmpSQL();
	}
	
	// 모든 사원의 정보를 조회/반환해주는 함수
	public ArrayList<EmpVO> getAll() {
		// 반환값 변수 만들기
		ArrayList<EmpVO> list= new ArrayList<EmpVO>();
		
		// connection 접속
		con = db.getCON();
		
		// 질의명령 꺼내기
		String sql = eSQL.getSQL(eSQL.SEL_ALL);
		
		// 명령 전달도구 준비
		stmt = db.getSTMT(con);
		
		// 질의명령 보내고 결과받기
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				
				// 데이터 꺼내기
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				// VO 에 채우기
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				
				list.add(eVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}

	// 부서번호를 입력받아, 부서원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getDnoInfo(int dno) {
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// connection 접속
		con = db.getCON();
		
		// 명령 전달도구
		String sql = eSQL.getSQL(eSQL.SEL_DNOINFO);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 부서번호 입력
			pstmt.setInt(1, dno);
			
			// 결과 조회 및 입력
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				
				int eno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String loc = rs.getString("loc");
				
				eVO.setEno(eno);
				eVO.setEname(ename);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				eVO.setSal(sal);
				eVO.setDno(deptno);
				eVO.setLoc(loc);
				
				list.add(eVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
			
		return list;
	}
	
	// 직급을 입력받아 해당 직급 사원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getJobInfo(String job){
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 접속 / 명령전달 도구 작성
		con = db.getCON();
		String sql = eSQL.getSQL(eSQL.SEL_JOBINFO);
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 직급 입력
			pstmt.setString(1, job.toUpperCase());
			
			// 결과 받고, 리스트에 넣기
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				
				int eno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String j = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				
				eVO.setEno(eno);
				eVO.setEname(ename);
				eVO.setJob(j);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				eVO.setSal(sal);
				eVO.setComm(comm);
				
				list.add(eVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return list;
	}

	// 부서 리스트 조회/반환 함수
	public ArrayList<EmpVO> getDeptList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		con = db.getCON();
		String sql = eSQL.getSQL(eSQL.SEL_DEPTLIST);
		stmt = db.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				EmpVO evo = new EmpVO();
				
				String dname = rs.getString("dname");
				int dno = rs.getInt("deptno");
				
				evo.setDname(dname);
				evo.setDno(dno);
				
				list.add(evo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		db.close(rs);
		db.close(stmt);
		
		return list;
	}

	// 직급 리스트 조회/반환 함수
	public ArrayList<EmpVO> getJobList() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		con = db.getCON();
		String sql = eSQL.getSQL(eSQL.SEL_JOBLIST);
		stmt = db.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				EmpVO evo = new EmpVO();
				
				String job = rs.getString("job");
				evo.setJob(job);
				
				list.add(evo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		db.close(rs);
		db.close(stmt);
		db.close(con);
		
		return list;
	}
}
