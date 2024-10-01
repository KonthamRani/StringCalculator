package com.rani.calculator;

public class StringCalculator {
	public int add(String numbers) {
		//code for empty string
	    if (numbers.isEmpty()) {
	        return 0;
	    }
	    //code for string containing different delimeters
	    else if (numbers.startsWith("//")) {
	        String delimiter = numbers.substring(2, 3);
	        numbers = numbers.substring(4);
	        String[] numArray = numbers.split(delimiter);
	        int sum = 0;
	        for (String num : numArray) {
	            sum += Integer.parseInt(num);
	        }
	        return sum;
	    }
	    String[] numArray = numbers.split("[,\n]");
	    int sum = 0;
	    for (String num : numArray) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}

	
  public static void main(String[] args) {
	  StringCalculator calculator = new StringCalculator();
      System.out.println(calculator.add("1,2"));
  }
}
