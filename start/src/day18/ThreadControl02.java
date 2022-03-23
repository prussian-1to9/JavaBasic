package day18;

public class ThreadControl02 {// Test13

	public ThreadControl02() {
		// 객체 만들기
		Taeyong t=new Taeyong();
		Doyong d=new Doyong();	// Runnable 구현이니까 아직 not new Born
		
		// new Born 시키기
		Thread ty=new Thread(t);
		Thread dy=new Thread(d);
		
		// Runnable로 전위
		ty.start();
		dy.start();
	}

	// 메인 메소드
	public static void main(String[] args) {
		new ThreadControl02();
	}
}

// 사용할 클래스 생성
class Taeyong implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("이태용이 "+(i+1)+"번째 고구마 말랭이를 먹는다.");
			// 이번엔 아예 Block상태로 보내보자!
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
	}
}

class Doyong implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("\t김도영 : "+(i+1)+"번째 고구마 말랭이다.. 언제까지 먹을래?");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}