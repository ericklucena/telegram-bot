package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {

	public static final String PHONE_NUMBER_FIELD = "phone_number";
	@JsonProperty(PHONE_NUMBER_FIELD)
	private String phoneNumber;
	public static final String FIRST_NAME_FIELD = "first_name";
	@JsonProperty(FIRST_NAME_FIELD)
	private String firstName;
	public static final String LAST_NAME_FIELD = "last_name";
	@JsonProperty(LAST_NAME_FIELD)
	private String lastName;	// Optional
	public static final String USER_ID_FIELD = "user_id";
	@JsonProperty(USER_ID_FIELD)
	private int userId;			// Optional

	public Contact(JSONObject jsonObject) {
		this.phoneNumber = jsonObject.getString(PHONE_NUMBER_FIELD);
		this.firstName = jsonObject.getString(FIRST_NAME_FIELD);
		if (jsonObject.has(LAST_NAME_FIELD)) {
			this.firstName = jsonObject.getString(LAST_NAME_FIELD);
		}
		if (jsonObject.has(USER_ID_FIELD)) {
			this.userId = jsonObject.getInt(USER_ID_FIELD);
		}
	}
	
	public Contact(String phoneNumber, String firstName, String lastName, int userId) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
