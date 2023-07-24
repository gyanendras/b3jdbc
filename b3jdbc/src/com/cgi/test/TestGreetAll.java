package com.cgi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cgi.b3.GreetAll;

class TestGreetAll {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void testGreet() {
		//Assertions.fail("Not yet implemented");
		GreetAll ga = new GreetAll();
		ga.greet();
	}
	
	@Test
	void testGreetAll() {
		GreetAll ga = new GreetAll();
		String s = ga.greetAll();
		Assertions.assertEquals("Greeting youHI PPL!", s);
	}

}
