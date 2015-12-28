package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class User {
	
	public static final String ID_FIELD = "id";
	private int id;
	public static final String FIRST_NAME_FIELD = "first_name";
	private String firstName;
	public static final String LAST_NAME_FIELD = "last_name";
	private String lastname;	// Optional
	public static final String USERNAME_FIELD = "username";
	private String username;	// Optional
	
	public User(JSONObject jsonObject) {
		this.id = jsonObject.getInt(ID_FIELD);
		this.firstName = jsonObject.getString(FIRST_NAME_FIELD);
		if (jsonObject.has(LAST_NAME_FIELD)) {
			this.lastname = jsonObject.getString(LAST_NAME_FIELD);
		}
		if (jsonObject.has(USERNAME_FIELD)) {
			this.username = jsonObject.getString(USERNAME_FIELD);
		}
	}
	
	public User(int id, String firstName, String lastname, String username) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", username=" + username
				+ "]";
	}
	
}
