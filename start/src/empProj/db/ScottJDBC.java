package empProj.db;
/*
	이 클래스는 oracle의 scott 계정으로
	JDBC 작업을 할 때 필요한 scott 전용 부품을 만들 예정이다.
	
	어제까지 작업 내용을 보면 반복작업이 많은데,
	이런 반복 작업을 좀 더 편하게 하기 위해
	여러 클래스로 나누어 사용할 예정이다.
 */
import java.sql.*;
public class ScottJDBC {
/*
	이 클래스를 어디선가 사용하고자 한다면
	new 명령과 생성자 함수 호출로 인스턴스를 만들 것이고
	
	그 순간에, 자동으로 oracle 드라이버 로딩이 되었으면 한다.
 */
	public ScottJDBC() {		
		// 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("* * * 드라이버 로딩 실패 * * *");
			e.printStackTrace();
		}
		
	}

	// 오라클 세션을 요구하면 대신 접속해서 반환해주는 기능의 함수
	public Connection getCON() {
		// 반환값 변수
		Connection con=null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		
		// 커넥션 연결
		try {
			con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 반환
		return con;
	}

	// 명령 전달도구를 요구하면 준비해서 반환해주는 함수
	public Statement getSTMT(Connection con) {
		// 반환값 초기화
		Statement stmt = null;
		
		// 명령 전달도구 준비
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
				양방향 이동 가능한 Statement 만들기~
				
					ResultSet의 Type
						1. TYPE_FORWARD_ONLY
							==> scroll이 불가한 前방향 전용
							
						2. TYPE_SCROLL_INSENSITIVE
							==> scroll은 가능하나, 변경사항은 적용되지 않음
							
						3. TYPE_SCROLL_SENSITIVE
							==> scroll도 가능, 변경사항 적용도 가능.
							
					Concurrency의 Type
						1. CONCUR_READ_ONLY
							==> ResultSet 객체 변경 불가!
							
						2. CONCUR_UPDATEABLE
							==> ResultSet 객체 변경 가능!
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 반환
		return stmt;
	}

	// PreparedStatement 반환해주는 함수
	public PreparedStatement getPSTMT(Connection con ,String sql) {
		// 변수 초기화
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 반환
		return pstmt;
	}

	// 사용하지 않는 자원 반환함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			}else if(o instanceof Statement) {
				((Statement)o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			}else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
 }