package com.rani.calculator;

public class StringCalculator {
	//code for empty string
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0; 
        }

        String delimiter = ",|\n"; 

      //code for string containing different delimeters
        if (numbers.startsWith("//")) {
        	// Extract delimiter from the input string
            int delimiterIndex = numbers.indexOf('\n');
            delimiter = numbers.substring(2, delimiterIndex);
            // Extract the numbers part
            numbers = numbers.substring(delimiterIndex + 1); 
        }

        // Split numbers based on the delimiters
        String[] numsArray = numbers.split(delimiter);

        // Calculate the sum and handle negative numbers
        return calculateSum(numsArray);
    }

    // Method to calculate sum and check for negative numbers
    private int calculateSum(String[] numbers) {
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();

        for (String num : numbers) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                if (negativeNumbers.length() > 0) {
                    negativeNumbers.append(",");
                }
                negativeNumbers.append(number);
            }
            sum += number;
        }

        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("negative numbers not allowed " + negativeNumbers);
        }

        return sum;
    }

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add("-3")); 
    }
}
