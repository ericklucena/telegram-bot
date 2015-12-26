package co.codehaven.telegram.entities;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

	public static final String MESSAGE_ID_FIELD = "message_id";
	@JsonProperty(MESSAGE_ID_FIELD)
	private int messageId;
	public static final String FROM_FIELD = "from";
	@JsonProperty(FROM_FIELD)
	private User from;						// Optional
	public static final String DATE_FIELD = "date";
	@JsonProperty(DATE_FIELD)
	private int date;						// Unix time
	public static final String CHAT_FIELD = "chat";
	@JsonProperty(CHAT_FIELD)
	private Chat chat;
	public static final String FORWARD_FROM_FIELD = "forward_from";
	@JsonProperty(FORWARD_FROM_FIELD)
	private User forwardFrom;				// Optional
	public static final String FORWARD_DATE_FIELD = "forward_date";
	@JsonProperty(FORWARD_DATE_FIELD)
	private int forwardDate;				// Optional
	public static final String REPLY_TO_MESSAGE_FIELD = "reply_to_message";
	@JsonProperty(REPLY_TO_MESSAGE_FIELD)
	private Message replyToMessage;			// Optional
	public static final String TEXT_FIELD = "text";
	@JsonProperty(TEXT_FIELD)
	private String text;					// Optional
	public static final String AUDIO_FIELD = "audio";
	@JsonProperty(AUDIO_FIELD)
	private Audio audio;					// Optional
	public static final String DOCUMENT_FIELD = "document";
	@JsonProperty(DOCUMENT_FIELD)
	private Document document;				// Optional
	public static final String PHOTO_FIELD = "photo";
	@JsonProperty(PHOTO_FIELD)
	private PhotoSize[] photo;			// Optional
	public static final String STICKER_FIELD = "sticker";
	@JsonProperty(STICKER_FIELD)
	private Sticker sticker;				// Optional
	public static final String VIDEO_FIELD = "video";
	@JsonProperty(VIDEO_FIELD)
	private Video video;					// Optional
	public static final String VOICE_FIELD = "voice";
	@JsonProperty(VOICE_FIELD)
	private Voice voice;					// Optional
	public static final String CAPTION_FIELD = "caption";
	@JsonProperty(CAPTION_FIELD)
	private String caption;					// Optional
	public static final String CONTACT_FIELD = "contact";
	@JsonProperty(CONTACT_FIELD)
	private Contact contact;				// Optional
	public static final String LOCATION_FIELD = "location";
	@JsonProperty(LOCATION_FIELD)
	private Location location;				// Optional
	public static final String NEW_CHAT_PARTICIPANT_FIELD = "new_chat_participant";
	@JsonProperty(NEW_CHAT_PARTICIPANT_FIELD)
	private User newChatParticipant;		// Optional
	public static final String LEFT_CHAT_PARTICIPANT_FIELD = "left_chat_participant";
	@JsonProperty(LEFT_CHAT_PARTICIPANT_FIELD)
	private User leftChatParticipant;		// Optional
	public static final String NEW_CHAT_TITLE_FIELD = "new_chat_title";
	@JsonProperty(NEW_CHAT_TITLE_FIELD)
	private String newChatTitle;			// Optional
	public static final String NEW_CHAT_PHOTO_FIELD = "new_chat_photo";
	@JsonProperty(NEW_CHAT_PHOTO_FIELD)
	private PhotoSize[] newChatPhoto;		// Optional
	public static final String DELETE_CHAT_PHOTO_FIELD = "delete_chat_photo";
	@JsonProperty(DELETE_CHAT_PHOTO_FIELD)
	private boolean deleteChatPhoto;		// Optional
	public static final String GROUP_CHAT_CREATED_FIELD = "group_chat_created";
	@JsonProperty(GROUP_CHAT_CREATED_FIELD)
	private boolean groupChatCreated;		// Optional
	public static final String SUPERGROUP_CHAT_CREATED_FIELD = "supergroup_chat_created";
	@JsonProperty(SUPERGROUP_CHAT_CREATED_FIELD)
	private boolean supergroupChatCreated;	// Optional
	public static final String CHANNEL_CHAT_CREATED_FIELD = "channel_chat_created";
	@JsonProperty(CHANNEL_CHAT_CREATED_FIELD)
	private boolean channelChatCreated;		// Optional
	public static final String MIGRATED_TO_CHAT_ID_FIELD = "migrated_to_chat_id";
	@JsonProperty(MIGRATED_TO_CHAT_ID_FIELD)
	private int migratedToChatId;			// Optional
	public static final String MIGRATED_FROM_CHAT_ID_FIELD = "migrated_from_chat_id";
	@JsonProperty(MIGRATED_FROM_CHAT_ID_FIELD)
	private int migratedFromChatId;			// Optional
	
	public Message(JSONObject jsonObject) {
        super();
        this.messageId = jsonObject.getInt(MESSAGE_ID_FIELD);
        this.from = new User(jsonObject.getJSONObject(FROM_FIELD));
        this.date = jsonObject.getInt(DATE_FIELD);
        this.chat = new Chat(jsonObject.getJSONObject(CHAT_FIELD));
        if (jsonObject.has(FORWARD_FROM_FIELD)) {
            this.forwardFrom = new User(jsonObject.getJSONObject(FORWARD_FROM_FIELD));
        }
        if (jsonObject.has(FORWARD_DATE_FIELD)) {
            this.forwardDate = jsonObject.getInt(FORWARD_DATE_FIELD);
        }
        if (jsonObject.has(REPLY_TO_MESSAGE_FIELD)) {
        	this.replyToMessage = new Message(jsonObject.getJSONObject(REPLY_TO_MESSAGE_FIELD));
        }
        if (jsonObject.has(TEXT_FIELD)) {
            this.text = jsonObject.getString(TEXT_FIELD);
        }
        if (jsonObject.has(AUDIO_FIELD)) {
            this.audio = new Audio(jsonObject.getJSONObject(AUDIO_FIELD));
        }
        if (jsonObject.has(DOCUMENT_FIELD)) {
            this.document = new Document(jsonObject.getJSONObject(DOCUMENT_FIELD));
        }
        if (jsonObject.has(PHOTO_FIELD)) {
        	JSONArray photos = jsonObject.getJSONArray(PHOTO_FIELD);
            this.photo = new PhotoSize[photos.length()];
            for (int i = 0; i < photos.length(); i++) {
                this.photo[i] = new PhotoSize(photos.getJSONObject(i));
            }
        }
        if (jsonObject.has(STICKER_FIELD)) {
            this.sticker = new Sticker(jsonObject.getJSONObject(STICKER_FIELD));
        }
        if (jsonObject.has(VIDEO_FIELD)) {
            this.video = new Video(jsonObject.getJSONObject(VIDEO_FIELD));
        }
        if (jsonObject.has(VOICE_FIELD)) {
        	this.voice = new Voice(jsonObject.getJSONObject(VOICE_FIELD));
        }
        if (jsonObject.has(CAPTION_FIELD)) {
        	this.caption = jsonObject.getString(CAPTION_FIELD);
        }
        if (jsonObject.has(CONTACT_FIELD)) {
            this.contact = new Contact(jsonObject.getJSONObject(CONTACT_FIELD));
        }
        if (jsonObject.has(LOCATION_FIELD)) {
            this.location = new Location(jsonObject.getJSONObject(LOCATION_FIELD));
        }
        if (jsonObject.has(NEW_CHAT_PARTICIPANT_FIELD)) {
            this.newChatParticipant = new User(jsonObject.getJSONObject(NEW_CHAT_PARTICIPANT_FIELD));
        }
        if (jsonObject.has(LEFT_CHAT_PARTICIPANT_FIELD)) {
            this.leftChatParticipant = new User(jsonObject.getJSONObject(LEFT_CHAT_PARTICIPANT_FIELD));
        }
        if (jsonObject.has(NEW_CHAT_TITLE_FIELD)) {
        	this.newChatTitle = jsonObject.getString(NEW_CHAT_TITLE_FIELD);
        }
        if (jsonObject.has(NEW_CHAT_PHOTO_FIELD)) {
        	JSONArray photoArray = jsonObject.getJSONArray(NEW_CHAT_PHOTO_FIELD);
            this.newChatPhoto = new PhotoSize[photoArray.length()];
            for (int i = 0; i < photoArray.length(); i++) {
                this.newChatPhoto[i] = new PhotoSize(photoArray.getJSONObject(i));
            }
        }
        if (jsonObject.has(DELETE_CHAT_PHOTO_FIELD)) {
            this.deleteChatPhoto = jsonObject.getBoolean(DELETE_CHAT_PHOTO_FIELD);
        }
        if (jsonObject.has(GROUP_CHAT_CREATED_FIELD)) {
            this.groupChatCreated = jsonObject.getBoolean(GROUP_CHAT_CREATED_FIELD);
        }
        if (jsonObject.has(SUPERGROUP_CHAT_CREATED_FIELD)) {
            this.groupChatCreated = jsonObject.getBoolean(SUPERGROUP_CHAT_CREATED_FIELD);
        }
        if (jsonObject.has(CHANNEL_CHAT_CREATED_FIELD)) {
            this.groupChatCreated = jsonObject.getBoolean(CHANNEL_CHAT_CREATED_FIELD);
        }
        if (jsonObject.has(MIGRATED_TO_CHAT_ID_FIELD)) {
        	this.migratedToChatId = jsonObject.getInt(MIGRATED_TO_CHAT_ID_FIELD);
        }
        if (jsonObject.has(MIGRATED_FROM_CHAT_ID_FIELD)) {
        	this.migratedFromChatId = jsonObject.getInt(MIGRATED_FROM_CHAT_ID_FIELD);
        }
    }
	
	public Message(int messageId, User from, int date, Chat chat, User forwardFrom, int forwardDate,
			Message replyToMessage, String text, Audio audio, Document document, PhotoSize[] photo, Sticker sticker,
			Video video, Voice voice, String caption, Contact contact, Location location, User newChatParticipant,
			User leftChatParticipant, String newChatTitle, PhotoSize[] newChatPhoto, boolean deleteChatPhoto,
			boolean groupChatCreated, boolean supergroupChatCreated, boolean channelChatCreated, int migratedToChatId,
			int migratedFromChatId) {
		super();
		this.messageId = messageId;
		this.from = from;
		this.date = date;
		this.chat = chat;
		this.forwardFrom = forwardFrom;
		this.forwardDate = forwardDate;
		this.replyToMessage = replyToMessage;
		this.text = text;
		this.audio = audio;
		this.document = document;
		this.photo = photo;
		this.sticker = sticker;
		this.video = video;
		this.voice = voice;
		this.caption = caption;
		this.contact = contact;
		this.location = location;
		this.newChatParticipant = newChatParticipant;
		this.leftChatParticipant = leftChatParticipant;
		this.newChatTitle = newChatTitle;
		this.newChatPhoto = newChatPhoto;
		this.deleteChatPhoto = deleteChatPhoto;
		this.groupChatCreated = groupChatCreated;
		this.supergroupChatCreated = supergroupChatCreated;
		this.channelChatCreated = channelChatCreated;
		this.migratedToChatId = migratedToChatId;
		this.migratedFromChatId = migratedFromChatId;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getForwardFrom() {
		return forwardFrom;
	}

	public void setForwardFrom(User forwardFrom) {
		this.forwardFrom = forwardFrom;
	}

	public int getForwardDate() {
		return forwardDate;
	}

	public void setForwardDate(int forwardDate) {
		this.forwardDate = forwardDate;
	}

	public Message getReplyToMessage() {
		return replyToMessage;
	}

	public void setReplyToMessage(Message replyToMessage) {
		this.replyToMessage = replyToMessage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public PhotoSize[] getPhoto() {
		return photo;
	}

	public void setPhoto(PhotoSize[] photo) {
		this.photo = photo;
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public User getNewChatParticipant() {
		return newChatParticipant;
	}

	public void setNewChatParticipant(User newChatParticipant) {
		this.newChatParticipant = newChatParticipant;
	}

	public User getLeftChatParticipant() {
		return leftChatParticipant;
	}

	public void setLeftChatParticipant(User leftChatParticipant) {
		this.leftChatParticipant = leftChatParticipant;
	}

	public String getNewChatTitle() {
		return newChatTitle;
	}

	public void setNewChatTitle(String newChatTitle) {
		this.newChatTitle = newChatTitle;
	}

	public PhotoSize[] getNewChatPhoto() {
		return newChatPhoto;
	}

	public void setNewChatPhoto(PhotoSize[] newChatPhoto) {
		this.newChatPhoto = newChatPhoto;
	}

	public boolean isDeleteChatPhoto() {
		return deleteChatPhoto;
	}

	public void setDeleteChatPhoto(boolean deleteChatPhoto) {
		this.deleteChatPhoto = deleteChatPhoto;
	}

	public boolean isGroupChatCreated() {
		return groupChatCreated;
	}

	public void setGroupChatCreated(boolean groupChatCreated) {
		this.groupChatCreated = groupChatCreated;
	}

	public boolean isSupergroupChatCreated() {
		return supergroupChatCreated;
	}

	public void setSupergroupChatCreated(boolean supergroupChatCreated) {
		this.supergroupChatCreated = supergroupChatCreated;
	}

	public boolean isChannelChatCreated() {
		return channelChatCreated;
	}

	public void setChannelChatCreated(boolean channelChatCreated) {
		this.channelChatCreated = channelChatCreated;
	}

	public int getMigratedToChatId() {
		return migratedToChatId;
	}

	public void setMigratedToChatId(int migratedToChatId) {
		this.migratedToChatId = migratedToChatId;
	}

	public int getMigratedFromChatId() {
		return migratedFromChatId;
	}

	public void setMigratedFromChatId(int migratedFromChatId) {
		this.migratedFromChatId = migratedFromChatId;
	}

}
