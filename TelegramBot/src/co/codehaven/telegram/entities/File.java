package co.codehaven.telegram.entities;

public class File {
	
	private String fileId;
	private int fileSize;		//Optional
	private String filePath;	//Optional
	
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
