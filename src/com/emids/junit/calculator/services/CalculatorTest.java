package com.emids.junit.calculator.services;

import org.junit.Assert;
import org.junit.Test;

import com.emids.junit.calculator.model.Calculator;

public class CalculatorTest {

	@Test(expected = RuntimeException.class)
	public final void whenMoreThanTwoNumberThenThrowException() {
		Calculator.add("1,2,3");
	}

	@Test
	public final void whenEmptyStringIsUsedthenReturnValueIs0() {
		Assert.assertEquals(0, Calculator.add(""));
	}

	@Test
	public final void whenTwoNumberIsUsedThenReturnTheirSum() {
		Assert.assertEquals(46, Calculator.add("2,44"));
	}

	@Test
	public final void whenAnyNumberIsUsedThenReturnTheirSum() {
		Assert.assertEquals(2 + 3 + 4 + 5 + 6, Calculator.add("2,3,4,5,6"));
	}

	@Test
	public static final void whenNewLineComesInBetweenThenReturnTheirSumOnly() {
		Assert.assertEquals(44 + 5 + 6, Calculator.add("44\n5\n6"));
	}

	@Test
	public static final void whenDelimeterIsSpecifiedThenSeparateNumber() {
		Assert.assertEquals(3 + 6 + 15, Calculator.add("//;n3;6;15"));
	}

	@Test
	public static final void whenNegativeNumberIsUsedThenThrownException() {
		Calculator.add("-1,-3,5");
	}

	@Test
	public static final void whenOneOfTheNumberIsGreaterThan1000ThenShouldNotBeIncludedInsum() {
		Assert.assertEquals(2 + 6, Calculator.add("2,1000,1001,6,1234"));
	}

}
