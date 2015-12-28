package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;
import co.codehaven.telegram.util.Telegram;

public class SendAudio implements ITelegramApiMethod{
	
	private static final String PATH = "sendAudio";
	
	public static final String CHAT_ID_FIELD = "chat_id";
	private String chat_id;
	public static final String AUDIO_FIELD = "audio";
	private String audio;
	public static final String DURATION_FIELD = "duration";
	private Integer duration;			// Optional
	public static final String PERFORMER_FIELD = "performer";
	private String performer;			// Optional
	public static final String TITLE_FIELD = "title";
	private String title;				// Optional
	public static final String REPLY_TO_MESSAGE_ID_FIELD = "reply_to_message_id";
	private Integer replyToMessageId;	// Optional
	public static final String REPLY_MARKUP_FIELD = "reply_markup";
	private ReplyKeyboard replyMarkup;	// Optional
	
	public SendAudio(String chat_id, String audio) {
		super();
		this.chat_id = chat_id;
		this.audio = audio;
	}

	public SendAudio(String chat_id, String audio, Integer duration, String performer, String title,
			Integer replyToMessageId, ReplyKeyboard replyMarkup) {
		super();
		this.chat_id = chat_id;
		this.audio = audio;
		this.duration = duration;
		this.performer = performer;
		this.title = title;
		this.replyToMessageId = replyToMessageId;
		this.replyMarkup = replyMarkup;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(CHAT_ID_FIELD, this.chat_id);
		json.put(AUDIO_FIELD, this.audio);
		if (this.duration != null) {
			json.put(DURATION_FIELD, this.duration);
		}
		if (this.performer != null) {
			json.put(PERFORMER_FIELD, this.performer);
		}
		if (this.title != null) {
			json.put(TITLE_FIELD, this.title);
		}
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

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
