package co.codehaven.telegram.entities.output;

import org.json.JSONArray;
import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.entities.interfaces.InlineQueryResult;
import co.codehaven.telegram.util.Telegram;

public class AnswerInlineQuery implements ITelegramApiMethod {

	private static final String PATH = "answerInlineQuery";

	private static final String INLINE_QUERY_ID_FIELD = "inline_query_id";
	private String inlineQueryId;
	private static final String RESULTS_FIELD = "results";
	private InlineQueryResult[] results;
	private static final String CACHE_TIME_FIELD = "cache_time";
	private Integer cacheTime; // Optional | Defaults to 300.
	private static final String IS_PERSONAL_FIELD = "is_personal";
	private Boolean isPersonal; // Optional
	private static final String NEXT_OFFSET_FIELD = "next_offset";
	private String next_offset;

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(INLINE_QUERY_ID_FIELD, this.inlineQueryId);
		for (InlineQueryResult result : results) {
			json.append(RESULTS_FIELD, result.toJson());
		}
		if (this.cacheTime != null) {
			json.put(CACHE_TIME_FIELD, this.cacheTime);
		}
		if (this.isPersonal != null) {
			json.put(IS_PERSONAL_FIELD, this.isPersonal);
		}
		if (this.next_offset != null) {
			json.put(NEXT_OFFSET_FIELD, this.next_offset);
		}

		return json;
	}
	
	public AnswerInlineQuery(String inlineQueryId, InlineQueryResult[] results) {
		super();
		this.inlineQueryId = inlineQueryId;
		this.results = results;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl() + PATH;
	}

	public String getInlineQueryId() {
		return inlineQueryId;
	}

	public void setInlineQueryId(String inlineQueryId) {
		this.inlineQueryId = inlineQueryId;
	}

	public InlineQueryResult[] getResults() {
		return results;
	}

	public void setResults(InlineQueryResult[] results) {
		this.results = results;
	}

	public Integer getCacheTime() {
		return cacheTime;
	}

	public void setCacheTime(Integer cacheTime) {
		this.cacheTime = cacheTime;
	}

	public Boolean getIsPersonal() {
		return isPersonal;
	}

	public void setIsPersonal(Boolean isPersonal) {
		this.isPersonal = isPersonal;
	}

	public String getNext_offset() {
		return next_offset;
	}

	public void setNext_offset(String next_offset) {
		this.next_offset = next_offset;
	}
}
