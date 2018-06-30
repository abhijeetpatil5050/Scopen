package com.threading.concurrency;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TransferQueue;

public class Tq1 {

	public static void main(String[] args) {
		
		TransferQueue<Integer> ltq=new LinkedTransferQueue<>();
		
		ProducerTransferQ ptq =new ProducerTransferQ(ltq);
		ConsumerTransferQ ctq =new ConsumerTransferQ(ltq);
		
		ptq.start();
		ctq.start();
		
	}
	
	
	
}

class ProducerTransferQ extends Thread{
	TransferQueue<Integer> ltq=null;
	
	
	public ProducerTransferQ(TransferQueue<Integer> ltq) {
		super();
		this.ltq = ltq;
	}


	public void run() {
		
		for(int a=0;a<3;a++) {
			int random=ThreadLocalRandom.current().nextInt(1,20);
			
			System.out.println("Produced element is "+random +" and is it consumed "+ltq.tryTransfer(random));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

class ConsumerTransferQ extends Thread{
	TransferQueue<Integer> ltq=null;
	
	public ConsumerTransferQ(TransferQueue<Integer> ltq) {
		super();
		this.ltq = ltq;
	}

	
	
	
	
	public void run() {
		
		for(int a=0;a<2;a++) {
			
			int i = 0;
			try {
				 
				i=ltq.take();
				System.out.println("Consumed Elments"+i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
			
			
	}
}