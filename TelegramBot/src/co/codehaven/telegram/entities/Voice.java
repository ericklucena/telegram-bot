package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Voice {

	public static final String FILE_ID_FIELD ="file_id";
	@JsonProperty(FILE_ID_FIELD)
	private String fileId;
	public static final String DURATION_FIELD ="duration";
	@JsonProperty(DURATION_FIELD)
	private int duration;		//In seconds
	public static final String MIME_TYPE_FIELD ="mime_type";
	@JsonProperty(MIME_TYPE_FIELD)
	private String mimeType;	//Optional
	public static final String FILE_SIZE_FIELD ="file_size";
	@JsonProperty(FILE_SIZE_FIELD)
	private int fileSize;		//Optional
	
	public Voice(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		this.duration = jsonObject.getInt(DURATION_FIELD);
		if (jsonObject.has(MIME_TYPE_FIELD)) {
			this.mimeType = jsonObject.getString(MIME_TYPE_FIELD);
		}
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
	}
	
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
