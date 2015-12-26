package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class File {

	public static final String FILE_ID_FIELD = "file_id";
	@JsonProperty(FILE_ID_FIELD)
	private String fileId;
	public static final String FILE_SIZE_FIELD = "file_size";
	@JsonProperty(FILE_SIZE_FIELD)
	private int fileSize;		//Optional
	public static final String FILE_PATH_FIELD = "file_path";
	@JsonProperty(FILE_PATH_FIELD)
	private String filePath;	//Optional
	
	public File(JSONObject jsonObject) {
		this.fileId = jsonObject.getString(FILE_ID_FIELD);
		if (jsonObject.has(FILE_SIZE_FIELD)) {
			this.fileSize = jsonObject.getInt(FILE_SIZE_FIELD);
		}
		if (jsonObject.has(FILE_PATH_FIELD)) {
			this.filePath = jsonObject.getString(FILE_PATH_FIELD);
		}
	}
	
	public File(String fileId, int fileSize, String filePath) {
		super();
		this.fileId = fileId;
		this.fileSize = fileSize;
		this.filePath = filePath;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
