package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;

public class ForceReply implements ReplyKeyboard {
	
	public static final String FORCE_REPLY_FIELD ="force_reply";
	@JsonProperty(FORCE_REPLY_FIELD)
	private boolean forceReply;
	public static final String SELECTIVE_FIELD ="selective";
	@JsonProperty(SELECTIVE_FIELD)
	private boolean selective;

	public ForceReply(JSONObject jsonObject) {
		this.forceReply = jsonObject.getBoolean(FORCE_REPLY_FIELD);
		if (jsonObject.has(SELECTIVE_FIELD)) {
			this.selective = jsonObject.getBoolean(SELECTIVE_FIELD);			
		}
	}
	
	public ForceReply(boolean selective) {
		this.forceReply = true;
		this.selective = selective;
	}
	
	public boolean isForceReply() {
		return forceReply;
	}

	public boolean isSelective() {
		return selective;
	}
	
	public void setSelective(boolean selective) {
		this.selective = selective;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(FORCE_REPLY_FIELD, forceReply);
		json.put(SELECTIVE_FIELD, selective);
		return json;
	}
}
