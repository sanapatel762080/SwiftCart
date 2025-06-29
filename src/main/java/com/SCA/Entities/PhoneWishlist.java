package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PhoneWishlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	private String pname;
	
	private double pprice;
	
	private String pdescr;

	private String pdiscount;

	@Override
	public String toString() {
		return "PhoneWishlist [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pdescr=" + pdescr
				+ ", pdiscount=" + pdiscount + "]";
	}

	public PhoneWishlist(int pid, String pname, double pprice, String pdescr, String pdiscount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pdescr = pdescr;
		this.pdiscount = pdiscount;
	}

	public PhoneWishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getPdescr() {
		return pdescr;
	}

	public void setPdescr(String pdescr) {
		this.pdescr = pdescr;
	}

	public String getPdiscount() {
		return pdiscount;
	}

	public void setPdiscount(String pdiscount) {
		this.pdiscount = pdiscount;
	}
	
	

}
