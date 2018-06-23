package com.threading.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class MyBlockingALQueueTest {

	public static void main(String[] args) {
		//BlockingQueue<Message> bq = new ArrayBlockingQueue<>(10);
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(1);
		Producer p1 = new Producer(bq, "  I M Producer1");
		Producer p2 = new Producer(bq, "  I M Producer2");
		Producer p3 = new Producer(bq, "  I M Producer3");
		Producer p4 = new Producer(bq, "  I M Producer4");
		
		Consumer c1 = new Consumer(bq, "  I M Consumer1");
		/*Consumer c2 = new Consumer(bq, "  I M Consumer2");
		Consumer c3 = new Consumer(bq, "  I M Consumer3");
		Consumer c4 = new Consumer(bq, "  I M Consumer4");
		*/
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		c1.start();
		/*c2.start();
		c3.start();
		c4.start();*/
		
	}
	
}
class Producer extends Thread{

	//Message msg = new Message("Hello");
	
	BlockingQueue<Integer> bq = null;
	
	
	public Producer(BlockingQueue<Integer> bq,String tname) {
		super(tname);
		this.bq = bq;
	}

	@Override
	public void run() {
		while(true) {
			
			int RandomNo=ThreadLocalRandom.current().nextInt(1,50);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				try {
					bq.put(RandomNo);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Produced Elements"+RandomNo+""+Thread.currentThread().getName());
			
		}
	}
	
}


class Consumer extends Thread{

	//Message msg = new Message("Hello");
	
	BlockingQueue<Integer> bq = null;
	
	
	public Consumer(BlockingQueue<Integer> bq,String tname) {
		super(tname);
		this.bq = bq;
	}

	@Override
	public void run() {
		while(true) {
			
			
	
					try {
						System.out.println("Consumed Elements"+bq.take()+""+Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			
			
		}
	}
	
}






/*class Message{
	String name;

	public Message(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
	
	
	
}

*/
