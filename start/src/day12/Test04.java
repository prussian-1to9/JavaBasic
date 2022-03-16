package day12;

import java.util.*;
public class Test04 {
	public Test04() {
//		Calendar cal=new Calendar();	추상클래스라 new 안됨!
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}
