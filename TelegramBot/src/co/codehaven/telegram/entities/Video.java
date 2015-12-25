package co.codehaven.telegram.entities;

public class Video {
	
	private String fileId;
	private int width;
	private int height;
	private int duration;		//In seconds
	private PhotoSize thumb;	//Optional
	private String mimeType;	//Optional
	private int fileSize; 		//Optional
	
	public Video(String fileId, int width, int height, int duration, PhotoSize thumb, String mimeType, int fileSize) {
		this.fileId = fileId;
		this.width = width;
		this.height = height;
		this.duration = duration;
		this.thumb = thumb;
		this.mimeType = mimeType;
		this.fileSize = fileSize;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
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
