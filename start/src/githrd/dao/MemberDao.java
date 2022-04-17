package githrd.dao;

import java.sql.*;
import java.util.*;

import githrd.db.*;
import githrd.sql.*;
import githrd.vo.*;
public class MemberDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EzJDBC db;
	private MemberSQL mSQL;

	public MemberDao() {
		db = new EzJDBC();
		mSQL = new MemberSQL();
	}

	// 회원번호, id 조회 함수
	public ArrayList<MemberVO> selAll() {
		// 반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		// db 접근
		con = db.getCon();
		stmt = db.getStmt(con);
		
		// 명령
		String sql = mSQL.getSQL(mSQL.SEL_ALL);
		try {
			rs = stmt.executeQuery(sql);
			
			// 데이터 입력
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setPw(rs.getString("pw"));
				
				list.add(mVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}

	// 입력된 회원번호로 정보 조회 함수
	public ArrayList<MemberVO> selMeb(int mno) {
		// 반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		// db 접근
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEB);
		pstmt = db.getPstmt(con, sql);
		
		// 명령
		try {
			pstmt.setInt(1, mno);
			rs = pstmt.executeQuery();
			
			// list에 담기
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setPw(rs.getString("pw"));
				mVO.setTel(rs.getString("tel"));
				mVO.setMail(rs.getString("mail"));
				mVO.setJdate(rs.getDate("joindate"));
				mVO.setJtime(rs.getTime("joindate"));
				mVO.setSdate();
				mVO.setGen(rs.getString("gen"));
				mVO.setAvt(rs.getInt("avt"));
				
				list.add(mVO);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return list;
	}

	// 입력된 id로 전화번호 수정 함수
	public int altTel(String id, String tel) {
		// 반환값 변수
		int cnt = 0;
		
		// db 접근
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.ALT_TEL);
		pstmt = db.getPstmt(con, sql);
		
		// 명령
		try {
			pstmt.setString(1, tel);
			pstmt.setString(2, id);
			
			// 명령 여부 확인
			cnt = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	// (예외처리용) id가 존재하는지 확인하는 함수
	public boolean checkId(String id) {
		// 반환값 변수
		boolean bool = false;
		
		// db접근
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.CHK_ID);
		
		// 명령
		stmt = db.getStmt(con);
		try {
			rs = stmt.executeQuery(sql);
			
			// 동일한 id가 있는지 체크
			int cnt = 0;
			while(rs.next()) {
				if (rs.getString("id") == id) cnt++;
			}
			
			if (cnt >= 1) bool = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원 반환
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return bool;
	}

	// 회원가입 함수
	public int insertMeb(String name, String id, String pw, String mail, String tel, String gen, int avt) {
		// 반환값 변수
		int cnt = 0;
		
		// db 접근
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.INSERT_MEB);
		pstmt = db.getPstmt(con, sql);
		
		// 명령
		try {
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, mail);
			pstmt.setString(5, tel);
			pstmt.setString(6, gen);
			pstmt.setInt(7, avt);
			
			// 제대로 됐는지 확인
			cnt = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 자원반환
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
}