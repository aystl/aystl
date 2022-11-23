package org.apache.commons.lang3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberUtilsTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testToIntString() {
		assertEquals(NumberUtils.toInt("123"),123);
		assertEquals(NumberUtils.toInt("zbc",123),123);
	}

	@Test
	public void testMinIntArray() {
		assertEquals(NumberUtils.min(10,20,30,50),20);
	}

	@Test
	public void testMaxIntArray() {
		assertEquals(NumberUtils.max(10,20,30,5),30);
		assertEquals(NumberUtils.max(10,20,30,50),50);
	}

}
