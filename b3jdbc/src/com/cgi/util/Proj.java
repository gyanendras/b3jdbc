package com.cgi.util;

import com.cgi.shapes.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.cgi.b3.Animationable;
import com.cgi.b3.GreetAll;
import com.cgi.shapes.Circle;

public class Proj {
	
	void testArray() {
	String[][] sArr = new String[10][5];
	
	Circle[] cArr = new Circle[5];
	
	for(int i = cArr.length-1; i>=0; --i) {
		cArr[i]= new Circle(5-i);
	}
	
	Arrays.sort(cArr);
	
	for(Circle c : cArr) {
		
		System.out.println(c.getName());
	}
			
	}
	
	void testCollections() {
		
		
		ArrayList<Circle> l = new ArrayList<>();
		LinkedList<Circle> l2 = new LinkedList<>();
		Circle c1 = new Circle(1,"white");
		Circle c2 = new Circle(22,"red");
		Circle c3 = new Circle(33,"blue");
		Circle c4 = new Circle(4,"yellow");
		Circle c5 = new Circle(33,"blue");
		GreetAll ga = new GreetAll();
		
		
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c3);
		// l.remove(1);
		
	    Map m = new HashMap();
	    
	    Set<Circle>  c = new TreeSet<Circle>(l); 
	    c.add(c4);
	    // c.add(ga);
	    
	    	    
	    for(int i =0; i<l.size();++i) {
	    	//Circle tmp = (Circle)l.get(i);
	    	System.out.println(l.get(i).getName());
	    }
	    
	    Iterator<Circle> it = c.iterator();
	    
	    System.out.println();
	    
	    while(it.hasNext()) {
	    	System.out.println( it.next().getName());
	    }
	    
	    System.out.println();
	    
	    for(Circle cir : c) {
	    	System.out.println(cir);
	    }
	   
		
	}
	
	

	public static void main(String[] args) {
		Proj pr = new Proj();
		
		
		 pr.testCollections();
		
		
		
		
		pr.testArray() ;
		
		
		Shape s = new Shape();
		Circle c = new Circle(2);
		System.out.println(c.getName());
		
		Animationable a = c;
		
		a.animate(0, 0);
		

	}

}
