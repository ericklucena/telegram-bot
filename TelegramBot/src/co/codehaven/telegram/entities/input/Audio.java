package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Audio {
	
	public static final String FILE_ID_FIELD ="file_id";
	@JsonProperty(FILE_ID_FIELD)
	private String fileId;
	public static final String DURATION_FIELD ="duration";
	@JsonProperty(DURATION_FIELD)
	private int duration; 		//in seconds
	public static final String PERFORMER_FIELD ="performer";
	@JsonProperty(PERFORMER_FIELD)
	private String performer; 	//Optional
	public static final String TITLE_FIELD ="title";
	@JsonProperty(TITLE_FIELD)
	private String title; 		//Optional
	public static final String MIME_TYPE_FIELD ="mime_type";
	@JsonProperty(MIME_TYPE_FIELD)
	private String mimeType;	//Optional
	public static final String FILE_SIZE_FIELD ="file_size";
	@JsonProperty(FILE_SIZE_FIELD)
	private int fileSize;		//Optional
	
	public Audio(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		this.duration = jsonObject.getInt(DURATION_FIELD);
		if (jsonObject.has(PERFORMER_FIELD)) {
			this.performer = jsonObject.getString(PERFORMER_FIELD);
		}
		if (jsonObject.has(TITLE_FIELD)) {
			this.title = jsonObject.getString(TITLE_FIELD);
		}
		if (jsonObject.has(MIME_TYPE_FIELD)) {
			this.mimeType = jsonObject.getString(MIME_TYPE_FIELD);
		}
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
	}
	
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
