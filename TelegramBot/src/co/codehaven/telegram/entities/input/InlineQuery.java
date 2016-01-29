package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class InlineQuery {

	private static final String ID_FIELD = "id";
	private String id;
	private static final String FROM_FIELD = "from";
	private User from;
	private static final String QUERY_FIELD = "query";
	private String query;
	private static final String OFFSET_FIELD = "offset";
	private String offset;

	public InlineQuery(JSONObject jsonObject) {
		super();
		this.id = jsonObject.getString(ID_FIELD);
		this.from = new User(jsonObject.getJSONObject(FROM_FIELD));
		this.query = jsonObject.getString(QUERY_FIELD);
		this.offset = jsonObject.getString(OFFSET_FIELD);
	}

	public InlineQuery(String id, User from, String query, String offset) {
		super();
		this.id = id;
		this.from = from;
		this.query = query;
		this.offset = offset;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}
}
