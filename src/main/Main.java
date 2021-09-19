package main;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.entities.Account;
import main.services.AccountService;
import main.services.MessageService;
import main.util.FileReaderUtil;

public class Main {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("11111111-22222222", "HUF", 150000d));
		accounts.add(new Account("22222222-33333333", "USD", 1230d));
		try {
			MessageService messageService = new MessageService();
			AccountService accountService = new AccountService();
			accountService.processMessages(messageService.prepareMessages(FileReaderUtil.csvReader(new File("").getAbsolutePath() + "/messages.csv")), accounts);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
