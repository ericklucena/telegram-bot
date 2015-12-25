package co.codehaven.telegram.entities;

public class Message {
	
	private int messageId;
	private User from;						// Optional
	private int date;						// Unix time
	private Chat chat;
	private User forwardFrom;				// Optional
	private int forwardDate;				// Optional
	private Message replyToMessage;			// Optional
	private String text;					// Optional
	private Audio audio;					// Optional
	private Document document;				// Optional
	private PhotoSize[][] photo;			// Optional
	private Sticker sticker;				// Optional
	private Video video;					// Optional
	private Voice voice;					// Optional
	private String caption;					// Optional
	private Contact contact;				// Optional
	private Location location;				// Optional
	private User newChatParticipant;		// Optional
	private User leftChatParticipant;		// Optional
	private String newChatTitle;			// Optional
	private PhotoSize[] newChatPhoto;		// Optional
	private boolean deleteChatPhoto;		// Optional
	private boolean groupChatCreated;		// Optional
	private boolean supergroupChatCreated;	// Optional
	private boolean channelChatCreated;		// Optional
	private int migratedToChatId;			// Optional
	private int migratedFromChatId;			// Optional
	
	public Message(int messageId, User from, int date, Chat chat, User forwardFrom, int forwardDate,
			Message replyToMessage, String text, Audio audio, Document document, PhotoSize[][] photo, Sticker sticker,
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

	public PhotoSize[][] getPhoto() {
		return photo;
	}

	public void setPhoto(PhotoSize[][] photo) {
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
