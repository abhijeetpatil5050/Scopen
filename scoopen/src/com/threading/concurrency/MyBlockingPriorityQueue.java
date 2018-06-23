package com.threading.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyBlockingPriorityQueue {

public static void main(String[] args) throws InterruptedException {
	
	BlockingQueue<Emp> bpq = new PriorityBlockingQueue<>(5);
	
	//BlockingQueue<Integer> bpq = new PriorityBlockingQueue<>(5);
	
	/*bpq.put(3);
	bpq.put(1);
	bpq.put(2);
	
	System.out.println(bpq);
	
	
System.out.println(bpq.take());

System.out.println(bpq.take());

System.out.println(bpq.take());*/

	
	
	ProducerPriority ppq = new ProducerPriority(bpq);
	ConsumerPriority cpq = new ConsumerPriority(bpq);
	
	
	
	ppq.start();
	ppq.join();
	cpq.start();
	
	
	
	
	
}
	
}


class ProducerPriority extends Thread{
	
	
	
	BlockingQueue<Emp> bpq = null;
	
	
	
	public ProducerPriority(BlockingQueue<Emp> bpq) {
		super();
		this.bpq = bpq;
	}



	public void run() {
		
		//for(int i =0 ; i<5;i++) 
		
		
		{
		
			Emp e= new Emp(1, "Abhijeet");
			Emp e1= new Emp(2, "bhijeet");
			Emp e2= new Emp(3, "ahijeet");
			
			try {
				bpq.put(e);
				
				bpq.put(e1);
				
				bpq.put(e2);
			} catch (InterruptedException q) {
				// TODO Auto-generated catch block
				q.printStackTrace();
			}	
			System.out.println("Produced Objects:"+bpq);
			
			
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException q) {
				// TODO Auto-generated catch block
				q.printStackTrace();
			}
		}
		
	}
	
	
}


class ConsumerPriority extends Thread{
	
	
	BlockingQueue<Emp> bpq = null;
	
	public ConsumerPriority(BlockingQueue<Emp> bpq) {
		super();
		this.bpq = bpq;
	}
	
	public void run() {
	
	while(true) 

	{
		
		try {
			Thread.sleep(2000);
			Emp e1 = bpq.take();
			
			System.out.println("Consumed Objects:"+e1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	}
}

class Emp implements Comparable<Emp>{

	
	int id;
	String name;
	
	
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int compareTo(Emp o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
}