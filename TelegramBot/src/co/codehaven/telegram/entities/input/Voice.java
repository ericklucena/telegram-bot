package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class Voice {

	private static final String FILE_ID_FIELD ="file_id";
	private String fileId;
	private static final String DURATION_FIELD ="duration";
	private int duration;		//In seconds
	private static final String MIME_TYPE_FIELD ="mime_type";
	private String mimeType;	//Optional
	private static final String FILE_SIZE_FIELD ="file_size";
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
