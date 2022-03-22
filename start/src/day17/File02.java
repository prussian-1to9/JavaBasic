package day17;

import java.io.*;
public class File02 {// Test05

	public File02() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir=new File("src/day17");
		
		/*목록을 꺼내보쉐이
		String[] flist=dir.list();
		
		// 출력
		for (String f : flist) {
			System.out.println(f);
		}
		*/
		/* 파일 정보도 꺼내봅시다.
		File[] infoList=dir.listFiles();
		
		// 정보 출력
		for (File f : infoList) {
			String fname=f.getName();
			long len=f.length();	// 파일 사이즈 추출
			String pold=f.getParent(); // 상위 폴더 이름 추출
			
			System.out.println(pold+"."+fname+" : "+len+"byte\n");
		}
		*/
		
		// 확장자가 jpg인 파일만 골라 출력하고자 한다면?
		String[] flist=dir.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// dir : 현재파일의 정보, name : 현재 파일의 이름
				// 자동 호출 함수임. 목록을 구하는 파일을 발견할 때
				// 이 함수가 호출됨. true가 나오면 결과에 포함.
				return name.endsWith(".jpg");
				// .jpg로 끝나는지 확인!
			}
		});
		
		for (String f :flist) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		new File02();
	}
}