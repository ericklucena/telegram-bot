package co.codehaven.telegram.entities;

public class Voice {

	private String fileId;
	private int duration;		//In seconds
	private String mimeType;	//Optional
	private int fileSize;		//Optional
	
	public Voice(String fileId, int duration, String mimeType, int fileSize) {
		this.fileId = fileId;
		this.duration = duration;
		this.mimeType = mimeType;
		this.fileSize = fileSize;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

}
