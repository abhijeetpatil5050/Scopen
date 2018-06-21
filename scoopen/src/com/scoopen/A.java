
//Method Overriding Practice 3rd may practice


package com.scoopen;

public class A {
	
	void m1() {
		
		System.out.println("m1 of A");
	}
	
void m2() {
		
		System.out.println("m2 of A");
	}
	
}

class B extends A
{
	
void m1() {
		
		System.out.println("m1 of B");
	}
	
void m3() {
		
		System.out.println("m3 of B");
	}
	

public static void main(String[] args) {
	
	A a = new A();
	a.m1();
	a.m2();
	
	
	B b = new B();
	b.m1();
	b.m3();
	b.m2();
	
	
	A a1 = new B();
	a1.m1();
	a1.m2();
	
}




}
