package com.cgi.b3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * This is parallel execution code to print counts
 */
public class ThreadCallable implements Callable<Integer>{
	
	AtomicInteger x = new AtomicInteger(0); // race situation is reading of a variable in intermediate state.
	// to avoid this use Atomic or Syncronized key word.


	
	/**
	 *This methods counts parallel manner
	 */
	@Override
	public Integer call() throws Exception {
		for(int i =0;i<100;++i) {
			System.out.println(Thread.currentThread()+" "+x.incrementAndGet());
			
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			}
		return x.intValue();
	}
	
	public static void main(String[] args) {
		
		ThreadAdderLight tl = new ThreadAdderLight();
		ThreadCallable tc = new ThreadCallable();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.execute(tl);
		Future<Integer> fr1 = es.submit(tc);
		Future<Integer> fr2 = es.submit(tc);
		
		try {
			System.out.println(fr1.get());
			System.out.println(fr2.get());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
