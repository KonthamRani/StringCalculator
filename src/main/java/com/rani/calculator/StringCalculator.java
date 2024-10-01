package com.rani.calculator;

public class StringCalculator {
	public int add(String numbers) {
		//code for empty string
        if (numbers.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(numbers);
        
    }
  public static void main(String[] args) {
	  StringCalculator calculator = new StringCalculator();
      System.out.println(calculator.add("1"));
  }
}
