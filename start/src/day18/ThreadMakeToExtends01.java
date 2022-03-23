package day18;
/*
	Thread 프로그램을 실행 해보자.
	
	1. Thread 프로그램은 반드시 new Born 상태로 만들어야 함
	
		new Born 상태란?
		실행 가능한 프로그램으로 만든다는 의미!
		==> java 에선 new 시키는 것
 */
public class ThreadMakeToExtends01 {// Test09

	public ThreadMakeToExtends01() {
		// Thread 작성
		MyThread01 jaemin=new MyThread01();	// new Born 상태
		MyThread02 jeno=new MyThread02();	// new Born 상태
		
		// 이걸 실행하려면 Thread 프로그램이 Runnable 상태면 OK!
		// new Born 상태를 Runnable로 전위 : start()
		jaemin.start();
		jeno.start();
		System.out.println("생성자쪽 종료");
	}

	public static void main(String[] args) {
		new ThreadMakeToExtends01();
		System.out.println("메인함수 종료");
	}
}

// 클래스 작성
class MyThread01 extends Thread{
	// 다른 맴버를 작성하지 않고, 테스트만 해본다.
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("\t\t***나재민의 사진 "+(i+1)+"장 째");
		}
	}
	
}

class MyThread02 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("\t\t***제노의 자전거 바퀴 "+(i+1)+"번째 회전");
		}
	}
}