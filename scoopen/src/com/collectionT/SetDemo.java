package com.collectionT;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	
	public static void main(String[] args) {
		
		
		Emp e1 = new Emp(1,"Abhijeet");
		Emp e2 = new Emp(1,"Abhijeet");
		Emp e3 = e1;
		
		Set<Emp> st1= new HashSet<>();
		
		
		st1.add(e1);
		st1.add(e2);
		st1.add(e3);
		
		System.out.println(st1);
		
		System.out.println(st1.size());
		
		
		
		
		
	}
	
	
	

}

class Emp
{
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
	
	
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}



	private int id;
	private String name;
	
	
	
	
	
	
}