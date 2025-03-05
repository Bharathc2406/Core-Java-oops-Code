package com;

public class CalculatorImpl implements Calculator {//RULE-2

	@Override //RULE-3
	public void add(int a,int b) {
		int sum =a+b;
		System.out.println("Sum of"+a+" & "+b+" is "+sum);

	}

	@Override//RULE-3
	public void mul(int a, int b) {
		System.out.println("Product of "+a+" & "+b+" is "+(a*b));
	}

}
