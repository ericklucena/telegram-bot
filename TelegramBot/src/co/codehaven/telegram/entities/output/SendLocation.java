package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;
import co.codehaven.telegram.util.Telegram;

public class SendLocation implements ITelegramApiMethod{
	
	private static final String PATH = "sendLocation";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chatId;
	public static final String LATITUDE_FIELD = "latitude";
	private Float latitude;
	public static final String LONGITUDE_FIELD = "longitude";
	private Float longitude;
	public static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
	private Integer replyToMessageId;	// Optional
	public static final String REPLY_MARKUP_FIELD = "reply_markup";
	private ReplyKeyboard replyMarkup;	// Optional
	
	public SendLocation(String chatId, Float latitude, Float longitude) {
		super();
		this.chatId = chatId;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public SendLocation(String chatId, Float latitude, Float longitude, Integer replyToMessageId,
			ReplyKeyboard replyMarkup) {
		super();
		this.chatId = chatId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.replyToMessageId = replyToMessageId;
		this.replyMarkup = replyMarkup;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(CHAT_ID_FIELD, this.chatId);
		json.put(LATITUDE_FIELD, this.latitude);
		json.put(LONGITUDE_FIELD, this.longitude);
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

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
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
