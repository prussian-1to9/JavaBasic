package githrd.vo;

import java.sql.*;
import java.text.*;
public class MemberVO {
	private int mno, avt;
	private String name, id, pw, tel, sdate, mail, gen;
	private Date jdate;
	private Time jtime;
	
	public MemberVO() {}

	// Getter Setter
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getAvt() {
		return avt;
	}

	public void setAvt(int avt) {
		this.avt = avt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public void setSdate() {
		SimpleDateFormat dform = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat tform = new SimpleDateFormat("HH:mm:ss");
		
		this.sdate = dform.format(jdate) + tform.format(jtime);
	}
	
	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public Date getJdate() {
		return jdate;
	}

	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

	public Time getJtime() {
		return jtime;
	}

	public void setJtime(Time jtime) {
		this.jtime = jtime;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
