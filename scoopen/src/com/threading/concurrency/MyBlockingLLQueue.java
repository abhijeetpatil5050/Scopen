package com.threading.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class MyBlockingLLQueue {
public static void main(String[] args) {
	
	BlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(5);
	
	ProducerLBQ plbq= new ProducerLBQ(lbq,"  I am  Linked Blocking Queue Producer");
	ConsumerLBQ clbq= new ConsumerLBQ(lbq,"  I am  Linked Blocking Queue Consumer");
	
	
	plbq.start();
	
	clbq.start();
	
	
	
}
}
class ProducerLBQ extends Thread{
	
	BlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(5);

	public ProducerLBQ(BlockingQueue<Integer> lbq,String pthreadname) {
		super(pthreadname);
		this.lbq = lbq;
	}
	public void run() {
			while(true) {
				Integer ProducedRandomNumber=ThreadLocalRandom.current().nextInt(1, 50);
				lbq.offer(ProducedRandomNumber);
				System.out.println("Produced Element:"+ProducedRandomNumber);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	
}
class ConsumerLBQ extends Thread{
	
	BlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(5);

	public ConsumerLBQ(BlockingQueue<Integer> lbq,String cthreadname) {
		super(cthreadname);
		this.lbq = lbq;
	}
	
	public void run() {
		while(true) {
			
			Integer consumednumber=lbq.poll();
			System.out.println("Consumed Element:"+consumednumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}