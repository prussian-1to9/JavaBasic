package day18;
/*
	런쥔이의 정보를 Friend 클래스를 이용해 저장해보자!
	ObjectOutputStream을 이용해 저장해보자!
 */
import java.io.*;
public class ObjectStream01 {// Test06

	public ObjectStream01() {
		// Target Stream 작성
		FileOutputStream fout=null;
		// Filter Stream 작성
		ObjectOutputStream oout=null;
		
		// 객체 만들기
		Friend rj=new Friend();
		rj.setName("황인준");
		rj.setAge(23);
		rj.setGen('M');
		rj.setHeight(171.F);
		rj.setRh(true);
		rj.setBlood("O");
		rj.setAddr("GWANGYA");
		rj.setMail("yellow_3to3@7dream.com");
		rj.setTel("010-0323-0825");
		
		try {
			// 스트림 연결
			fout=new FileOutputStream("src/day18/result/rj.txt");
			oout=new ObjectOutputStream(fout);
			
			// txt로 작성해봅시다!
			oout.writeObject(rj);
			
			// 결과 출력
			System.out.println("저장 성공~~");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new ObjectStream01();
	}
}
