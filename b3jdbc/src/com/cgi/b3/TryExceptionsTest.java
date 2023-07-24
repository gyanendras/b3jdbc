package com.cgi.b3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class TryExceptionsTest {

	@Test
	void testCalcTopper() {
		TryExceptions te = new TryExceptions();
		Map<Person,Integer> mp = new HashMap<>();
		mp.put(new Person("P1","L1",null), -1);
		mp.put(new Person("P3","L3",null), 3);
		mp.put(new Person("P2","L2",null), 2);
		
		Person p  =null;
		try {
			p = te.calcTopper(mp);
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}finally {
			// close open files, or DB connection
			System.out.println("In finally");
		}
		
		System.out.println("After catching and handling exception");
		
		assertEquals(new Person("P3","L3",null), p);
		
	}

}
