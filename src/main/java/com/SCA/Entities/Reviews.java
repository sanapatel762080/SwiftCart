package com.SCA.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reviews {
	
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
   private String hname;
	
	private double hprice;
	
	private String descr;
	
	private String review;
	
	private int ratings;
	
	@Column(name="Customer_name")
	private String name;

	
	public Reviews(int id, String hname, double hprice, String descr, String review, int ratings, String name) {
		super();
		this.id = id;
		this.hname = hname;
		this.hprice = hprice;
		this.descr = descr;
		this.review = review;
		this.ratings = ratings;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", hname=" + hname + ", hprice=" + hprice + ", descr=" + descr + ", review="
				+ review + ", ratings=" + ratings + ", name=" + name + "]";
	}

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
