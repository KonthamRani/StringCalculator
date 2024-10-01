package com.rani.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
  
	//test case for empty string
	@Test	
	public void testEmptyStringReturnsZero() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(0, calculator.add(""));
	}
	//Test case for single number
	@Test
	public void testSingleNumberReturnsItself() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(1, calculator.add("1"));
	}



}
