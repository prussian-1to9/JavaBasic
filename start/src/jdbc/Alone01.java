package jdbc;

import java.sql.*;
public class Alone01 {// Test01 리뷰 (22.04.04)

	public Alone01() {
		try {
			// 외부 클래스 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 로딩 성공 메세지
			System.out.println("드라이버 로딩 성공");
			
			// oracle 접속 시도
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url, "scott", "tiger");
			
			// 접속 성공 메세지
			System.out.println("DB 접속 성공");
			
			// 명령하기
			// 전달도구 만들기
			Statement stmt=con.createStatement();
			
			// 질의명령 준비
			String query="SELECT * FROM emp, dept WHERE emp.deptno=dept.deptno";
			
			// 전달도구에 담아 JDBC에 보내기
			ResultSet rs=stmt.executeQuery(query);
			
			// 조회 하고 출력해보기
			while(rs.next()) {
				int no=rs.getInt("empno");
				String name=rs.getNString("ename");
				String dloc=rs.getString("loc");
				int sal=rs.getInt("sal");
				
				System.out.println(no+"\t"+name+"\n\t"+dloc+"지부\n\t연봉 : "+sal);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Alone01();
	}
}
