package com;

public class CalculatorImpl extends Calculator {
	@Override
	void add(int x,int y) {
		System.out.println("Sum of "+x+" & "+y+ " is "+(x+y));
	}

	@Override
	void sub(int x,int y) {
		System.out.println("Difference of "+x+" & "+y+ " is "+(x-y));

	}
	@Override
	void mul(int x,int y) {
		System.out.println("Product of "+x+" & "+y+ " is "+(x*y));

	}
	@Override
	void div(int x,int y) {
		System.out.println("Division of "+x+" & "+y+ " is "+(x/y));

	}
}
