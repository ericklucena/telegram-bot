package co.codehaven.telegram.entities;

public class Location {

	private float logitude;
	private float latitude;
	
	public Location(float logitude, float latitude) {
		super();
		this.logitude = logitude;
		this.latitude = latitude;
	}

	public float getLogitude() {
		return logitude;
	}

	public void setLogitude(float logitude) {
		this.logitude = logitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}	
}
