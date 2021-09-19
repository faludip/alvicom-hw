package main.services;

import java.util.ArrayList;
import java.util.List;

import main.entities.Message;

public class MessageService {

	public List<Message> prepareMessages(List<List<String>> messages) {
		List<Message> parsedMessages = new ArrayList<>();
		for (List<String> message : messages) {
			parsedMessages.add(createMessage(message));
		}
		return parsedMessages;
	}

	private Message createMessage(List<String> messageDataList) {
		Message message = new Message();
		isValidMessageData("Számlaszám", messageDataList.get(0));
		isValidMessageData("Pénznem", messageDataList.get(1));
		isValidMessageData("Összeg", messageDataList.get(2));
		isValidMessageData("Valutaárfolyam", messageDataList.get(3));
		message.setNumber(messageDataList.get(0).split(":")[1].trim());
		message.setCurrency(messageDataList.get(1).split(":")[1].trim());
		message.setAmount(Double.parseDouble(messageDataList.get(2).split(":")[1].trim()));
		Double rate = "null".equals(messageDataList.get(3).split(":")[1].trim()) ? null
				: Double.parseDouble(messageDataList.get(3).split(":")[1].trim());
		message.setRate(rate);
		return message;
	}

	private void isValidMessageData(String exceptedMessageText, String messageData) throws IllegalArgumentException {
		if (!messageData.split(":")[0].trim().equals(exceptedMessageText))
			throw new IllegalArgumentException(messageData.split(":")[0].trim() + " not equals with " + exceptedMessageText);
	}
}
