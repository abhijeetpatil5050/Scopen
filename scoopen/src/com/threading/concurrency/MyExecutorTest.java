package com.threading.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MyExecutorTest {

	public static void main(String[] args) {
		//ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newFixedThreadPool(2);
		//ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService es = Executors.newScheduledThreadPool(2);
		
	
		
		es.execute(new ThreadOne(" First_Thread"));
		es.execute(new ThreadOne(" Second_Thread"));
		es.execute(new ThreadOne(" Third_Thread"));
		
	}
	
}
class ThreadOne implements Runnable{
	
	String tname;
	
	public ThreadOne(String tname) {
		super();
		this.tname = tname;
	}

	public void run() {
		
		for(int i=0;i<4;i++) {
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(i+tname);
		}
	}
}
