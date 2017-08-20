package com.tanuj.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {

		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {

		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testFirstAndLastCharSame_PassingStringOfSize3() {

		boolean expected = stringHelper.areFirstAndLastTwoCharactersTheSame("ABC");
		assertFalse(expected);
	}
	
	@Test
	public void testFirstAndLastCharSame_PassingStringOfSize2() {

		boolean expected = stringHelper.areFirstAndLastTwoCharactersTheSame("AB");
		assertTrue(expected);
	}
}
