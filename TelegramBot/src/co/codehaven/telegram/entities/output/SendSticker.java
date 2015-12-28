package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;
import co.codehaven.telegram.util.Telegram;

public class SendSticker implements ITelegramApiMethod{
	
	private static final String PATH = "sendSticker";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chat_id;
	public static final String STICKER_FIELD = "sticker";
	private String sticker;
	public static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
	private Integer replyToMessageId;	// Optional
	public static final String REPLY_MARKUP_FIELD = "reply_markup";
	private ReplyKeyboard replyMarkup;	// Optional

	public SendSticker(String chat_id, String sticker) {
		super();
		this.chat_id = chat_id;
		this.sticker = sticker;
	}

	public SendSticker(String chat_id, String sticker, Integer replyToMessageId, ReplyKeyboard replyMarkup) {
		super();
		this.chat_id = chat_id;
		this.sticker = sticker;
		this.replyToMessageId = replyToMessageId;
		this.replyMarkup = replyMarkup;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(CHAT_ID_FIELD, this.chat_id);
		json.put(STICKER_FIELD, this.sticker);
		if (this.replyToMessageId != null) {
			json.put(REPLY_TO_MESSAGE_ID_FIELD, this.replyToMessageId);
		}
		if (this.replyMarkup != null) {
			json.put(REPLY_MARKUP_FIELD, this.replyMarkup.toJson());
		}
		return json;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl() + PATH;
	}

	public String getChat_id() {
		return chat_id;
	}

	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}

	public String getDocument() {
		return sticker;
	}

	public void setDocument(String document) {
		this.sticker = document;
	}

	public Integer getReplyToMessageId() {
		return replyToMessageId;
	}

	public void setReplyToMessageId(Integer replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
	}

	public ReplyKeyboard getReplyMarkup() {
		return replyMarkup;
	}

	public void setReplyMarkup(ReplyKeyboard replyMarkup) {
		this.replyMarkup = replyMarkup;
	}

}
