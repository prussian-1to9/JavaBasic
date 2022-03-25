package day19;
/*
	네트워크에서 가장 중요한 요소는
	IP주소!!!
	java는 IP 주소의 정보를 관리하는 클래스를 제공한다.
	==>InetAddress
	
	1. 내 컴퓨터의 IP 주소를 알아보자
	2. naver 서버의 IP 주소를 알아보자
 */
import java.net.*;
public class Test01 {

	public Test01() {
	/*
		방법
			getByName(String host)	: 지정한 주소를 이용해 IP주소 관리
			
			getLocalHost()			: 현재 시스템의 IP주소 알려줌.
			
			+ localhost : 현재 시스템.
	 */
		InetAddress inet=null;
		try {
			inet=InetAddress.getLocalHost();
			/*
				InetAdress 클래스는 정보를 관리하는 클래스이므로
				정보를 꺼내는 함수가 중요함수가 된다.
				
				1. IP도출 함수
					getHostAddress()
					
				2. 도메인 도출 함수
					getHosstName()
			 */
			String ip=inet.getHostAddress();
			String name=inet.getHostName();
			
			System.out.println("IP : "+ip);
			System.out.println("장비 이름 : "+name);
			System.out.println();
			
			// 네이버 정보를 빼내보잣!
			inet=InetAddress.getByName("www.naver.com");
			
			// 정보를 꺼내보자!
			String nIp=inet.getHostAddress();
			String nName=inet.getHostName();
			
			System.out.println("[NAVER]");
			System.out.println("IP : "+nIp);
			System.out.println("시스템 이름 : "+nName);
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test01();
	}
}
