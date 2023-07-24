package com.cgi.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.cgi.b3.Person;
import com.cgi.shapes.Circle;

// map is a key value pair, both key values are objects.
public class TestMap {
 
 Map<Person,Circle> m = new HashMap<Person, Circle>();
 Map<String,List<Character>> m2 = new HashMap<>();


 public void testMap() {
	 Person p1 = new Person("Ram", "Arora", null);
	 // Circle c1 = new Circle(2);
	 
	//m.put("Ram", p1);
	//m.put("India", "Delhi");
	//m.put(1,"One");
	
	m.put(p1,  new Circle(2));
	m.put(new Person("P1", "L1", null),  new Circle(3));
	m.put(new Person("P2", "L2", null),  new Circle(4));
	
	
	
	Circle c = m.get(p1);
	c.process();
	
	List<Character> l = new ArrayList<>();
	l.add('A');
	l.add('p');
	l.add('p');
	l.add('l');
	l.add('e');
	
	m2.put("Apple", l);
	List<Character>  val = m2.get("Apple");
	Character tmp = val.get(0);
	
	
	System.out.println(val);
	
	// Gives all keys  
	Set s = m.keySet(); // m.get(1)
	System.out.println(s);
	
	System.out.println();
	
	Collection cl = m.values();
	System.out.println(cl);
	
	
	Set<Entry<Person, Circle>> ens = m.entrySet();
	List<Entry<Person, Circle>> cl2 = new ArrayList(ens);
	System.out.println(cl2.get(0));
	Entry<Person, Circle> ent = cl2.get(0);
	System.out.println(ent.getKey());
	System.out.println(ent.getValue());
	
	
	
	
	
	
	
 }
 

 
 public static void main(String[] args) {
		TestMap mp = new TestMap();
		mp.testMap();
		
	}

}
