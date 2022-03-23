package day18;

public class ThreadNameUsage01 {// Test11

	public ThreadNameUsage01() {
		NameThread t1=new NameThread("동혁");
		NameThread t2=new NameThread();	// new Born
		
		// Runnable로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new ThreadNameUsage01();
	}
}

// 사용할 클래스 작성

class NameThread extends Thread{
	/*	하나의 프로그램을 이용해 여러번 실행할 경우
		구분할 필요가 생길 수 있다.
		
		구분방법
			1. 변수 하나를 만들어, 값을 달리 입력
				String name;
				
			2. Thread 프로그램 자체에 이름을 부여
				이 때, 상위 클래스인 Thread의
				
					Thread(String name)
					
				을 사용한다. 상위 클래스의 기본 생성자가 아닌
				다른 생성자를 이용하면 Thread에 이름 부여 가능!
				
					super();
					
				얘는
					1. 반드시 생성자 안에서만 사용
					2. 반드시 첫줄 첫 문장으로 사용해야 함
					(this랑 비슷하죠?)
	 */
	public NameThread() {
		super("\t런쥔");	// 여러번 생성해도 같은 이름!
	}
	
	public NameThread(String name) {
		super(name);	// new 시킬때마다 입력된 이름으로 생성
	}

	@Override
	public void run() {
		/*	~Thread 이름 이용 방법~
				getName()		: 이름을 알아내는 함수
			를 이용!
			이 run()은 두번 실행 될텐데, 그때 순서를 무시한 병행처리가 될 것.
			현재 실행중인 Thread가 어떤 Thread인지 먼저 알아야 함.
				currentThread()
			를 이용!
		 */
		for(int i=0; i<1000; i++) {
			Thread t=Thread.currentThread();	// Thread 알아내기
			String name=t.getName();	// 이름 알아내기
			System.out.println(name+"이가 "+(i+1)+"번째 노래를 부릅니다.");
		}
	}
}