package com.cgi.b3;

public class ParallelAdder {
	
	int sumList(int[] x) {
		int sum = 0;
		for(int i:x) {
			sum = sum + i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
     int[] y = {1,2,3,4,5};	
     ParallelAdder pa = new ParallelAdder();
     int tot = pa.sumList(y);
     System.out.println(tot);
     
    
     
	}

}
