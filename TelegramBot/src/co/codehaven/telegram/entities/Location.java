package co.codehaven.telegram.entities;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	public static final String LONGITUDE_FIELD ="longitude";
	@JsonProperty(LONGITUDE_FIELD)
	private double logitude;
	public static final String LATITUDE_FIELD ="latitude";
	@JsonProperty(LATITUDE_FIELD)
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
