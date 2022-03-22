package day17;
// 키보드를 이용해 문자를 입력받아보자~
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class SystemIn02 {// Test07
	public SystemIn02() {
		/*	키보드는 자주 쓰는 외부장치이기 때문에,
			이클립스 안에서 이미 Stream을 준비해둔 변수가 존재함.
			고게 바로 System.in입니다!
		 */
		
		System.out.println("입력해주셔유.");
		int ch=0;
		try {
			/* 1. 한글자만 읽어보자
			ch=System.in.read();
			
			// 출력
			System.out.println("입력된 문자 : "+(char)ch);*/
			
			/* 2. 문장을 입력해서 읽어보자
			byte[] buff=new byte[256];
			// 배열의 크기=한번에 처리할 수 있는 양
			int len=System.in.read(buff);	// 읽은 문자의 개수 반환
			
			// 읽은 데이터를 문자로 반환
			String str=new String(buff, 0, len);
			
			// 출력
			System.out.println("입력된 문자열 : "+str);
			*/
			// 3. 주로 네트워크 처리를 할 때 많이 쓰는 방법
			byte[] buff=new byte[256];
			
			// 배열 모든 방에 기본값 'A' 채우기
			Arrays.fill(buff, (byte)'A');
			int len=System.in.read(buff, 10, 100);// buff의 11번재 방부터 입력됨
			// 100이라고 설정한건 최대치임!
			
			String str=new String(buff, 0, len+10);
			System.out.println("입력된 문자열 : "+str);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SystemIn02();
	}
}
