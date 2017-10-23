package com.emids.junit.calculator.model;

public class Calculator {
	public static void main(String[] args) {

	}

	public static int add(String string) {
		String[] stringArray=string.split(",");
		int sum=0;
		if(stringArray.length>2)
		{
			throw new RuntimeException("up to two number are allowed sperated by comma(,)");
		}
		else
		{
			for(String number:stringArray) {
				if(!number.trim().isEmpty()) {
					sum+=Integer.parseInt(number);
				}
			}
		}
		return sum;
	}
}
