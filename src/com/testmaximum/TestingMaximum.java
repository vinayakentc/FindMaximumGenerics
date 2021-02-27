package com.testmaximum;


import org.junit.Assert;
import org.junit.Test;

public class TestingMaximum {

	@Test
	   public void testInteger() {
		   TestMaximum<Integer> test = new TestMaximum<Integer>(13, 11, 9, 7, 10, 3, 4, 5, 8);
		   Assert.assertEquals((Integer)13, test.max());
	   }
	   @Test
	   public void testFloat() {
		   TestMaximum<Float> test = new TestMaximum<Float>(5.9f, 9.10f, 8.54f, 7.32f, 9.09f);
		   Assert.assertEquals((Float)9.10f, test.max());
	   }
	   @Test
	   public void testString() {
		   TestMaximum<String> test = new TestMaximum<String>("aditya", "kumar", "capgemini", "zbalegdirb");
		   Assert.assertEquals("zbalegdirb", test.max());
	   }
}