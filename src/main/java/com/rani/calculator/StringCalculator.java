package com.rani.calculator;

public class StringCalculator {
	public int add(String numbers) {
		String[] numsArray = numbers.split("[,\n]");
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
	    else
	    {
	    	int sum = 0;
	        StringBuilder negatives = new StringBuilder();
	        for (String num : numsArray) {
	            int number = Integer.parseInt(num);
	            if (number < 0) {
	                if (negatives.length() > 0) {
	                    negatives.append(",");
	                }
	                negatives.append(number);
	            }
	            sum += number;
	        }
	        if (negatives.length() > 0) {
	            throw new IllegalArgumentException("negative numbers not allowed " + negatives);
	        }
	    }
	    int sum = 0;
	    for (String num : numsArray) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}

	
  public static void main(String[] args) {
	  StringCalculator calculator = new StringCalculator();
      System.out.println( calculator.add("1,-2,-3"));
  }
}
