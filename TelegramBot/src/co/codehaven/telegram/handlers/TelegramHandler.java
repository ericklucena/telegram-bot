package co.codehaven.telegram.handlers;

import org.json.JSONArray;
import org.json.JSONObject;

import co.codehaven.telegram.entities.input.Message;
import co.codehaven.telegram.entities.input.Update;
import co.codehaven.telegram.entities.output.SendMessage;
import co.codehaven.telegram.entities.output.SendSticker;
import co.codehaven.telegram.util.Network;
import co.codehaven.telegram.util.Telegram;

public class TelegramHandler {
	
	public static void resultObjectHandler(JSONObject jsonObject) {
		JSONArray jArray = jsonObject.getJSONArray(Telegram.RESULT);
		
		
		for (int i=0; i<jArray.length(); i++) {
			JSONObject json = jArray.getJSONObject(i);
			Message message = new Message(json.getJSONObject(Telegram.MESSAGE));
			messageHandler(message);
		}
	}
	
	public static void updateObjectHandler(JSONObject jsonObject) {
		Update update = new Update(jsonObject);
		messageHandler(update.getMessage());
	}
	
	public static void messageHandler(Message message) {
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
