package day18;

public class ThreadControl04 {// Test15

	public ThreadControl04() {
		Ty tytrack=new Ty();	// new Born
		tytrack.start();		// Runnable
		
		for(int i=0; i<10; i++) {
			System.out.println("이동혁 : (드릉드릉)");
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}
		
//		tytrack.stop();	// deplecated Method라 취소선이 뜸!
		// 코드의 실행상 자연스럽게 종료되는 방향을 추천한다.
		
		tytrack.setStart(false);
	}

	public static void main(String[] args) {
		new ThreadControl04();
	}
}

// 사용할 클래스 생성
class Ty extends Thread{
	private boolean isStart=true;	// 초기화
	
	public boolean isStart() {
		return isStart;
	}
	
	public void setStart(boolean isStart) {
		this.isStart=isStart;	// 일종의 온오프 스위치를 만드는 것.
	}

	@Override
	public void run() {
		while(isStart) {	// 스위치가 켜져있을 때만 실행
			System.out.println("뿌밍 씨스템 어. 어. 티와퉭. 티와퉭.");
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
		}
	}
	
	
}