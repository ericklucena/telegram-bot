package co.codehaven.telegram.entities;

public class ReplyKeyboardHide {

	private boolean hideKeyboard;
	private boolean selective;

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
