package day17;
/*
	파일에 친구의 정보를 저장해보자.
	정보는
		이름	String
		나이	int
		신장	float
		성별	char
		혈핵형 	char
		RH		boolean
		전화, 메일	String
 */
import java.io.*;
public class DataStream01 {

	public DataStream01() {
		// Stream 준비
		FileOutputStream fout=null;
		// Filter Stream 준비
		DataOutputStream dout=null;
		
		try {
			fout=new FileOutputStream("src/day17/result/dataoutput.txt");
			dout=new DataOutputStream(fout);
			
			// 데이터 준비
			String name="황인준";
			int age=23;
			char gen='M';
			float height=171.F;
			boolean rh=true;
			char bloodType='O';
			String tel="010-0323-0825", mail="yellow_3to3@7dream.com";
			
			// Data~Stream의 특징은 자바의 데이터를 변환않고 사용가능하다는 것.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeChar(gen);
			dout.writeFloat(height);
			dout.writeBoolean(rh);
			dout.writeChar(bloodType);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			// 완료 메세지
			System.out.println("소중한 곳에 붙이면 됩니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new DataStream01();
	}
}
