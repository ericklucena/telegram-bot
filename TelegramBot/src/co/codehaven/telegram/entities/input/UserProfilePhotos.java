package co.codehaven.telegram.entities.input;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserProfilePhotos {
	
	private static final String TOTAL_COUNT_FIELD ="total_count";
	private int totalCount;
	private static final String PHOTOS_FIELD ="photos";
	private PhotoSize[][] photos;
	
	public UserProfilePhotos(JSONObject jsonObject) {
		this.totalCount = jsonObject.getInt(TOTAL_COUNT_FIELD);
		
		JSONArray photos = jsonObject.getJSONArray(PHOTOS_FIELD);
		this.photos = new PhotoSize[photos.length()][];
        for (int i=0; i< photos.length(); i++) {
            JSONArray photosRow = photos.getJSONArray(i);
            this.photos[i] = new PhotoSize[photosRow.length()];
            for (int j=0; j < photosRow.length(); j++) {
                this.photos[i][j] = new PhotoSize(photosRow.getJSONObject(j));
            }
        }
	}

	public UserProfilePhotos(int totalCount, PhotoSize[][] photos) {
		super();
		this.totalCount = totalCount;
		this.photos = photos;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public PhotoSize[][] getPhotos() {
		return photos;
	}

	public void setPhotos(PhotoSize[][] photos) {
		this.photos = photos;
	}

}
