package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HomeAppliancesWishlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	
	private String hname;
	
	private double hprice;
	
	private String hdescr;

	private String hdiscount;

	@Override
	public String toString() {
		return "HomeAppliancesWishlist [hid=" + hid + ", hname=" + hname + ", hprice=" + hprice + ", hdescr=" + hdescr
				+ ", hdiscount=" + hdiscount + "]";
	}

	public HomeAppliancesWishlist(int hid, String hname, double hprice, String hdescr, String hdiscount) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hprice = hprice;
		this.hdescr = hdescr;
		this.hdiscount = hdiscount;
	}

	public HomeAppliancesWishlist() {
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

	public String getHdescr() {
		return hdescr;
	}

	public void setHdescr(String hdescr) {
		this.hdescr = hdescr;
	}

	public String getHdiscount() {
		return hdiscount;
	}

	public void setHdiscount(String hdiscount) {
		this.hdiscount = hdiscount;
	}
	
	

}
