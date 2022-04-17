package empProj.sql;
/**
 * 이 클래스는 JEmp 테이블에 관련된 질의명령을 기억, 반환하는 클래스입니다.
 * 
 * @author 이지쨩
 * @since 2022.04.13
 * @version v.1.0
 */
import java.sql.*;
public class JEmpSQL {
	
	// 코드 상수 만들기
	public final int SEL_TNAME = 1001;
	public final int SEL_LAST = 1002;
	public final int INSERT_JEMP = 3001;
	public final int BUP_JEMP_D30 = 3002;
	public final int DEL_JEMP_D30 = 4001;
	public final int ADD_TABLE = 5001;
	
	// 매개변수(코드)와 함께 호출되면, 해당 코드의 질의명령을 반환.
	public String getSQL(int code) {
		
		// 반환값 변수 : StringBuffer사용
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		
		// jemp 테이블 생성
		case ADD_TABLE:
			buff.append("CREATE TABLE jemp ");
			buff.append("AS ");
			buff.append("	SELECT ");
			buff.append("		* ");
			buff.append("	FROM ");
			buff.append("		emp ");
			buff.append("	WHERE ");
			buff.append("		1=2 ");	// 구조만 복사
			break;
			
		// 테이블 생성 잘 됐는지 확인
		case SEL_TNAME:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	tab ");
			buff.append("WHERE ");
			buff.append("	tname = 'JEMP' ");
			break;
			
		// 젤 마지막에 들어온 사원 조회
		case SEL_LAST:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, deptno ");
			buff.append("FROM ");
			buff.append("	jemp ");
			buff.append("WHERE ");
			buff.append("	hiredate = ( ");
			buff.append("		SELECT ");
			buff.append("			MAX(hiredate) ");
			buff.append("		FROM ");
			buff.append("			jemp ");
			buff.append("	) ");
			break;
			
		// 데이터 입력
		case INSERT_JEMP:
			buff.append("INSERT INTO ");
			buff.append("	jemp(empno, ename, job, hiredate, deptno) ");
			buff.append("VALUES ( ");
			buff.append("	(SELECT NVL(MAX(empno) + 1, 1001) FROM emp), ");
			buff.append("	?, ?, sysdate, ? ");
			buff.append(") ");
			break;
			
		// 백업명령
		case BUP_JEMP_D30:
			buff.append("INSERT INTO jbackup ");
			buff.append("	SELECT ");
			buff.append("		e.*, sysdate ");
			buff.append("	FROM ");
			buff.append("		jemp e ");
			buff.append("	WHERE ");
			buff.append("		deptno = 30 ");
			break;
			
		// 삭제 명령
		case DEL_JEMP_D30:
			buff.append("DELETE FROM ");
			buff.append("	jemp ");
			buff.append("WHERE "); // JDBC는 명령후 자동 커밋되기에.. 조건은 꼭. 적어주면. 되.
			buff.append("	deptno = 30 ");
			break;
		}
		
		// String buffer->String 변환 후 반환
		return buff.toString();
	}

}
