package com.hibernate.HibernateTest;

public class Stud {
	int id;
	String name;
	int fees;
	
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stud(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
}
