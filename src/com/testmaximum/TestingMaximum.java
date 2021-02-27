package com.testmaximum;


import org.junit.Assert;
import org.junit.Test;

public class TestingMaximum {

	@Test
	public void testMaximumInteger() {
		Assert.assertEquals((Integer) 7, TestMaximum.testMax(4, 2, 7));
	}
	
	@Test
	public void testMaximumFloat() {
		Assert.assertEquals((Float) 7.0f, TestMaximum.testMax(4.0f, 2.0f, 7.0f));
	}
}