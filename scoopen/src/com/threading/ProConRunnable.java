package com.threading;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ProConRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		
		ArrayList arlt = new ArrayList();
		
		Pro  p1 = new Pro(arlt);
		Con1 c1 = new Con1(arlt);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		
		
		System.out.println("Main Thread PRints like:"+Thread.currentThread());
		
		
		t2.start();
		
		t1.start();
		
		
		
		
		
		
	}
	
	
}

class Pro implements Runnable{

	ArrayList al;
	int Max_Size=5;
	public Pro(ArrayList al) {
		super();
		this.al = al;
	}


	@Override
	public void run() {
		
			while(true) {
			
				synchronized (al) {
					
					if(al.size()==Max_Size) {
						System.out.println("List is Full\n");
						
						try {
							al.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else {
					
					Integer RandomNumber=ThreadLocalRandom.current().nextInt(1, 100);
					al.add(RandomNumber);
					System.out.println("Produced Element is:"+RandomNumber);
				
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
			al.notify();
			
					}//else ends
				}//sync ends
			
		}
		
		
	}
}


class Con1 implements Runnable{

	
	ArrayList al;
	int Max_Size=5;
	
	public Con1(ArrayList al) {
		super();
		this.al = al;
	}
	
	
	
	
	@Override
	public void run() {
		
		while(true) {
			
			synchronized (al) {
				
			if(al.isEmpty()) {
				System.out.println("List Is Empty\n");
			}
			else {
				Integer RandomNumber=(Integer) al.remove(0);
				System.out.println("Consumed Element is:"+RandomNumber);
		
				
		
		
		
		

		
		
		
	
		
		al.notify();
		
		
		try {
			al.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}//else ends
			}//sync ends
		
	}
		
	}
	
}
