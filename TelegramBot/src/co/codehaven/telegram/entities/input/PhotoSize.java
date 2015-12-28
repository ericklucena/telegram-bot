package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class PhotoSize {

	public static final String FILE_ID_FIELD = "file_id";
	private String fileId;
	public static final String WIDTH_FIELD = "width";
	private int width;
	public static final String HEIGHT_FIELD = "height";
	private int height;
	public static final String FILE_SIZE_FIELD = "file_size";
	private int fileSize; //Optional
	
	public PhotoSize(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		this.width = jsonObject.getInt(WIDTH_FIELD);
		this.height = jsonObject.getInt(HEIGHT_FIELD);
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
	}
	
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
