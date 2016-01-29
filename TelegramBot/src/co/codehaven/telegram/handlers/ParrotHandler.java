package co.codehaven.telegram.handlers;

import co.codehaven.telegram.entities.input.InlineQuery;
import co.codehaven.telegram.entities.input.InlineQueryResultPhoto;
import co.codehaven.telegram.entities.input.Message;
import co.codehaven.telegram.entities.input.User;
import co.codehaven.telegram.entities.interfaces.InlineQueryResult;
import co.codehaven.telegram.entities.output.AnswerInlineQuery;
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
	
	public static void showParrot(InlineQuery inlineQuery) {
		
		
		InlineQueryResult[] results = new InlineQueryResult[1];
		results[0] = new InlineQueryResultPhoto("1", "https://secure.static.tumblr.com/dc50197ddc57fe5e8201c2114b13ba85/klz6vpx/B7Yn5810s/tumblr_static_tumblr_static__640.jpg");
		
		AnswerInlineQuery answer = new AnswerInlineQuery(inlineQuery.getId(), results);
		
		Network.executeTelegramMethod(answer);
	}
}
