package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class Document {
	
	private static final String FILE_ID_FIELD = "file_id";
	private String fileId;
	private static final String THUMB_FIELD = "thumb";
	private PhotoSize thumb; 	// Optional
	private static final String FILE_NAME_FIELD = "file_name";
	private String fileName; 	// Optional
	private static final String MIME_TYPE_FIELD = "mime_field"; 
	private String mimeType; 	// Optional
	private static final String FILE_SIZE_FIELD = "file_size"; 
	private int fileSize; 		// Optional

	public Document(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		if (jsonObject.has(THUMB_FIELD)) {
			this.thumb = new PhotoSize(jsonObject.getJSONObject(THUMB_FIELD));
		}
		if (jsonObject.has(FILE_NAME_FIELD)) {
			this.fileName = jsonObject.getString(FILE_NAME_FIELD);
		}
		if (jsonObject.has(MIME_TYPE_FIELD)) {
			this.mimeType = jsonObject.getString(MIME_TYPE_FIELD);
		}
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
	}
	
	public Document(String fileId, PhotoSize thumb, String fileName, String mimeType, int fileSize) {
		this.fileId = fileId;
		this.thumb = thumb;
		this.fileName = fileName;
		this.mimeType = mimeType;
		this.fileSize = fileSize;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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
