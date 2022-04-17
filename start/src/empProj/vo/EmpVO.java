package empProj.vo;

import java.sql.*;
import java.text.*;
public class EmpVO {
	private int eno, mgr, dno, sal, grade;
	private String ename, job, sname, sdate, comm, loc, dname;
	private Date hdate;
	private Time htime;
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate() {
		SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		sdate = form1.format(hdate) + form2.format(htime);
	}
	
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public Date getHdate() {
		return hdate;
	}


	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}


	public Time getHtime() {
		return htime;
	}


	public void setHtime(Time htime) {
		this.htime = htime;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {

		return "사번 : " + eno + ", 사원 이름 : " + ename + ", 직급 : " + job + ", 급여 : " + sal
				+ ", 부서 번호 : "+ dno + ", 부서 위치 : "+ loc + ", 상사 사번 : " + mgr + ", 상사 이름 : " + sname + ", 입사일 : " + sdate
				+ ", 커미션 : " + comm;
	}
}
