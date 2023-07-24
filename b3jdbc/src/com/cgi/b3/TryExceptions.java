package com.cgi.b3;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TryExceptions {
	
	Person calcTopper(Map<Person, Integer> map) throws IOException, ParseException, NegativeNumberException  {
		
		Set<Entry<Person, Integer>> eset = map.entrySet();
		Iterator<Entry<Person, Integer>> it = eset.iterator();
		
		int temp=0;
		Person topper = null;
		while(it.hasNext()) {
			
			Entry<Person, Integer> en = it.next();
			if(en.getValue()<0) throw new NegativeNumberException("Number is Negative",en.getValue());
			if(en.getValue()>100) throw new ParseException("Invalid High Value",2);
			if(en.getKey().getFirstName() == null) throw new NumberFormatException("Invalid data");
			
			if ( en.getValue() > temp ) {
				temp = en.getValue();
				topper = en.getKey();
			}
			
			
		}
		
		
		return topper;
		
	}

}
