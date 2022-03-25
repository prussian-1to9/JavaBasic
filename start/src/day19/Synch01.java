package day19;

public class Synch01 {
	int[] num=new int[5];
	
	public Synch01() {
		super();	// 상위클래스의 기본 생성자가 호출됐다.
		
		/*	this	: 현재 실행중인 자기 자신의 주소를 기억
			super	: 상위클래스의 주소를 기억
		 */
		NumThread01 t1=new NumThread01(this);
		NumThread02 t2=new NumThread02(this);	// new Born
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Synch01();
	}
}

// 사용할 클래스 생성
class NumThread01 extends Thread{
	Synch01 main;	// 넘겨주는 주소 받을 준비
	
	public NumThread01(Synch01 main) {
		this.main=main;
	}
	
	@Override
	public void run() {
		/*	이 Thread에선, 배열변수에 데이터를 기억하는 역할을 한다.
			이 Thread가 5개의 배열을 완성할 때 까진
			
			다른 Thread는 배열을 사용하지 못하게 하고 싶다!
		 */
		
		System.out.println("저장하겠읍니다 . . .");
		for(int i=0; i<5; i++) {
			int no=(int)(Math.random()*99+1);
			main.num[i]=no;
			
			// 출력
			System.out.println((i+1)+"번째 방에 ["+no+"]를 저장했습니다.");
			
			// 잠시 sleep. 근데 0.5~2초 랜덤하게
			int sec=(int)(Math.random()*(2000-500+1)+500);
			try {
				Thread.sleep(sec);
			}catch(Exception e) {}
		}
		System.out.println("저장 완료~~~~~~~!");
	}
}

class NumThread02 extends Thread{
	Synch01 main;	// 주소 기억할 준비
	
	public NumThread02() {}
	public NumThread02(Synch01 main) {
		this.main=main;
	}
	@Override
	public void run() {
		// 이 Thread는 배열 변수의 데이터를 꺼내 사용하는 역할!
		synchronized(main.num) {
			// main의 num배열을 사용할 때, 타 Thread가 얘를 건들면 안됨!
			
			for(int i=0; i<5; i++) {
				int no=main.num[i];
				
				// 출력
				System.out.println("\t\t"+no+"가 나왔다!");
				
				// 마찬가지로, 랜덤시간 sleep
				try {
					Thread.sleep((int)(Math.random()*1501+500));
				}catch(Exception e){}
			}
			System.out.println("사용 종료######################");
		}
	}
	
}