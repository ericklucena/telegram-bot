package co.codehaven.telegram.handlers;

import org.json.JSONArray;
import org.json.JSONObject;

import co.codehaven.telegram.entities.input.InlineQuery;
import co.codehaven.telegram.entities.input.Message;
import co.codehaven.telegram.entities.input.Update;
import co.codehaven.telegram.entities.output.SendMessage;
import co.codehaven.telegram.entities.output.SendSticker;
import co.codehaven.telegram.util.Network;
import co.codehaven.telegram.util.Telegram;

public class TelegramHandler {

	public static void resultObjectHandler(JSONObject jsonObject) {
		JSONArray jArray = jsonObject.getJSONArray(Telegram.RESULT);
		
		for (int i = 0; i < jArray.length(); i++) {
			JSONObject json = jArray.getJSONObject(i);
			if (json.has(Telegram.INLINE_QUERY)) {
				InlineQuery inlineQuery = new InlineQuery(json.getJSONObject(Telegram.INLINE_QUERY));
				inlineQueryHandler(inlineQuery);
			} else if (json.has(Telegram.MESSAGE)) {
				Message message = new Message(json.getJSONObject(Telegram.MESSAGE));
				messageHandler(message);
			}
		}
	}

	public static void updateObjectHandler(JSONObject jsonObject) {
		Update update = new Update(jsonObject);
		if (update.getMessage() != null) {
			messageHandler(update.getMessage());			
		} else if (update.getInlineQuery() != null) {
			inlineQueryHandler(update.getInlineQuery());
		}
	}

	public static void messageHandler(Message message) {
		ParrotHandler.repeat(message);
	}

	public static void inlineQueryHandler(InlineQuery inlineQuery) {
		ParrotHandler.showParrot(inlineQuery);
	}

}
