package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class ChosenInlineResult {

	private static final String RESULT_ID_FIELD = "result_id";
	private String resultId;
	private static final String FROM_FIELD = "from";
	private User from;
	private static final String QUERY_FIELD = "query";
	private String query;

	public ChosenInlineResult(JSONObject jsonObject) {
		super();
		this.resultId = jsonObject.getString(RESULT_ID_FIELD);
		this.from = new User(jsonObject.getJSONObject(FROM_FIELD));
		this.query = jsonObject.getString(QUERY_FIELD);
	}

	public ChosenInlineResult(String resultId, User from, String query) {
		super();
		this.resultId = resultId;
		this.from = from;
		this.query = query;
	}

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
