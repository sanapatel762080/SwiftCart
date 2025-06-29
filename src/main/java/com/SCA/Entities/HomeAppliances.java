package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HomeAppliances {
	
	@Id
	private int haid;
	
	private String haname;
	
	private double haprice;
	
	private String hadescr;

	private String hadiscount;

	@Override
	public String toString() {
		return "HomeAppliances [haid=" + haid + ", haname=" + haname + ", haprice=" + haprice + ", hadescr=" + hadescr
				+ ", hadiscount=" + hadiscount + "]";
	}

	public HomeAppliances(int haid, String haname, double haprice, String hadescr, String hadiscount) {
		super();
		this.haid = haid;
		this.haname = haname;
		this.haprice = haprice;
		this.hadescr = hadescr;
		this.hadiscount = hadiscount;
	}

	public HomeAppliances() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHaid() {
		return haid;
	}

	public void setHaid(int haid) {
		this.haid = haid;
	}

	public String getHaname() {
		return haname;
	}

	public void setHaname(String haname) {
		this.haname = haname;
	}

	public double getHaprice() {
		return haprice;
	}

	public void setHaprice(double haprice) {
		this.haprice = haprice;
	}

	public String getHadescr() {
		return hadescr;
	}

	public void setHadescr(String hadescr) {
		this.hadescr = hadescr;
	}

	public String getHadiscount() {
		return hadiscount;
	}

	public void setHadiscount(String hadiscount) {
		this.hadiscount = hadiscount;
	}
	
	

}
