package day17;

import java.io.*;
public class File01 {//Test04
/*	1. result 패키지에 폴더를 강제로 만들어 봅시다!
	2. 계층화된 폴더를 강제로 만들어 봅시다!
	3. 만들어진 파일 중 하나를 삭제해 봅시다! (폴더도 파일로 간주됨)
	4. 만들어진 파일 중 하나의 이름을 변경합시다!
 */
	public File01() {
		// 1.
		/* 만들고 싶은 폴더 생성(폴더가 위치에 없어도 노상관)
		File file=new File("src/day17/result/dinoAbc");
		
		// 확인차 출력
		String msg=file.mkdir()?"폴더 생성 성공":"폴더 생성 실패";
		System.out.println(msg);
		*/
		
		/* 2.
		File file=new File("src/day17/result/a/b/c/d");
		String msg=file.mkdirs()?"폴더 생성 성공":"폴더 생성 실패";
		System.out.println(msg);
		*/
		
		/* 3. 2번에서 만든 d 폴더 지워보기
		File file=new File("src/day17/result/a/b/c/d");
		String msg=file.delete()?"폴더 삭제 성공":"폴더 삭제 실패";
		System.out.println();
		*/
		
		// 4.
		// 현재 파일과, 바꿀 이름의 파일을 둘 다 File로 만든다!
		File oldF=new File("src/day17/result/a/b/c");
		File newF=new File("src/day17/result/a/b/compsognathus");
		
		// 바꾸기~
		String msg=oldF.renameTo(newF)?"이름 변경 성공":"이름 변경 실패";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		new File01();
	}
}
