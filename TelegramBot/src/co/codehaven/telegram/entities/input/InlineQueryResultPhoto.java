package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.InlineQueryResult;

public class InlineQueryResultPhoto implements InlineQueryResult {

	private static final String ENTITY_TYPE = "photo";

	private static final String TYPE_FIELD = "type";
	private String type; // Type of the result, must be article
	private static final String ID_FIELD = "id";
	private String id; // Unique identifier for this result, 1-64 Bytes
	private static final String PHOTO_URL_FIELD = "photo_url";
	private String photoUrl; // Optional
	private static final String PHOTO_WIDTH_FIELD = "photo_width";
	private Integer photoWidth; // Optional
	private static final String PHOTO_HEIGHT_FIELD = "photo_height";
	private Integer photoHeight; // Optional
	private static final String THUMB_URL_FIELD = "thumb_url";
	private String thumbUrl;
	private static final String TITLE_FIELD = "title";
	private String title; // Optional
	private static final String DESCRIPTION_FIELD = "description";
	private String description; // Optional. Short description of the result
	private static final String CAPTION_FIELD = "caption";
	private String caption; // Optional. Short description of the result
	private static final String MESSAGE_TEXT_FIELD = "message_text";
	private String messageText; // Optional
	private static final String PARSE_MODE_FIELD = "parse_mode";
	private String parseMode; // Optional. Markdown | HTML
	private static final String DISABLE_WEB_PAGE_PREVIEW_FIELD = "disable_web_page_preview";
	private Boolean disableWebPagePreview; // Optional

	public InlineQueryResultPhoto(JSONObject jsonObject) {
		this.type = jsonObject.getString(TYPE_FIELD);
		this.id = jsonObject.getString(ID_FIELD);
		this.photoUrl = jsonObject.getString(PHOTO_URL_FIELD);
		if (jsonObject.has(PHOTO_WIDTH_FIELD)) {
			this.photoWidth = jsonObject.getInt(PHOTO_WIDTH_FIELD);
		}
		if (jsonObject.has(PHOTO_HEIGHT_FIELD)) {
			this.photoHeight = jsonObject.getInt(PHOTO_HEIGHT_FIELD);
		}
		if (jsonObject.has(THUMB_URL_FIELD)) {
			this.thumbUrl = jsonObject.getString(THUMB_URL_FIELD);
		}
		if (jsonObject.has(TITLE_FIELD)) {
			this.title = jsonObject.getString(TITLE_FIELD);
		}
		if (jsonObject.has(DESCRIPTION_FIELD)) {
			this.description = jsonObject.getString(DESCRIPTION_FIELD);
		}
		if (jsonObject.has(CAPTION_FIELD)) {
			this.caption = jsonObject.getString(CAPTION_FIELD);
		}
		if (jsonObject.has(MESSAGE_TEXT_FIELD)) {
			this.messageText = jsonObject.getString(MESSAGE_TEXT_FIELD);
		}
		if (jsonObject.has(PARSE_MODE_FIELD)) {
			this.parseMode = jsonObject.getString(PARSE_MODE_FIELD);
		}
		if (jsonObject.has(DISABLE_WEB_PAGE_PREVIEW_FIELD)) {
			this.disableWebPagePreview = jsonObject.getBoolean(DISABLE_WEB_PAGE_PREVIEW_FIELD);
		}
	}

	public InlineQueryResultPhoto(String id, String photoUrl) {
		super();
		this.type = ENTITY_TYPE;
		this.id = id;
		this.photoUrl = photoUrl;
		this.thumbUrl = photoUrl;
	}
	
	public InlineQueryResultPhoto(String id, String photoUrl, String thumbUrl) {
		super();
		this.type = ENTITY_TYPE;
		this.id = id;
		this.photoUrl = photoUrl;
		this.thumbUrl = thumbUrl;
	}
	
	public JSONObject toJson() {
		JSONObject jsonObject = new JSONObject();
		
		if (type != null) {
			jsonObject.put(TYPE_FIELD, type);
		}
		if (id != null) {
			jsonObject.put(ID_FIELD, id);
		}
		if (photoUrl != null) {
			jsonObject.put(PHOTO_URL_FIELD, photoUrl);
		}
		if (photoWidth != null) {
			jsonObject.put(PHOTO_WIDTH_FIELD, photoWidth);
		}
		if (photoHeight != null) {
			jsonObject.put(PHOTO_HEIGHT_FIELD, photoHeight);
		}
		if (thumbUrl != null) {
			jsonObject.put(THUMB_URL_FIELD, thumbUrl);
		}
		if (title != null) {
			jsonObject.put(TITLE_FIELD, title);
		}
		if (description != null) {
			jsonObject.put(DESCRIPTION_FIELD, description);
		}
		if (caption != null) {
			jsonObject.put(CAPTION_FIELD, caption);
		}
		if (messageText != null) {
			jsonObject.put(MESSAGE_TEXT_FIELD, messageText);
		}
		if (parseMode != null) {
			jsonObject.put(PARSE_MODE_FIELD, parseMode);
		}
		if (disableWebPagePreview != null) {
			jsonObject.put(DISABLE_WEB_PAGE_PREVIEW_FIELD, disableWebPagePreview);
		}
		
		return jsonObject;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Integer getPhotoWidth() {
		return photoWidth;
	}

	public void setPhotoWidth(Integer photoWidth) {
		this.photoWidth = photoWidth;
	}

	public Integer getPhotoHeight() {
		return photoHeight;
	}

	public void setPhotoHeight(Integer photoHeight) {
		this.photoHeight = photoHeight;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getParseMode() {
		return parseMode;
	}

	public void setParseMode(String parseMode) {
		this.parseMode = parseMode;
	}

	public Boolean getDisableWebPagePreview() {
		return disableWebPagePreview;
	}

	public void setDisableWebPagePreview(Boolean disableWebPagePreview) {
		this.disableWebPagePreview = disableWebPagePreview;
	}

}
