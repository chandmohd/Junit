package com.emids.junit.calculator.model;

public class Calculator {
	public static void main(String[] args) {

	}

	public static int add(String string) {
		String[] stringArray = string.split(",|n");
		String delimiter = ",|n";
	    String numbersWithoutDelimiter = string;
	    if (string.startsWith("//")) {
	        int delimiterIndex = string.indexOf("//") + 2;
	        delimiter = string.substring(delimiterIndex, delimiterIndex + 1);
	        numbersWithoutDelimiter = string.substring(string.indexOf("n") + 1);
	    }
	    return add(numbersWithoutDelimiter, delimiter);
}
	private static int add(final String numbers, final String delimiter) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(delimiter);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}
}
