package com.utils.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utils.Division;


public class DivisionTest {
	
	
	
	@Test
	public void testSomeLogic(){
		Division d = new Division();
		assertEquals("testing... testSomeLogic", true, d.someLogic(2));
	}

}
