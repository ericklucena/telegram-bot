package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {
	
	public static final String ID_FIELD = "id";
	@JsonProperty(ID_FIELD)
	private int id;
	public static final String TYPE_FIELD = "type";
	@JsonProperty(TYPE_FIELD)
	private String type; 		// private | group | supergroup | channel
	public static final String TITLE_FIELD = "title";
	@JsonProperty(TITLE_FIELD)
	private String title;		// Optional
	public static final String USERNAME_FIELD = "username";
	@JsonProperty(USERNAME_FIELD)
	private String username;	// Optional
	public static final String FIRST_NAME_FIELD = "first_name";
	@JsonProperty(FIRST_NAME_FIELD)
	private String firstName;	// Optional (only private chat)
	public static final String LAST_NAME_FIELD = "last_name";
	@JsonProperty(LAST_NAME_FIELD)
	private String lastName;	// Optional (only private chat)
	
	public Chat(JSONObject jsonObject) {
		super();
		this.id = jsonObject.getInt(ID_FIELD);
		this.type = jsonObject.getString(TYPE_FIELD);
		if (jsonObject.has(TITLE_FIELD)) {
			this.title = jsonObject.getString(TITLE_FIELD);			
		}
		if (jsonObject.has(USERNAME_FIELD)) {
			this.username = jsonObject.getString(USERNAME_FIELD);
		}
		if (jsonObject.has(FIRST_NAME_FIELD)) {
			this.firstName = jsonObject.getString(FIRST_NAME_FIELD);			
		}
		if (jsonObject.has(LAST_NAME_FIELD)) {
			this.lastName = jsonObject.getString(LAST_NAME_FIELD);			
		}
		
	}

	public Chat(int id, String type, String title, String username, String firstName, String lastName) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
