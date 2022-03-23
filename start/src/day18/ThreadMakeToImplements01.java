package day18;
/*
	Runnable 인터페이스를 구현한 Thread 프로그램을 만들어보자
 */
public class ThreadMakeToImplements01 {// Test10

	public ThreadMakeToImplements01() {
		// Runnable을 구현한 클래스들을 만들었다!
		
		// 1. new 시키기
		Mark mark=new Mark();
		Jwoo jwoo=new Jwoo();	// new Born 상태X
		
		// 2. new Thread 시켜 new Born 으로 전위
		Thread m=new Thread(mark);
		Thread j=new Thread(jwoo);
		
		// Runnable상태로 전위
		m.start();
		j.start();
	}

	public static void main(String[] args) {
		new ThreadMakeToImplements01();
	}
}

// 사용할 클래스 작성
class Mark implements Runnable{
	@Override
	public void run() {
		quest();
	}
	
	public void quest() {
		for(int i=0; i<1000; i++) {
			System.out.println("******마크가 "+(i+1)+"번째 수박을 먹었다!");
		}
	}
}

class Jwoo implements Runnable{
	@Override
	public void run() {
		answer();
	}
	
	public void answer() {
		for(int i=0; i<1000; i++) {
			System.out.println("######정우의 1day "+(i+1)+"meals!");
		}
	}
}