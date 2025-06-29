package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WomensFashion {
	
	@Id
	private int hid;
	
	private String hname;
	
	private double hprice;
	
	private String descr;

	private String hdiscount;

	@Override
	public String toString() {
		return "WomensFashion [hid=" + hid + ", hname=" + hname + ", hprice=" + hprice + ", descr=" + descr + ", hdiscount="
				+ hdiscount + "]";
	}

	public WomensFashion(int hid, String hname, double hprice, String descr, String hdiscount) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hprice = hprice;
		this.descr = descr;
		this.hdiscount = hdiscount;
	}

	public WomensFashion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public double getHprice() {
		return hprice;
	}

	public void setHprice(double hprice) {
		this.hprice = hprice;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getHdiscount() {
		return hdiscount;
	}

	public void setHdiscount(String hdiscount) {
		this.hdiscount = hdiscount;
	}
	
	


}
