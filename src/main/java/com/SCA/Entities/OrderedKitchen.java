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
public class OrderedKitchen {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
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
	
	private String pay;

	@Override
	public String toString() {
		return "OrderedKitchen [id=" + id + ", address=" + address + ", name=" + name + ", count=" + count
				+ ", contact=" + contact + ", date=" + date + ", pay=" + pay + "]";
	}

	public OrderedKitchen(int id, String address, String name, int count, long contact, Date date, String pay) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.count = count;
		this.contact = contact;
		this.date = date;
		this.pay = pay;
	}

	public OrderedKitchen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}
	
	
	



}
