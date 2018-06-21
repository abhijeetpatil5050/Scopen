package com.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyTestSerilizationDeserializatio {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Family fa = new Family("Sangli", 1, 10000);
		File fl= new File("C:\\Users\\Abhang\\Desktop\\file1.txt");
		
		FileOutputStream fos = new FileOutputStream(fl);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(fa);
		oos.close();
		System.out.println("Serialization Completed");
		 
		
		
		FileInputStream fis = new FileInputStream(fl);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Family fami1= (Family)ois.readObject();
		
		System.out.println(fami1);
		System.out.println("DeSerialization Completed");		
		
	}
		
}

class Family implements Serializable{
	
	String family_address;
	int family_id;
	transient int family_income;
	
	
	public Family(String family_address, int family_id, int family_income) {
		super();
		this.family_address = family_address;
		this.family_id = family_id;
		this.family_income = family_income;
	}




	@Override
	public String toString() {
		return "Family [family_address=" + family_address + ", family_id=" + family_id + ", family_income="
				+ family_income + "]";
	}




	
	
	
	
}
