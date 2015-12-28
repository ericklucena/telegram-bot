package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class SendChatAction implements ITelegramApiMethod{
	
	private static final String PATH = "sendChatAction";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chatId;
	public static final String ACTION_FIELD = "action";
	private String action; // typing | upload_photo | record_video| record_audio| upload_audio | upload_document | find_location

	public SendChatAction(String chatId, String action) {
		super();
		this.chatId = chatId;
		this.action = action;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(CHAT_ID_FIELD, this.chatId);
		json.put(ACTION_FIELD, this.action);
		return json;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl() + PATH;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
