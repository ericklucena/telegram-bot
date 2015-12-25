package co.codehaven.telegram.entities;

public class Audio {
	
	private String fileId;
	private int duration; 		//in seconds
	private String performer; 	//Optional
	private String title; 		//Optional
	private String mimeType;	//Optional
	private int fileSize;		//Optional

	public Audio(String fileId, int duration, String performer, String title, String mimeType, int fileSize) {
		this.fileId = fileId;
		this.duration = duration;
		this.performer = performer;
		this.title = title;
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

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
