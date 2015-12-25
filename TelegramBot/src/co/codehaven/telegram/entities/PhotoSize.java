package co.codehaven.telegram.entities;

public class PhotoSize {
	
	private String fileId;
	private int width;
	private int height;
	private int fileSize; //Optional
	
	public PhotoSize(String fileId, int width, int height, int fileSize) {
		this.fileId = fileId;
		this.width = width;
		this.height = height;
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

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
}
