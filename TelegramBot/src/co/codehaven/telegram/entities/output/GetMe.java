package co.codehaven.telegram.entities.output;

import org.json.JSONObject;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;
import co.codehaven.telegram.util.Telegram;

public class GetMe implements ITelegramApiMethod{
	
	private static final String PATH = "getMe";
	
	@Override
	public JSONObject toJson() {
		return null;
	}

	@Override
	public String getMethodUrl() {
		return Telegram.botUrl()+PATH;
	}
	
}
