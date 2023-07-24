package com.cgi.b3 ;

public class GreetAll{
private String s = "Hello World! In Br1";
private int x = 10;

public GreetAll(){
	s = "HI PPL!" ;
}

public GreetAll(String s){
	this.s = s ;
}

public void greet(){
System.out.println(s);
}

public String greetAll(){
	String sal = "Greeting you" + s;
 return sal;
}

public static void main(String args[]){
GreetAll ga = new GreetAll();
GreetAll ga1 = new GreetAll("HI from parameterised Const");
ga.greet();
ga1.greet();

}
}