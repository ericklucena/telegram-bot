package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class Update {
	
	private static final String UPDATE_ID_FIELD = "update_id";
	private int updateId;
	private static final String MESSAGE_FIELD = "message";
	private Message message;	// Optional
	private static final String INLINE_QUERY_FIELD = "inline_query";
	private InlineQuery inlineQuery;	// Optional
	private static final String CHOSEN_INLINE_RESULT_FIELD = "chosen_inline_result";
	private ChosenInlineResult chosenInlineResult;	// Optional
	

	public Update(JSONObject jsonObject) {
		this.updateId = jsonObject.getInt(UPDATE_ID_FIELD);
		if (jsonObject.has(MESSAGE_FIELD)) {
			this.message = new Message(jsonObject.getJSONObject(MESSAGE_FIELD));
		}
		if (jsonObject.has(INLINE_QUERY_FIELD)) {
			this.inlineQuery = new InlineQuery(jsonObject.getJSONObject(INLINE_QUERY_FIELD));
		}
		if (jsonObject.has(CHOSEN_INLINE_RESULT_FIELD)) {
			this.chosenInlineResult = new ChosenInlineResult(jsonObject.getJSONObject(CHOSEN_INLINE_RESULT_FIELD));
		}
	}
	
	public Update(int updateId, Message message) {
		super();
		this.updateId = updateId;
		this.message = message;
	}

	public int getUpdateId() {
		return updateId;
	}

	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public InlineQuery getInlineQuery() {
		return inlineQuery;
	}

	public void setInlineQuery(InlineQuery inlineQuery) {
		this.inlineQuery = inlineQuery;
	}

	public ChosenInlineResult getChosenInlineResult() {
		return chosenInlineResult;
	}

	public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
		this.chosenInlineResult = chosenInlineResult;
	}

}
