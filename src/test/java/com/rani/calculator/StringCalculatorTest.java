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
	//Test case to Handle different delimiters
	@Test
	public void testDifferentDelimiters() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(3, calculator.add("//;\n1;2"));
	}
	//Test case for negative numbers throwing an exception.
	@Test
	public void testNegativeNumberThrowsException() {
	    StringCalculator calculator = new StringCalculator();
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        calculator.add("1,-2");
	    });
	    assertEquals("negative numbers not allowed -2", exception.getMessage());
	}
	//Test case for multiple negative numbers throwing exception.
	@Test
	public void testMultipleNegativeNumbersThrowsException() {
	    StringCalculator calculator = new StringCalculator();
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        calculator.add("1,-2,-3");
	    });
	    assertEquals("negative numbers not allowed -2,-3", exception.getMessage());
	}





}
