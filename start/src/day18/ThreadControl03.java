package day18;

public class ThreadControl03 {

	public ThreadControl03() {
		EndClass eCls=new EndClass();	// new Born
		// Runnable로 전위
		eCls.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main is running . . ."+(1+i));
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		eCls.stop();	// 금지명령임~
	}

	// 메인메소드
	public static void main(String[] args) {
		new ThreadControl03();
	}
}

// 사용할 클래스 생성
class EndClass extends Thread{
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("\tThread is running . . .");
			try {
				Thread.sleep(500);	// 0.5sec
			}catch(Exception e) {}
		}
	}
}