package co.codehaven.telegram.servlets;

import java.io.IOException;
import javax.servlet.http.*;

import org.json.JSONObject;

import co.codehaven.telegram.entities.output.GetUpdates;
import co.codehaven.telegram.entities.output.SetWebHook;
import co.codehaven.telegram.handlers.TelegramHandler;
import co.codehaven.telegram.util.Network;
import co.codehaven.telegram.util.Telegram;

@SuppressWarnings("serial")
public class SetupTelegramBotWebhook extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		SetWebHook setWebhook = new SetWebHook(Telegram.WEBHOOK, null);
		Network.executeTelegramMethod(setWebhook);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Bot status: ready");
	}
}
