package jdbc;

// JDBC 사용을 위해 준비한 패키지를 import
import java.sql.*;

public class Test01 {// Test01 (22.04.04)

	public Test01() {
		try {
			/*
				JDBC와 외부 DB를 연결할 드라이버 load
				
				외부 클래스 로딩하는 함수
					Class.forName()
				드라이버마다 외부 클래스의 이름이 조금씩 다르다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// forName() 명령이 실행되면, JDBC가 해당 드라이버를 load한다.
			
			// 로딩 성공 메세지
			System.out.println("드라이버 로딩 성공");
			
			/* 	드라이버는 로딩됐고, 이제 Oracle에 접속을 시도한다.
			 	접속방법(URL)은 DB마다 차이가 난다. (구글링 要)
			 	
			 	Session		: Oracle 관점에서의 DBMS과 연결
			 	Connection	: DBMS 관점에서의 DBMS와 연결			 	*/
			
			// JDBC에 명령해주기 : DriverManager.getConnection(url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 얘는 꼭 암기!!! DB 서버 주소임!
			Connection con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 접속 성공 메세지
			System.out.println("DB 접속 성공");
			
			/*
				이 처럼, 접속하면 접속자를 관리하는 Session을 제공하게 되는데
				이 Session을 관리하는 클래스가 Connection이다.
				
				-------------------------------------
				이 아래부터는 타 DB들도 다 비슷하다!!
			 */
			
			// 명령 전달 도구 만들기
			Statement stmt = con.createStatement();
			
			// 질의명령 준비 : emp 테이블의 모든 사원 이름 조회
			String sql="SELECT * FROM emp";		// 문자열 안에 세미콜론 ; 이 들어가면 안된다!
			
			// 전달 도구에 질의명령 담아 JDBC에 보내기
			ResultSet rs=stmt.executeQuery(sql);	// 명령을 전달하고, 결과를 받아오는 함수임.
			/*
				ResultSet은 조회 질의명령을 관리하는 클래스다.
				ResultSet 커서의 초기값은 BOFF(Begin of File)이다.
				
				결과가 여러행이므로, 반복처리한다.
			 */
			while(rs.next()) {// next : 커서를 한칸 아래로 이동한다. 데이터가 있으면 true 없으면 false.
				
				// oracle에서 char/string구분이 없었기에, 무조건 문자열로 꺼내게 된다.
				// 질의명령 String에 별칭을 사용했을 경우, 별칭도 사용 가능!
				String name=rs.getString("ename");
				int no=rs.getInt("empno");
				
				System.out.printf("%6d\t%10s\n", no, name);
			}
			
			// 자원 반환
			rs.close();		// ResultSet 닫아주기
			stmt.close();	// 전달 도구 닫아주기
			con.close();	// Connection 닫아주기
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
