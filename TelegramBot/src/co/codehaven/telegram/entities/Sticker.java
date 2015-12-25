package co.codehaven.telegram.entities;

public class Sticker {
	
	private String fileId;
	private int width;
	private int height;
	private PhotoSize thumb;	//Optional
	private int fileSize;		//Optional

	public Sticker(String fileId, int width, int height, PhotoSize thumb, int fileSize) {
		this.fileId = fileId;
		this.width = width;
		this.height = height;
		this.thumb = thumb;
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

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

}
