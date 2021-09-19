package main.services;

import java.util.List;

import main.entities.Account;
import main.entities.Message;

public class AccountService {

	public void processMessages(List<Message> messages, List<Account> accounts) {
		for (int i = 0; i < messages.size(); i++) {
			proccesMessage(messages.get(i), accounts);
			if ((i + 1) % 10 == 0) {
				System.out.println("---------------------INFO---------------------");
				for (Account account : accounts) {
					System.out.println("Transactions for account " + account.getNumber() + " :");
					for (Message message : account.getTransactions()) {
						System.out.println("- Currency : " + (message.getCurrency() == null ? account.getCurrency()
								: message.getCurrency()) + ", amount: " + message.getAmount());
					}
				}
			}
		}
	}

	private void proccesMessage(Message message, List<Account> accounts) {
		for (Account account : accounts) {
			if (message.getNumber().equals(account.getNumber())) {
				Double rate = message.getRate() == null ? 1 : message.getRate();
				account.setBalance(account.getBalance() + message.getAmount() * rate);
				account.getTransactions().add(message);
				return;
			}
		}
		System.out.println("WARNING! Account number not found! Transaction aborted : " + message);
	}
}
