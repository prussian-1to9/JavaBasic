package day18;

public class ThreadControl01 {// Test12

	public ThreadControl01() {
		Dh d=new Dh();
		Rj r=new Rj();	// new Born
		
		// Runnable로 전위
		d.start();
		r.start();
	}

	public static void main(String[] args) {
		new ThreadControl01();
	}
}

// 사용할 클래스 작성
class Dh extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			if(i==999){
				System.out.println((i+1)+"번째 여우를 센 끝에 인준이를 만났다!");
			}else {
				System.out.println("이동혁이 "+(i+1)+"번째 여우를 셉니다.");
			}
			/*
				한마리 셌으면 런쥔이한테 차례를 넘기셔!
				Runnable로 전위를 하라고!
			 */
			yield();
		}
	}
	
}

class Rj extends Thread{	// Dh과 똑같이!
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			if (i==999) {
				System.out.println((i+1)+"번 곰을 센 끝에 동혁이를 만났다!");
			}else {
				System.out.println("황인준이 "+(i+1)+"번째 곰을 셉니다.");
			}
			yield();
		}
	}
	
}