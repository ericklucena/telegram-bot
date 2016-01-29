package co.codehaven.telegram.util;

public class Telegram {
	
	public static final String OK = "ok";
	public static final String RESULT = "result";
	public static final String MESSAGE = "message";
	public static final String INLINE_QUERY = "inline_query";

	public static final String WEBHOOK = Your.WEBHOOK;
	private static final String BOT_TOKEN = Your.BOT_TOKEN;
	
	private static final String TELEGRAM_BASE_URL = "https://api.telegram.org/";
	
	public static String botUrl() {
		return TELEGRAM_BASE_URL+"bot"+BOT_TOKEN+"/";
	}
}
