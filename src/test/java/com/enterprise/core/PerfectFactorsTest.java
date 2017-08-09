package com.enterprise.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectFactorsTest {
	
PerfectFactors perfectFactors = new PerfectFactors();
	@Test
	public void testFactors() {
		int[] factors = perfectFactors.find(36);
		assertEquals(6,factors[0]);
		assertEquals(2,factors[1]);
	}
	
	@Test
	public void testFactors_notPerfect() {
		int[] factors = perfectFactors.find(35);
		assertNull(factors);
	}

}
