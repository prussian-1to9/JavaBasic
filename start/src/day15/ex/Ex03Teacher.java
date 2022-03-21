package day15.ex;

import java.util.*;
public class Ex03Teacher {
	ArrayList names=new ArrayList();	// 배열 쓰지 말래.
	public Ex03Teacher() {
		setNames();
	}

	public void setNames() {
		names.add("태일");
		names.add("쟈니");
		names.add("태용");		// 이런식으로 하라네여.
		names.add("유타");
		names.add("도영");
		names.add("재현");
		names.add("윈윈");
		names.add("정우");
		names.add("마크");
		names.add("해찬");
	}
	
	public static void main(String[] args) {
		new Ex03Teacher();
	}
}
