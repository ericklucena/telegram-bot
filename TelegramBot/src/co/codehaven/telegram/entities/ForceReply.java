package co.codehaven.telegram.entities;

public class ForceReply {

	private boolean forceReply;
	private boolean selective;

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
}
