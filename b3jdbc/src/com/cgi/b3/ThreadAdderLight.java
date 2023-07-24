package com.cgi.b3;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAdderLight implements Runnable{
	
	AtomicInteger x = new AtomicInteger(0); // race situation is reading of a variable in intermediate state.
	// to avoid this use Atomic or Syncronized key word.

	@Override
	public void run() {
		for(int i =0;i<100;++i) {
			System.out.println(Thread.currentThread()+" "+x.incrementAndGet());
			
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			}
		
	}
	
	public static void main(String[] args) {
		ThreadAdderLight tl = new ThreadAdderLight();
		Thread th0 = new Thread(tl);
		Thread th1 = new Thread(tl);
		Thread th2 = new Thread(tl);
		th0.start();
		th1.start();
		th2.start();
		
	}

}
