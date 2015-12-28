package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class ForwardMessage implements ITelegramApiMethod{
	
	private static final String PATH = "forwardMessage";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chatId;
	public static final String FROM_CHAT_ID_FIELD = "from_chat_id";
	private String fromChatId;
	public static final String MESSAGE_ID_FIELD = "message_id";
	private String messageId;
	
	public ForwardMessage(String chatId, String fromChatId, String messageId) {
		super();
		this.chatId = chatId;
		this.fromChatId = fromChatId;
		this.messageId = messageId;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(CHAT_ID_FIELD, this.chatId);
		json.put(FROM_CHAT_ID_FIELD, this.fromChatId);
		json.put(MESSAGE_ID_FIELD, this.messageId);

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

	public String getFromChatId() {
		return fromChatId;
	}

	public void setFromChatId(String fromChatId) {
		this.fromChatId = fromChatId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
}
