package day17;

import java.util.Scanner;
import java.io.*;
public class SystemIn01 {// Test06

	public SystemIn01() {
		// 우리가 여태 뭔가 입력받을 땐 Scanner 썼쥬.
		// 이 친구의 생성방법은
		Scanner sc=new Scanner(System.in/*요게 InputStream*/);
		// 이게 익숙했지만... File도 입력이 된답니다!
		File file=new File("src/day17/result/FileTest01.txt");
		Scanner scan=null;
		try{
			scan=new Scanner(file);
			String str=scan.nextLine();
			System.out.println(str);
			
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}// 직접, 경로로 넣어주면 try-catch 안해줘도 됨.
		
		
	}

	public static void main(String[] args) {
		new SystemIn01();
	}
}
