package com.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CrackHackerWithSerialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Company c1 = new Company("Abhindraa", 1, 1000000);
		
		File file = new File("C:\\Users\\Abhang\\Desktop\\file2.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		
		System.out.println("Serialization Completed");
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Company c2 = (Company)ois.readObject();
		ois.close();
		
		System.out.println("DeSerialization Completed");
		
		System.out.println(c1==c2); // false
		
		System.out.println("Se "+c1);
		System.out.println("DSE "+c2);
		
		
		
		
	}

}

class Company implements Serializable{
	
	String comapnyname;
	int companyid;
	double company_profit;
	
	public Company(String comapnyname, int companyid, double company_profit) {
		super();
		this.comapnyname = comapnyname;
		this.companyid = companyid;
		this.company_profit = company_profit;
	}

	@Override
	public String toString() {
		return "Company [comapnyname=" + comapnyname + ", companyid=" + companyid + ", company_profit=" + company_profit
				+ "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
	
		System.out.println("Serialization Started");
		
		oos.defaultWriteObject();//abhindraa 1 1000000
		
		oos.writeObject(1020);//1020
		
		String obj = company_profit+"###$**";
		oos.writeObject(obj);//1000000###$**
		
		System.out.println("Encrypted"+obj);//1000000###$**
		
		System.out.println("Serialization Completed");
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		
		System.out.println("De-Serialization Started");
		ois.defaultReadObject();//abhindraa 1 1000000
		
		int dummyobj=(int) ois.readObject();
		System.out.println("Dummy object"+dummyobj);//1020
		
		String wokobj = (String )ois.readObject();
		System.out.println("without key " +wokobj);////1000000###$**
		
		wokobj= wokobj.substring(0,6);
		this.company_profit=Double.parseDouble(wokobj);
		System.out.println("Decrypted "+company_profit);
		
		System.out.println("De-Serialization Completed");
		
	}
	
	
	
	
	
	
}
