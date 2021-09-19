package main.entities;

public class Message {

	private String number;
	private String currency;
	private Double amount;
	private Double rate;

	public String getNumber() {
		return number;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Message [Account=" + number + ", currency=" + currency + ", amount=" + amount + ", rate=" + rate + "]";
	}
	
	
	
}
