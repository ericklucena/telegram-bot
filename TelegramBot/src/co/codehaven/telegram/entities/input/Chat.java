package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class Chat {
	
	public static final String ID_FIELD = "id";
	private String id;
	public static final String TYPE_FIELD = "type";
	private String type; 		// private | group | supergroup | channel
	public static final String TITLE_FIELD = "title";
	private String title;		// Optional
	public static final String USERNAME_FIELD = "username";
	private String username;	// Optional
	public static final String FIRST_NAME_FIELD = "first_name";
	private String firstName;	// Optional (only private chat)
	public static final String LAST_NAME_FIELD = "last_name";
	private String lastName;	// Optional (only private chat)
	
	public Chat(JSONObject jsonObject) {
		super();
		this.id = Integer.toString(jsonObject.getInt(ID_FIELD));
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

	public Chat(String id, String type, String title, String username, String firstName, String lastName) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
