package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class GetFile implements ITelegramApiMethod{
	
	private static final String PATH = "getFile";
	
	public static final String FILE_ID_FIELD = "file_id";
	private String fileId;

	public GetFile(String fileId) {
		super();
		this.fileId = fileId;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(FILE_ID_FIELD, this.fileId);
		return json;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl() + PATH;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
