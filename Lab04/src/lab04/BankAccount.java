package lab04;

import java.util.ArrayList;

public class BankAccount {

	private String name;
	public int accNo;
	private double loanAmount, loanLength, loanRate, balance;

	// This is your constructor!
	// Make sure to put in a String, int, and a double when creating a BankAccount
	// object!
	public BankAccount(String name, int accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// Create getter and setter for accNo
	public int getAccNo() {
		return this.accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	// Create getter and setter for balance
	public double getBalance() {
		return this.balance;
	}

	// TODO Create the necessary methods here
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void setLoanDetails(double loanAmount, double interest, double length) {
		this.loanAmount = loanAmount;
		this.loanRate = interest;
		this.loanLength = length;
	}

	public double getLoan() {
		return this.loanAmount + this.loanAmount*this.loanRate*this.loanLength;
	}

	public boolean isArmstrong() {
		int i = getAccNo();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (i>0) {
			digits.add(i % 10);
			i /= 10;
		}
		int total = digits.get(0)*digits.get(0)*digits.get(0) + digits.get(1)*digits.get(1)*digits.get(1) + digits.get(2)*digits.get(2)*digits.get(2);
		if(total == i) {
			return true;
		}
		
		
		return false;
	}
	
}
	
