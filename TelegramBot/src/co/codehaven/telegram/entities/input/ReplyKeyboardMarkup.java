package co.codehaven.telegram.entities.input;

import org.json.JSONArray;
import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ReplyKeyboard;

public class ReplyKeyboardMarkup implements ReplyKeyboard{

	public static final String KEYBOARD_FIELD ="keyboard";
	private String[][] keyboard;
	public static final String RESIZE_KEYBOARD_FIELD ="resize_keyboard";
	private Boolean resizeKeyboard;		//Optional
	public static final String ONE_TIME_KEYBOARD_FIELD ="one_time_keyboard";
	private Boolean oneTimeKeyboard;	//Optional
	public static final String SELECTIVE_FIELD ="selective";
	private Boolean selective;			//Optional
	
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
        if (jsonObject.has(SELECTIVE_FIELD)) {
        	this.selective = jsonObject.getBoolean(SELECTIVE_FIELD);
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

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
        JSONArray jsonkeyboard = new JSONArray();

        for (String[] innerRow : this.keyboard) {
            JSONArray innerJSONKeyboard = new JSONArray();
            for (String element: innerRow) {
                innerJSONKeyboard.put(element);
            }
            jsonkeyboard.put(innerJSONKeyboard);
        }
        json.put(ReplyKeyboardMarkup.KEYBOARD_FIELD, jsonkeyboard);

        if (this.oneTimeKeyboard != null) {
            json.put(ReplyKeyboardMarkup.ONE_TIME_KEYBOARD_FIELD, this.oneTimeKeyboard);
        }
        if (this.resizeKeyboard != null) {
            json.put(ReplyKeyboardMarkup.RESIZE_KEYBOARD_FIELD, this.resizeKeyboard);
        }
        if (this.selective != null) {
            json.put(ReplyKeyboardMarkup.SELECTIVE_FIELD, this.selective);
        }

        return json;
	}
	
}
