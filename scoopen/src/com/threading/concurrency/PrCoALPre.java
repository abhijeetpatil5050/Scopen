package com.threading.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class PrCoALPre {

	public static void main(String[] args) {
		BlockingQueue<Integer> bqal = new ArrayBlockingQueue<Integer>(1);
		
		Producer10 p10 = new Producer10(bqal,"Produced by p10 thread");
		Producer10 p11 = new Producer10(bqal,"Produced by p11 thread");
		
		Consumer10 c10 = new Consumer10(bqal);
		
		Thread t1 = new Thread(p10);
		Thread t2 = new Thread(c10);
		
		Thread t3 = new Thread(p11);
		
		t1.start();
		t2.start();
		
		t3.start();
	}
	
}
class Producer10 implements Runnable{

	BlockingQueue<Integer> bqal =null;
	String name=null;
	
	public Producer10(BlockingQueue<Integer> bqal,String name) {
		super();
		this.bqal = bqal;
		this.name=name;
	}


	@Override
	public void run() {
		
		for(int i= 0 ;i<10;i++) {
		
		int randomproducedelement=ThreadLocalRandom.current().nextInt(1,50);
		
		
		try {
			bqal.put(randomproducedelement);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//bqal.add(randomproducedelement);
		
		
		System.out.println(name+" and produced Element is:"+randomproducedelement);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}//for loop
	}
	
}

class Consumer10 implements Runnable{

	BlockingQueue<Integer> bqal =null;
	
	
	public Consumer10(BlockingQueue<Integer> bqal) {
		super();
		this.bqal = bqal;
	}


	@Override
	public void run() {
			for(int i=0;i<10;i++) {
		int consumedelement = 0;
			try {
				consumedelement = bqal.take();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//consumedelement = bqal.remove();
		
		
		System.out.println("Consumed Element:"+consumedelement);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}//for loop ends
		
	}
	
}