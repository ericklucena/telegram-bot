package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class File {

	private static final String FILE_ID_FIELD = "file_id";
	private String fileId;
	private static final String FILE_SIZE_FIELD = "file_size";
	private int fileSize;		//Optional
	private static final String FILE_PATH_FIELD = "file_path";
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
