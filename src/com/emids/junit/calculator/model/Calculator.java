package com.emids.junit.calculator.model;

import java.util.ArrayList;
import java.util.List;

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
	    List negativeNumbers = new ArrayList();
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            int numberInt = Integer.parseInt(number.trim());
	            if (numberInt < 0) {
	                negativeNumbers.add(numberInt);
	            }
	            returnValue += numberInt;
	        }
	    }
	    if (negativeNumbers.size() > 0) {
	        throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
	    }
	    return returnValue;     
	}
}
