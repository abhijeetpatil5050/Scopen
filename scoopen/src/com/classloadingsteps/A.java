package com.classloadingsteps;

public class A {
	
	
	int i;
	static int j;
	
	{
		
		System.out.println("Inside Instance block");
	}
	static
	{
		System.out.println("inside static block");
	}
	
	
	public static void m1() {
		System.out.println("Inside Static method");
	}
	public  void m2() {
		System.out.println("Inside Instance method method");
	}
	A()
	{
		
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) {
		

		System.out.println("IN main");
		
		//A a = new A();

		
		
	}

}
