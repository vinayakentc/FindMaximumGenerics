package com.testmaximum;


import org.junit.Assert;
import org.junit.Test;

public class TestingMaximum {

	@Test
	public void testMaximumNumber() {
		Assert.assertEquals((Integer) 7, TestMaximum.testMax(3, 7, 2));
	}
}
