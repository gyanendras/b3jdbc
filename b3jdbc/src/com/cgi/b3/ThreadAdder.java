package com.cgi.b3;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAdder extends Thread{
	
	AtomicInteger x = new AtomicInteger(0); // race situation is reading of a variable in intermediate state.
	// to avoid this use Atomic or Syncronized key word.
	
	@Override
	public void run() {
		for(int i =0;i<100;++i) {
		System.out.println(currentThread()+" "+x.incrementAndGet());
		
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		}
	}

	public static void main(String[] args) {
		ThreadAdder ta = new ThreadAdder();
		ThreadAdder ta1 = new ThreadAdder();
		ThreadAdder ta2 = new ThreadAdder();
		ta.start();
		ta1.start();
		ta2.start();

	}

}
