package com.SCA.Entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class YourOrders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	private String address;
	
	@Column(name="cname")
	private String name;
	
	@Column(name="quantity")
	private int count;
	
	@Column(name="contactdetails")
	private long contact;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="DateOfOrder")
	private Date date;
	
	private String hname;
	
	private double hprice;
	
	private String descr;

	@Override
	public String toString() {
		return "YourOrders [address=" + address + ", name=" + name + ", count=" + count + ", contact=" + contact
				+ ", date=" + date + ", id=" + id + ", hname=" + hname + ", hprice=" + hprice + ", descr=" + descr
				+ "]";
	}

	public YourOrders(String address, String name, int count, long contact, Date date, int id, String hname,
			double hprice, String descr) {
		super();
		this.address = address;
		this.name = name;
		this.count = count;
		this.contact = contact;
		this.date = date;
		this.id = id;
		this.hname = hname;
		this.hprice = hprice;
		this.descr = descr;
	}

	public YourOrders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void seId(int id) {
		this.id = id;
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
	
	

	



}
