package com.threading;

public class JoinYeild {
public static void main(String[] args) throws InterruptedException {
	
		A a1 = new A(2);
	
		B a2 = new B(3);
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		
		t1.start();
		System.out.println("Out of join");
		
		//t1.yield();
		t1.join();
		
		
		t2.start();
	
	
}
	
	
	
}
class A implements Runnable {

	int id;
	public A(int id) {
		super();
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("A's run");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class B implements Runnable {

	int id;
	public B(int id) {
		super();
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("B's run");
		
	}
	
}

