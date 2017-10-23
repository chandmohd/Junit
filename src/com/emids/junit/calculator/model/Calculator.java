package com.emids.junit.calculator.model;

public class Calculator {
	public static void main(String[] args) {

	}

	public static void add(String string) {
		String[] stringArray=string.split(",");
		if(stringArray.length>2)
		{
			throw new RuntimeException("up to two number are allowed sperated by comma(,)");
		}
	}
}
