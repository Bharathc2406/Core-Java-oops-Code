package com;

public class BankImpl implements Bank {

	int balance =5000;

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+balance);
		balance = balance+amount; //balance +=amount;
		System.out.println("Amount depositied successfully");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Rs."+balance);
		balance -= amount; //balance =balance-amount;
		System.out.println("Amount withdrawn successfully");	
	}

	@Override
	public void checkBalance() {
		System.out.println("Available Balance Rs."+balance);	
	}

}
