package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	
	private String lname;
	
	private double lprice;
	
	private String ldescr;

	private String ldiscount;

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + ", ldescr=" + ldescr + ", ldiscount="
				+ ldiscount + "]";
	}

	public Laptop(int lid, String lname, double lprice, String ldescr, String ldiscount) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lprice = lprice;
		this.ldescr = ldescr;
		this.ldiscount = ldiscount;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getLprice() {
		return lprice;
	}

	public void setLprice(double lprice) {
		this.lprice = lprice;
	}

	public String getLdescr() {
		return ldescr;
	}

	public void setLdescr(String ldescr) {
		this.ldescr = ldescr;
	}

	public String getLdiscount() {
		return ldiscount;
	}

	public void setLdiscount(String ldiscount) {
		this.ldiscount = ldiscount;
	}
	
	

}
