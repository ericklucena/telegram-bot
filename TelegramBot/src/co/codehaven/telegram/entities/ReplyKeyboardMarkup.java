package co.codehaven.telegram.entities;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;



public class ReplyKeyboardMarkup {

	public static final String KEYBOARD_FIELD ="keyboard";
	@JsonProperty(KEYBOARD_FIELD)
	private String[][] keyboard;
	public static final String RESIZE_KEYBOARD_FIELD ="resize_keyboard";
	@JsonProperty(RESIZE_KEYBOARD_FIELD)
	private boolean resizeKeyboard;		//Optional
	public static final String ONE_TIME_KEYBOARD_FIELD ="one_time_keyboard";
	@JsonProperty(ONE_TIME_KEYBOARD_FIELD)
	private boolean oneTimeKeyboard;	//Optional
	public static final String SELECTIVE ="selective";
	@JsonProperty(SELECTIVE)
	private boolean selective;			//Optional
	
	public ReplyKeyboardMarkup(JSONObject jsonObject) {
		
		JSONArray keyboard = jsonObject.getJSONArray(KEYBOARD_FIELD);
		this.keyboard = new String[keyboard.length()][];
        for (int i=0; i< keyboard.length(); i++) {
            JSONArray keyboardRow = keyboard.getJSONArray(i);
            this.keyboard[i] = new String[keyboardRow.length()];
            for (int j=0; j < keyboardRow.length(); j++) {
                this.keyboard[i][j] = keyboardRow.getString(j);
            }
        }
        if (jsonObject.getBoolean(RESIZE_KEYBOARD_FIELD)) {
        	this.resizeKeyboard = jsonObject.getBoolean(RESIZE_KEYBOARD_FIELD);
        }
        if (jsonObject.has(ONE_TIME_KEYBOARD_FIELD)) {
        	this.oneTimeKeyboard = jsonObject.getBoolean(ONE_TIME_KEYBOARD_FIELD);
        }
        if (jsonObject.has(SELECTIVE)) {
        	this.selective = jsonObject.getBoolean(SELECTIVE);
        }
        
	}
	
	public ReplyKeyboardMarkup(String[][] keyboard, boolean resizeKeyboard, boolean oneTimeKeyboard,
			boolean selective) {
		super();
		this.keyboard = keyboard;
		this.resizeKeyboard = resizeKeyboard;
		this.oneTimeKeyboard = oneTimeKeyboard;
		this.selective = selective;
	}

	public String[][] getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String[][] keyboard) {
		this.keyboard = keyboard;
	}

	public boolean isResizeKeyboard() {
		return resizeKeyboard;
	}

	public void setResizeKeyboard(boolean resizeKeyboard) {
		this.resizeKeyboard = resizeKeyboard;
	}

	public boolean isOneTimeKeyboard() {
		return oneTimeKeyboard;
	}

	public void setOneTimeKeyboard(boolean oneTimeKeyboard) {
		this.oneTimeKeyboard = oneTimeKeyboard;
	}

	public boolean isSelective() {
		return selective;
	}

	public void setSelective(boolean selective) {
		this.selective = selective;
	}
	
}
