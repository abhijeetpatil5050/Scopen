package com.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerializationCase2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		A a = new A(10);
		B b = new B(20);
		
		FileOutputStream fos = new FileOutputStream("sangli.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		
		FileInputStream fis = new FileInputStream("sangli.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		B b2= (B)ois.readObject();
		
		
		/*A a = new A();
		B b = new B();*/
		
		System.out.println(b2.i);
		System.out.println(b2.j);
	
	}

}
class A{
	
	//transient int i=10;
	 int i; // nilya exception case
	
	public A() {
		super();
	}
	public A(int i) {
		super();
		this.i = i;
	}
	
}

class B extends A implements Serializable {
	
	//int j=20;
	transient int j;


	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(int j) {
		super();
		this.j = j;
	}

	
	
	
}