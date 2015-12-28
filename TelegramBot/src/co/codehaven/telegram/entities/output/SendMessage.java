package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;
import co.codehaven.telegram.util.Telegram;

public class SendMessage implements ITelegramApiMethod{

	private static final String PATH = "sendMessage";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chatId;
	public static final String TEXT_FIELD = "text";
	private String text;
	public static final String PARSE_MODE_FIELD = "parse_mode";
	private String parseMode;				// Optional
	public static final String DISABLE_WEB_PAGE_PREVIEW_FIELD = "disable_web_page_preview";
	private String disableWebPagePreview;	// Optional
	public static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
	private Integer replyToMessageId;			// Optional
	public static final String REPLY_MARKUP_FIELD = "reply_markup";
	private ReplyKeyboard replyMarkup;// Optional
	
	public SendMessage(String chatId, String text) {
		super();
		this.chatId = chatId;
		this.text = text;
	}

	public SendMessage(String chatId, String text, String parseMode, String disableWebPagePreview, int replyToMessageId,
			ReplyKeyboard replyMarkup) {
		super();
		this.chatId = chatId;
		this.text = text;
		this.parseMode = parseMode;
		this.disableWebPagePreview = disableWebPagePreview;
		this.replyToMessageId = replyToMessageId;
		this.replyMarkup = replyMarkup;
	}

	@Override
	public JSONObject toJson() {
		JSONObject jsonObject = new JSONObject();

		jsonObject.put(CHAT_ID_FIELD, chatId);
		jsonObject.put(TEXT_FIELD, text);
		if (parseMode != null) {
			jsonObject.put(PARSE_MODE_FIELD, parseMode);
		}
		if (disableWebPagePreview != null) {
			jsonObject.put(DISABLE_WEB_PAGE_PREVIEW_FIELD, disableWebPagePreview);
		}
		if (replyToMessageId != null) {
			jsonObject.put(REPLY_TO_MESSAGE_ID_FIELD, replyToMessageId);
		}
		if (replyMarkup != null) {
			jsonObject.put(REPLY_MARKUP_FIELD, replyMarkup.toJson());
		}

		return jsonObject;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getParseMode() {
		return parseMode;
	}

	public void setParseMode(String parseMode) {
		this.parseMode = parseMode;
	}

	public String getDisableWebPagePreview() {
		return disableWebPagePreview;
	}

	public void setDisableWebPagePreview(String disableWebPagePreview) {
		this.disableWebPagePreview = disableWebPagePreview;
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
