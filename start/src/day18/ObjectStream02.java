package day18;
/*
	Test06에서 저장한 rj.txt 파일을 읽어봅쉬다.
 */
import java.io.*;
public class ObjectStream02 {// Test07

	public ObjectStream02() {
		// Target Stream
		FileInputStream fin=null;
		// Filter Stream
		ObjectInputStream oin=null;
		
		try {
			// Stream 연결
			fin=new FileInputStream("src/day18/result/rj.txt");
			oin=new ObjectInputStream(fin);
			
			// 클래스 통째로 읽어온다.
			Friend ren=(Friend) oin.readObject();
			// 선생님은 다 불러와서 하나씩 쓰셨지만
			// 난 toString 함수 Override 했으니
			// 그대로 출력해보겠음!
			System.out.println(ren);	// 된다!!
			
			// + 참고! 선생님이 불러왔을때 눈에 보인것
			boolean rh=ren.isRh();	// boolean타입은 get이아니라 is함수였음.
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new ObjectStream02();
	}
}
