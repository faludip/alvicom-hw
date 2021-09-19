package main.entities;

import java.util.LinkedList;
import java.util.List;

public class Account {

	private String number;
	private String currency;
	private Double balance;
	private List<Message> transactions;

	public String getNumber() {
		return number;
	}

	public Account(String number, String currency, Double balance) {
		this.number = number;
		this.currency = currency;
		this.balance = balance;
		transactions = new LinkedList<>();
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public List<Message> getTransactions() {
		return transactions;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", currency=" + currency + ", balance=" + balance + "]";
	}

}
