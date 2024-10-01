package com.rani.calculator;

public class StringCalculator {
	public int add(String numbers) {
		//code for empty string
	    if (numbers.isEmpty()) {
	        return 0;
	    }
	    String[] numArray = numbers.split(",");
	    //code for single number
	    if (numArray.length == 1) {
	        return Integer.parseInt(numbers);
	    } 
	    //code for 1+ numbers
	    else {
	        return Integer.parseInt(numArray[0]) + Integer.parseInt(numArray[1]);
	    }
	}

	
  public static void main(String[] args) {
	  StringCalculator calculator = new StringCalculator();
      System.out.println(calculator.add("1,2"));
  }
}
