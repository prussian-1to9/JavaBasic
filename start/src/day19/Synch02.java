package day19;
/*
	ArrayList 하나를 준비해
	이곳에 데이터를 넣고 빼고를 할 것이다!
	
	1번 Thread	: 데이터 입력
	2번 Thread	: 데이터 출력
	
	규칙
		데이터가 6개 이상 입력될 수 없다.
 */
import java.util.*;
public class Synch02 {
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	public Synch02() {
		DataThread01 t1=new DataThread01(this);
		DataThread02 t2=new DataThread02(this);
		
		// Runnable로 전위
		t1.start();
		t2.start();
	}

	// 리스트에 데이터를 쌓는 함수
	synchronized void makeData(int num) {
		if(list.size()==5) {
			try {
				System.out.println("***채우는 작업 완.***");
				wait();
				
				// 리스트에 숫자 하나를 채운다.
				list.add(num);
				System.out.println(num+"을 채웠습니다.");
				System.out.println(list.size()+"개 채웠습니다.");
			}catch(Exception e) {
			}			
		}
		// 다른 Thread를 깨워주자!!
		notify();	//-> 젤 먼저 Block상태가 된 Thread가 실행됨
	}
	
	// 리스트에서 데이터를 꺼내는 함수
	synchronized void useData() {
		if(list.size()==0) {
			try {
				System.out.println("\t데이터 꺼내기 잠시 멈춤 . . .");
			}catch(Exception e){}
		}
		
		// 데이터 꺼내지
		int no=list.get(0);
		// 꺼내진 데이터는 삭제
		list.remove(0);
		System.out.println("\t"+no+"를 꺼냈습니다.");
		System.out.println("\t잔존 데이터 개수 : "+list.size()+"개");
		
		// 이제 넘겨주자고!
		notify();
	}

	// 메인메소드
	public static void main(String[] args) {
		new Synch02();
	}
}

// 사용할 클래스 만들어주기
class DataThread01 extends Thread{
	Synch02 main;
	
	public DataThread01() {}
	public DataThread01(Synch02 main) {
		this.main=main;
	}
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			int no=(int)(Math.random()*99+1);
			main.makeData(no);
			
			int sec=(int)(Math.random()*1501+500);
			try {
				Thread.sleep(sec);
			}catch(Exception e) {}
		}
	}
}

class DataThread02 extends Thread{
	Synch02 main;
	
	public DataThread02() {}
	public DataThread02(Synch02 main) {
		this.main=main;
	}
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			int no=(int)(Math.random()*99+1);
			main.useData();
			
			int sec=(int)(Math.random()*1501+500);
			try {
				Thread.sleep(sec);
			}catch(Exception e) {}
		}
	}
}