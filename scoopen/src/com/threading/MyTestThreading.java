package com.threading;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class MyTestThreading {

	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		
		Consumer c = new Consumer("mynameisconsumer",al,7);
		//Consumer c1 = new Consumer("mynameisconsumer1",al,7);
		Producer p = new Producer("mynameisproducer", al, 7);
		
		//c1.start();
		c.start();
		p.start();
		
	}
	
	
	
}

class Producer extends Thread{
	
	//String pTName;
	ArrayList al=null;
	int max_size=0;
	
	public Producer(String pTName, ArrayList al, int max_size) {
		
		super(pTName);
		this.al = al;
		this.max_size = max_size;
	}
	
	

	
	public void run() {
		
		while(true) {
			
			synchronized (al) {
				 System.out.println("Starting Producing elements "+Thread.currentThread().getName());
				if(max_size==al.size()) {											
						System.out.println("List is full now...!");
				
				try {
					al.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else {
					
					/*try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
				int rand=ThreadLocalRandom.current().nextInt(1,100);
				al.add(rand);
				
				System.out.println("Produced element"+rand);
				al.notify();
				}
			}// synchronized block ends here
			
			
		}
		
	}
	
}//producer ends here

class Consumer extends Thread{
	
	//String cTName;
	ArrayList al=null;
	int max_size=0;
	public Consumer(String cTName, ArrayList al, int max_size) {
		
		super(cTName);
		
		this.al = al;
		this.max_size = max_size;
	}
	
	public void run() {
		
		synchronized (al) {
			System.out.println("Consuming elements -- " +Thread.currentThread().getName());
			while(true) {
				
				
				
				if(al.isEmpty()){
				System.out.println("List is empty");
				try {
					al.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else {
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					int consu= (int) al.remove(0);
					System.out.println("Consumed ELEMENT IS:"+consu);
				al.notify();}
			}//while ends
			
			
		}//syn ends
		
		
	}
	
	
	
	
	
}









