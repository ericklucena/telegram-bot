package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;

public class ReplyKeyboardHide implements ReplyKeyboard{

	private static final String HIDE_KEYBOARD_FIELD ="hide_keyboard";
	private boolean hideKeyboard;
	private static final String SELECTIVE_FIELD ="selective";
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

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(HIDE_KEYBOARD_FIELD, hideKeyboard);
		json.put(SELECTIVE_FIELD, selective);
		return json;
	}

}
