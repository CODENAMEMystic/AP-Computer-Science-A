package problem;

import java.util.Date;
import java.util.List;

public class Account {
	
	
	private String customer; 

	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	
	private Date dateCreated;
	
	private List<Transaction> transactions;
	
	
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}
	
	public Account(String customer, int id, double balance) {
		this.customer = customer;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void setAnnualInterestRate(double rate) {
		annualInterestRate = rate / 100;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public double getMonthlyInterestRate() {
		return Math.pow(1 + annualInterestRate, (1/12.0)) - 1;
	}
	
	public void withdraw(double amount) {
        this.balance -= amount;
        Transaction t = new Transaction('W', amount, this.balance, "Withdraw from account.");
        transactions.add(t);
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction t = new Transaction('D', amount, this.balance, "Deposit to account.");
        transactions.add(t);
    }
    
    
	public String toString() {
		String output = "ID: "+id + "\t"+"Customer: "+customer + "\t"+"Balance: "+balance;
		
		/*
		for(int i = 0; i < transactions.size(); i++) {
			output += transactions.get(i);
		}
		output += "\n";
		*/
		//output += ""+this.transactions;
		return output;
	}
	
}