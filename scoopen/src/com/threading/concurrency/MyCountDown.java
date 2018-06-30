package com.threading.concurrency;

import java.util.concurrent.CountDownLatch;

public class MyCountDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		CountDownLatch latch = new CountDownLatch(3);//if more than 3 then program is not terminating. 
		
		System.out.println("Main Thread Started");
 
		JavaDeveloperTeam javadevteam1 = new JavaDeveloperTeam("#javadevteam1",latch);
		Thread t1 = new Thread(javadevteam1);
		t1.start();
		
		
		
		JavaTesterTeam javatesterteam1 = new JavaTesterTeam("#javatesterteam1",latch);
		Thread t2 = new Thread(javatesterteam1);
		t2.start();
		
		
		
		JavaBusinessAnalystTeam javabateam1 = new JavaBusinessAnalystTeam("#javabateam1",latch);
		javabateam1.start(); 
		
		
		
		latch.await();
		
	
		
		
	}
	
}


class JavaDeveloperTeam implements Runnable{

	
	String threadjname;
	CountDownLatch latch=null;
	
	public JavaDeveloperTeam(String threadjname, CountDownLatch latch) {
		super();
		this.threadjname = threadjname;
		this.latch = latch;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"\t"+threadjname);
				
		}
		
		latch.countDown();
	
	}
}

class JavaTesterTeam implements Runnable{

	String threadtname;
	CountDownLatch latch=null;
	
	public JavaTesterTeam(String threadtname,CountDownLatch latch) {
		super();
		this.latch = latch;
		this.threadtname = threadtname;
	}

	
	
	@Override
	public void run() {
		System.out.println();
		for(int i=11;i<=20;i++) {
			System.out.println(i+"\t"+threadtname);
		}
		
		latch.countDown();
		
	}
}


class JavaBusinessAnalystTeam extends Thread{
	
	String tname;
	CountDownLatch latch=null;
	public JavaBusinessAnalystTeam(String tname,CountDownLatch latch) {
		super();
		this.latch = latch;
		this.tname = tname;
	}

	public void run() {
		System.out.println();
		for(int i=21;i<=30;i++) {
			System.out.println(i+"\t"+tname);
		}
	latch.countDown();
	}
	
}
