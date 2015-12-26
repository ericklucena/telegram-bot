package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Update {
	
	public static final String UPDATE_ID_FIELD = "update_id";
	@JsonProperty(UPDATE_ID_FIELD)
	private int updateId;
	public static final String MESSAGE_FIELD = "message";
	@JsonProperty(MESSAGE_FIELD)
	private Message message;	// Optional

	public Update(JSONObject jsonObject) {
		this.updateId = jsonObject.getInt(UPDATE_ID_FIELD);
		if (jsonObject.has(MESSAGE_FIELD)) {
			this.message = new Message(jsonObject.getJSONObject(MESSAGE_FIELD));
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

}
