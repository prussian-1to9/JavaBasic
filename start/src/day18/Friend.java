package day18;
/*
	이 클래스가 직렬화 되기 위해서는 (이 클래스의 객체째로 넘기려면)
	직렬화 가능한 클래스여야 함.
	방법
		implements Serializable (io클래스 import 필수!)
		
	이 때 전달되는 데이터는, 변수만 전달이 됨!
	(메소드는 X)
	따라서 데이터를 쓰려면, 받는쪽에서도 동일 클래스가 있어야 함!
*/
import java.io.*;
public class Friend implements Serializable {
	private String name, tel, mail, addr, blood;
	private int age;
	private float height;
	private char gen;
	private boolean rh;
	
	public Friend() {}

	// Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public boolean isRh() {
		return rh;
	}

	public void setRh(boolean rh) {
		this.rh = rh;
	}

	@Override
	public String toString() {
		return name + "("+age+", "+gen+")\n" 
				+ "HEIGHT : "+height+"\nBLOOD TYPE : "+(rh?"RH+":"RH-")+blood+"\nTEL : "+tel 
				+ "\nMAIL : " + mail + "\nADDR : " + addr;
	}

}
