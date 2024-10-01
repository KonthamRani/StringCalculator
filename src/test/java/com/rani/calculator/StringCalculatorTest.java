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
	//Test case for two numbers
	@Test
	public void testTwoNumbersReturnsSum() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(6, calculator.add("1,5"));
	}
	//Test case for multiple inputs
	@Test
	public void testMultipleNumbersReturnsSum() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(10, calculator.add("1,2,3,4"));
	}
    //Test case to Handle Newlines Between Numbers
	@Test
	public void testNewLinesBetweenNumbers() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(6, calculator.add("1\n2,3"));
	}





}
