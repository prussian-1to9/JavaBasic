package day13;
/*
	poem.txt를 읽어서 출력해보자구요~
 */
import java.io.FileInputStream;
public class Test11 {

	public Test11() {
		FileInputStream fin=null;
		
		try {
			fin=new FileInputStream("src/day13/poem.txt");
			
			byte[] buff=new byte[1024];
			int len=fin.read(buff);
			String str=new String(buff, 0, len);
			System.out.println(str);
		} catch(Exception e) {
			System.out.println("[예외 발생]");
		}
	}

	public static void main(String[] args) {
		new Test11();
	}
}
