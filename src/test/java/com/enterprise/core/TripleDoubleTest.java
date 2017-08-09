package com.enterprise.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.enterprise.core.TripleDouble;

public class TripleDoubleTest {
	TripleDouble tripleDouble = new TripleDouble();
	
//	@Test
//	public void tribleDouble() {
//		
//		assertEquals(1,tripleDouble.find(111234555, 3311454));
//	}
//	
	@Test
	public void tribleDouble_secondRepeatingNumberMatches() {
		
		assertEquals(1,tripleDouble.find(1112333455, 331454));
	}
	
//	@Test
//	public void tribleDouble_tripleNoDouble() {
//		
//		assertEquals(0,tripleDouble.find(111234555, 331454));
//	}
//	@Test
//	public void tribleDouble_noTriple() {
//		
//		assertEquals(0,tripleDouble.find(11234556, 3311454));
//	}
//
//	@Test
//	public void tribleDouble_tripletriple() {
//		
//		assertEquals(1,tripleDouble.find(333234555, 3331454));
//	}
//	
//	@Test
//	public void test_tripleAtTheEnd() {
//		
//		assertEquals(1, tripleDouble.find(87868999, 689980));
//	}
//	
//	@Test
//	public void test_doubleAtTheEnd() {
//		assertEquals(1, tripleDouble.find(878886899, 689988));
//	}
}
