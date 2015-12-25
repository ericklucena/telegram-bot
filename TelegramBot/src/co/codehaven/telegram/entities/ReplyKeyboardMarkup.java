package co.codehaven.telegram.entities;

public class ReplyKeyboardMarkup {

	private String[][] keyboard;
	private boolean resizeKeyboard;		//Optional
	private boolean oneTimeKeyboard;	//Optional
	private boolean selective;			//Optional
	
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
