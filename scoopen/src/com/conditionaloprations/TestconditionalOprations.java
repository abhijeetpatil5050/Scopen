package com.conditionaloprations;

public class TestconditionalOprations {
	
	
	public void method1() {
		System.out.println("inside method1");
		}
	
	public int method2() {
		
		System.out.println("inside method2");
		
		return 10;
	}
	
	public static String method3() {
		System.out.println("inside static method3");
		return "abc";
	}
	
	
	
	
	public static void main(String[] args) {
	
	method3();
	TestconditionalOprations t =new TestconditionalOprations();
	t.method1();
	t.method2();
		
		
	}

}
