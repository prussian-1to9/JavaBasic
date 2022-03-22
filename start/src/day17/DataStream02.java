package day17;
/*
	DataStream01에서 저장한 dataoutput.txt 파일을 읽어봅쉬다.
 */
import java.io.*;
public class DataStream02 {
/*
	Data output으로 저장한 파일은 Data input으로 읽고,
	읽는 순서도 동일해야함~!
 */
	public DataStream02() {
		// prepare Target Strem
		FileInputStream fin=null;
		// prepare Filter Stream
		DataInputStream din=null;
		
		try {
			fin=new FileInputStream("src/day17/result/dataoutput.txt");
			din=new DataInputStream(fin);
			
			// 저장할 때 이름, 나이, 성별, 키, rh, 혈액형, 전번, 메일 순으로 입력함
			String name=din.readUTF();
			int age=din.readInt();
			char gen=din.readChar();
			float height=din.readFloat();
			boolean rh=din.readBoolean();
			char bloodType=din.readChar();
			String tel=din.readUTF();
			String mail=din.readUTF();
			
			System.out.println(name+" ("+age+", "+gen+")");
			System.out.println("\t키 : "+height);
			System.out.println("\t혈액형 : "+(rh?"RH+ ":"RH- ")+bloodType);
			System.out.println("\t전화번호 : "+tel);			
			System.out.println("\t메일주소 : "+mail);			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new DataStream02();
	}
}
