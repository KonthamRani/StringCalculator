package com.rani.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
  
	@Test
	public void testEmptyStringReturnsZero() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(0, calculator.add(""));
	}

}
