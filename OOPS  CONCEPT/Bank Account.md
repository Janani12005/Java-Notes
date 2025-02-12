## Most Asked question in Interview


````java[]

import java.util.*;

//abstraction

 abstract class BankAccount {
	String AccountHolderName;
	double balance;
	
	// Constructor
	
	BankAccount(String AccountHolderName,double balance) {
		this.AccountHolderName = AccountHolderName;
		this.balance = balance;
	}
	
	//Calling the class
	
	public abstract void displayDetails();
	public abstract void currentBalnce();
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String AccountHolderName) {
		this.AccountHolderName =AccountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	// Polymorphism
	
	public void deposit(double amount) {
		if(amount>=0) {
			balance += amount;
			System.out.println("Deposited:"+ amount);
		}
		else {
			System.out.println("invalid amount");
		}
	}
	
	// Polymorphism
	
	public void withdrawl(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("withdrawl amount:"+ amount);
		}
	}
}

//Inheritance

class SavingsAccount extends BankAccount{
	public SavingsAccount(String AccountHolderName,double balance) {
	super(AccountHolderName,balance);
}

// Override

public void displayDetails() {
	System.out.println("SavingsAccount");
	System.out.println("AccountHolderName:"+getAccountHolderName());
	System.out.println("Balance:"+getBalance());
}
public void currentBalnce() {
	System.out.println("final updated balance:"+ getBalance());
}
}
public class Main {
	public static void main(String[ ] args) {
		BankAccount savings = new SavingsAccount("Jaan.S",5000);
		savings.displayDetails();
		savings.deposit(2000);
		savings.deposit(500);
		savings.displayDetails();
		savings.currentBalnce();

	}
}

````
