package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
	
	public static final String FILE_ID_FIELD = "file_id";
	@JsonProperty(FILE_ID_FIELD)
	private String fileId;
	public static final String THUMB_FIELD = "thumb";
	@JsonProperty(THUMB_FIELD)
	private PhotoSize thumb; 	// Optional
	public static final String FILE_NAME_FIELD = "file_name";
	@JsonProperty(FILE_NAME_FIELD)
	private String fileName; 	// Optional
	public static final String MIME_TYPE_FIELD = "mime_field"; 
	@JsonProperty(MIME_TYPE_FIELD)
	private String mimeType; 	// Optional
	public static final String FILE_SIZE_FIELD = "file_size"; 
	@JsonProperty(FILE_SIZE_FIELD)
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
