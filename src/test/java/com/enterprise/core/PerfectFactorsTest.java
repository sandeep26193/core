package com.enterprise.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectFactorsTest {
	
PerfectFactors perfectFactors = new PerfectFactors();
	@Test
	public void testFactors() {
		int[] factors = perfectFactors.find(36);
		
		assertEquals(36,findFactor(factors));
	}
	
	@Test
	public void testFactors_of2() {
		int[] factors = perfectFactors.find(32);
		
		assertEquals(32,findFactor(factors));
	}	
	
	@Test
	public void testFactors_notPerfect() {
		int[] factors = perfectFactors.find(35);
		assertNull(factors);
	}
	@Test
	public void testFactors_notPerfectEvent() {
		int[] factors = perfectFactors.find(40);
		assertNull(factors);
	}
	
	@Test
	public void testFactors_morethanoneanswer() {
		int[] factors = perfectFactors.find(64);
		assertEquals(64,findFactor(factors));
	}
	
	private int findFactor(int[] factors) {
		int factor = 1;
		for(int i = 0; i < factors[1]; i++) {
			factor = factor * factors[0];
		}
		return factor;
	}

}
