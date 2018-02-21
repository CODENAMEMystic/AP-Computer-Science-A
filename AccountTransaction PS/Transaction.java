package problem;

import java.util.Date;

public class Transaction {
	private Date dateCreated = new Date();	//The date of this transaction
	private char type;	//The type of transaction, such as W for widthdrawal, D for deposit
	
	private double amount;	//The amount of transaction
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
}
