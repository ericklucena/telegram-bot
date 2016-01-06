package co.codehaven.telegram.entities.input;

import org.json.JSONObject;

public class Location {

	private static final String LONGITUDE_FIELD ="longitude";
	private double logitude;
	private static final String LATITUDE_FIELD ="latitude";
	private double latitude;
	
	public Location(JSONObject jsonObject) {
		this.logitude = jsonObject.getDouble(LONGITUDE_FIELD);
		this.latitude = jsonObject.getDouble(LATITUDE_FIELD);
	}
	
	public Location(float logitude, float latitude) {
		super();
		this.logitude = logitude;
		this.latitude = latitude;
	}

	public double getLogitude() {
		return logitude;
	}

	public void setLogitude(float logitude) {
		this.logitude = logitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}	
}
