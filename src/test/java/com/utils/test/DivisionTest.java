package com.utils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utils.Division;


public class DivisionTest {
	
	
	
	@Test
	public void testSomeLogic2(){
		Division d = new Division();
		assertEquals("testing... testSomeLogic", true, d.someLogic2(2));
	}
	
	@Test
	public void testSomeLogic3(){
		Division d = new Division();
		assertEquals("testing... testSomeLogic2", true, d.someLogic3(3));
	}
	
	@Test
	public void testSomeLogic4(){
		Division d = new Division();
		assertEquals("testing... testSomeLogic2", true, d.someLogic4(3));
	}

}
