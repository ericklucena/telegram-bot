package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class GetUpdates implements ITelegramApiMethod{
	
	private static final String PATH = "getUpdates";
	
	public static final String OFFSET_FIELD = "offset";
	private Integer offset;		// Optional
	public static final String LIMIT_FIELD = "limit";
	private Integer limit;		// Optional
	public static final String TIMEOUT_FIELD = "timeout";
	private Integer timeout;	// Optional

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

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		if (this.offset != null) {
			json.put(OFFSET_FIELD, this.offset);
		}
		if (this.limit != null) {
			json.put(LIMIT_FIELD, this.limit);
		}
		if (this.timeout != null) {
			json.put(TIMEOUT_FIELD, this.timeout);
		}
		
		return json;
	}
	
	@Override
	public String getMethodUrl() {
		return Telegram.botUrl()+PATH;
	}

}
