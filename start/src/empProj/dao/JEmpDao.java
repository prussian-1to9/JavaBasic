package empProj.dao;
/**
 * 이 클래스는 JEmp 테이블에 관련된 DB작업을 담당할 클래스입니다.
 * @author 이지쨩
 * @since 2022.04.13
 * @version v.1.0
 */
import empProj.db.*;
import empProj.sql.*;
import empProj.vo.*;

import java.sql.*;
import java.text.*;
import java.util.*;
public class JEmpDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private ScottJDBC db;
	private JEmpSQL jSQL;
	
	public JEmpDao() {
		db = new ScottJDBC();
		jSQL = new JEmpSQL();
	}

	// emp 테이블 구조를 복사한 jemp 테이블 생성함수
	public void addJEmp() {
		// db 접근
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		// 명령, 전달
		String sql = jSQL.getSQL(jSQL.ADD_TABLE);
		try {
			rs = stmt.executeQuery(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 자원 반환
		db.close(rs);
		db.close(stmt);
		db.close(con);
		
		System.out.println("jemp 테이블 생성 완료");
	}

	// jemp테이블 생성여부 조회 함수
	public int tabCnt() {
		// 반환값 변수 초기화
		int cnt = 0;
		
		// DB접근
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		// 명령 및 결과 반환
		String sql = jSQL.getSQL(jSQL.SEL_TNAME);
		try {
			rs = stmt.executeQuery(sql);
			rs.next();
			cnt = rs.getInt("cnt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 자원 반환
		db.close(rs);
		db.close(stmt);
		db.close(con);
		
		return cnt;
	}

	// 데이터 입력 함수
	public int insertJemp(EmpVO eVO) {
		// 반환값 변수
		int cnt = 0;
		
		// DB접근
		con = db.getCON();
		String sql = jSQL.getSQL(jSQL.INSERT_JEMP);
		pstmt = db.getPSTMT(con, sql);
		
		// VO클래스에서 데이터 꺼내주기.
		String ename = eVO.getEname();
		String job = eVO.getJob();
		int dno = eVO.getDno();
		
		// pstmt에 입력
		try {
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, dno);
			
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 자원 반환
		db.close(pstmt);
		db.close(con);
		
		return cnt;
	}

	// 젤 마지막으로 들어온 사원 조회 함수
	public EmpVO getLast() {
		// 반환값 변수
		EmpVO eVO = new EmpVO();
		
		// DB 접근
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		// 명령
		String sql = jSQL.getSQL(jSQL.SEL_LAST);
		try {
			rs = stmt.executeQuery(sql);
			
			// 커서 한번 내리기.
			rs.next();
			
			// VO에 입력
			eVO.setEno(rs.getInt("empno"));
			eVO.setEname(rs.getString("ename"));
			eVO.setHdate(rs.getDate("hiredate"));
			eVO.setHtime(rs.getTime("hiredate"));
			eVO.setJob(rs.getString("job"));
			eVO.setDno(rs.getInt("deptno"));
			eVO.setSdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return eVO;
	}

	// 30번 부서 사원들 백업 함수
	public int bupD30() {
		// 반환값 변수
		int cnt = 0;
		
		// DB 접근
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		// 명령
		String sql = jSQL.getSQL(jSQL.BUP_JEMP_D30);
		try {
			cnt = stmt.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(stmt);
			db.close(con);
		}
		
		return cnt;
	}

	// 30번 부서 사원들 삭제 함수
	public int delD30() {
		// 변환값 변수
		int cnt = 0;
		
		// DB 접근
		con = db.getCON();
		stmt = db.getSTMT(con);
		
		// 명령
		String sql = jSQL.getSQL(jSQL.DEL_JEMP_D30);
		try {
			cnt = stmt.executeUpdate(sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(stmt);
			db.close(con);
		}
		
		return cnt;
	}
}
