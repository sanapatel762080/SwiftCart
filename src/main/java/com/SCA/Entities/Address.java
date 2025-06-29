package com.SCA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	private int pincode;
	private int laneno;
	private String colName;
	private String city;
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", laneno=" + laneno + ", colName=" + colName + ", city=" + city + "]";
	}
	public Address(int pincode, int laneno, String colName, String city) {
		super();
		this.pincode = pincode;
		this.laneno = laneno;
		this.colName = colName;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getLaneno() {
		return laneno;
	}
	public void setLaneno(int laneno) {
		this.laneno = laneno;
	}
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
