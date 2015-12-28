package co.codehaven.telegram.handlers;

import co.codehaven.telegram.entities.input.Message;
import co.codehaven.telegram.entities.output.SendMessage;
import co.codehaven.telegram.entities.output.SendSticker;
import co.codehaven.telegram.util.Network;

// Example of custom action for the Bot
public class ParrotHandler {

	public static void repeat(Message message) {
		if (message.getText() != null) {
			SendMessage sendMessage = new SendMessage(message.getChat().getId(), message.getText());
			Network.executeTelegramMethod(sendMessage);
		}
		
		if (message.getSticker() != null) {
			SendSticker sendSticker = new SendSticker(message.getChat().getId(), message.getSticker().getFileId());
			Network.executeTelegramMethod(sendSticker);
		}
	}
}
