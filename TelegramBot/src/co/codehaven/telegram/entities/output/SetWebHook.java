package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class SetWebHook implements ITelegramApiMethod{
	
	private static final String PATH = "setWebhook";
	
	public static final String URL_FIELD = "url";
	private String url;
	public static final String CERTIFICATE_FIELD = "certificate";
	private String certificate;

	public SetWebHook(String url, String certificate) {
		super();
		this.url = url;
		this.certificate = certificate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public JSONObject toJson() {
		JSONObject json= new JSONObject();
		if (this.url != null) {
			json.put(URL_FIELD, this.url);			
		}
		if (this.certificate != null) {
			json.put(CERTIFICATE_FIELD, this.certificate);
		}
		return json;
	}
	
	@Override
	public String getMethodUrl() {
		return Telegram.botUrl()+PATH;
	}

}
