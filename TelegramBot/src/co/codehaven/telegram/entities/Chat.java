package co.codehaven.telegram.entities;

public class Chat {
	
	private int id;
	private String type; 		// private | group | supergroup | channel
	private String title;		// Optional
	private String username;	// Optional
	private String firstName;	// Optional (only private chat)
	private String lastName;	// Optional (only private chat)
	
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
