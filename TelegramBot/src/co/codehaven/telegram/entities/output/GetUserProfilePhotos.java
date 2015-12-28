package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class GetUserProfilePhotos implements ITelegramApiMethod{
	
	private static final String PATH = "getUserProfilePhotos";
	
	public static final String USER_ID_FIELD = "user_id";
	private Integer userId;
	public static final String OFFSET_FIELD = "offset";
	private Integer offset;	// Optional
	public static final String LIMIT_FIELD = "limit";
	private Integer limit;	// Optional
	
	public GetUserProfilePhotos(Integer userId) {
		super();
		this.userId = userId;
	}

	public GetUserProfilePhotos(Integer userId, Integer offset, Integer limit) {
		super();
		this.userId = userId;
		this.offset = offset;
		this.limit = limit;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put(USER_ID_FIELD, this.userId);
		if (this.offset != null) {
			json.put(OFFSET_FIELD, this.offset);
		}
		if (this.limit != null) {
			json.put(LIMIT_FIELD, this.limit);
		}
		return json;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl() + PATH;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

}
