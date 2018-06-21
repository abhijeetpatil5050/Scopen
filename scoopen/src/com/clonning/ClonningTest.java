package com.clonning;

public class ClonningTest {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address ad1 = new Address(416416, "Pune");
		
		Emp e1 = new Emp(1,"Abhijeet",ad1);
		Emp e2= e1.clone();
		
		System.out.println("Following are Shallow Clonning prediction");
		System.out.println(e1==e2);//false
		System.out.println(e1.getId()==e2.getId());//true
		System.out.println(e1.getNm()==e2.getNm());//true
		System.out.println(e1.getNm().equals(e2.getNm()));//true
	
		
		e2.setNm("Pandu");
		System.out.println("\nNow we say name of e2 changes so it is deep clone");
		System.out.println(e1==e2);//false
		System.out.println(e1.getId()==e2.getId());//true
		System.out.println(e1.getNm()==e2.getNm());//false
		System.out.println(e1.getNm().equals(e2.getNm()));//false
		
		System.out.println("\nAfter Writting Address Class but it will shallow");
		System.out.println(e1==e2);//false
		System.out.println(e1.getId()==e2.getId());//true
		System.out.println(e1.getNm()==e2.getNm());//false
		System.out.println(e1.getNm().equals(e2.getNm()));//false
		
		System.out.println(e1.getAd().getPin()==e2.getAd().getPin());//true
		System.out.println(e1.getAd().getCity()==e2.getAd().getCity());//true
		
		
		e2.getAd().setPin(417417);
		e2.getAd().setCity("Mumbai");
		System.out.println("\nAfter Writting Address Class but it will deep as we setting address and pin explicitly");
		
		System.out.println(e1==e2);//false
		System.out.println(e1.getId()==e2.getId());//true
		System.out.println(e1.getNm()==e2.getNm());//false
		System.out.println(e1.getNm().equals(e2.getNm()));//false	
		
		
		System.out.println(e1.getAd().getPin()==e2.getAd().getPin());//false
		System.out.println(e1.getAd().getCity()==e2.getAd().getCity());//false
		
		
		
				
	}
}


class Emp implements Cloneable{
	
	private int id;
	private String nm;
	private Address ad;
	
	
	public Emp(int id, String nm, Address ad) {
		super();
		this.id = id;
		this.nm = nm;
		this.ad = ad;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public Emp(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp clone() throws CloneNotSupportedException {
		
		//return (Emp) super.clone();
		
		Emp clonned=(Emp)super.clone();
		
		Address ad1 = clonned.getAd();
		Address ad2 = ad1.clone();
		clonned.setAd(ad2);
		
		return clonned;
		
	}
}


class Address implements Cloneable {

	private int pin;
	private String city;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address clone() throws CloneNotSupportedException{
	
	return (Address) super.clone();	
	
	}
}

