package com.threading.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyCyclicBarrier {
	public static void main(String[] args) {
		
		CyclicBarrier cybr = new CyclicBarrier(5,new CheckDestPoint1());
		
		SchoolTrip st = new SchoolTrip(cybr);
		
		Thread t1 = new Thread(st, "bus 1");
		Thread t2 = new Thread(st, "bus 2");
		Thread t3 = new Thread(st, "bus 3");
		Thread t4 = new Thread(st, "bus 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		TravllerBus tb = new TravllerBus(cybr);
		Thread t5 = new Thread(tb, "Travler bus 1");
		t5.start();
		
	}
	
	
}


class SchoolTrip implements Runnable{

	
	
	CyclicBarrier cybr =null;
	
	public SchoolTrip(CyclicBarrier cybr) {
		super();
		this.cybr = cybr;
	}

	
	@Override
	public void run() {
		
		
		
		System.out.println(Thread.currentThread()
				.getName()+" Left Sangli");
		
		try {
			cybr.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread()
				.getName()+" Reached Satara");
		
		try {
			cybr.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread()
				.getName()+" Reached Pune");
		
		
		
	}
	
	
}


class TravllerBus implements Runnable{

	
CyclicBarrier cybr =null;
	
	public TravllerBus(CyclicBarrier cybr) {
		super();
		this.cybr = cybr;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Left Sangli");
		
		System.out.println("Traveller Bus  Puncture zali At Karad");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			cybr.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" Reached Satara");
		
		try {
			cybr.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+" Reached Pune");
		
	}
	
}
class CheckDestPoint1 implements Runnable{

	@Override
	public void run() {
			System.out.println("Sagle ale ata chala pudhe");
	}
	
	
}

