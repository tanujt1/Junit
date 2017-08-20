package com.tanuj.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringParameterizedHelperTest {

	StringHelper stringHelper = new StringHelper();

	private String expected;
	private String input;

	public StringParameterizedHelperTest(String expected, String input) {
		super();
		this.expected = expected;
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "CD", "AACD" }, { "CD", "AACD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {

		assertEquals(expected, stringHelper.truncateAInFirst2Positions(input));
	}

}
