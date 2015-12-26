package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {
	
	public static final String FILE_ID_FIELD ="file_id";
	@JsonProperty(FILE_ID_FIELD)
	private String fileId;
	public static final String WIDTH_FIELD ="width";
	@JsonProperty(WIDTH_FIELD)
	private int width;
	public static final String HEIGHT_FIELD ="height";
	@JsonProperty(HEIGHT_FIELD)
	private int height;
	public static final String DURATION_FIELD ="duration";
	@JsonProperty(DURATION_FIELD)
	private int duration;		//In seconds
	public static final String THUMB_FIELD ="thumb";
	@JsonProperty(THUMB_FIELD)
	private PhotoSize thumb;	//Optional
	public static final String MIME_TYPE_FIELD ="mime_type";
	@JsonProperty(MIME_TYPE_FIELD)
	private String mimeType;	//Optional
	public static final String FILE_SIZE_FIELD ="file_size";
	@JsonProperty(FILE_SIZE_FIELD)
	private int fileSize; 		//Optional
	
	public Video(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		this.width = jsonObject.getInt(WIDTH_FIELD);
		this.height = jsonObject.getInt(HEIGHT_FIELD);
		this.duration = jsonObject.getInt(DURATION_FIELD);
		if (jsonObject.has(THUMB_FIELD)) {
			this.thumb = new PhotoSize(jsonObject.getJSONObject(THUMB_FIELD));
		}
		if (jsonObject.has(MIME_TYPE_FIELD)) {
			this.mimeType = jsonObject.getString(MIME_TYPE_FIELD);
		}
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
	}
	
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
