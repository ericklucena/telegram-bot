package co.codehaven.telegram.entities;

public class UserProfilePhotos {

	private int totalCount;
	private PhotoSize[][] photos;

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
