package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplyKeyboardHide {

	public static final String HIDE_KEYBOARD_FIELD ="hide_keyboard";
	@JsonProperty(HIDE_KEYBOARD_FIELD)
	private boolean hideKeyboard;
	public static final String SELECTIVE_FIELD ="selective";
	@JsonProperty(SELECTIVE_FIELD)
	private boolean selective;		// Optional
	
	public ReplyKeyboardHide(JSONObject jsonObject) {
		this.hideKeyboard = jsonObject.getBoolean(HIDE_KEYBOARD_FIELD);
		if (jsonObject.has(SELECTIVE_FIELD)) {
			this.selective = jsonObject.getBoolean(SELECTIVE_FIELD);			
		}
	}

	public ReplyKeyboardHide(boolean selective) {
		this.hideKeyboard = true;
		this.selective = selective;
	}
	
	public boolean isHideKeyboard() {
		return hideKeyboard;
	}

	public boolean isSelective() {
		return selective;
	}
	
	public void setSelective(boolean selective) {
		this.selective = selective;
	}

}
