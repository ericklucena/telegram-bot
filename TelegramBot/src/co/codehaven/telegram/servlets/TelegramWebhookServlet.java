package co.codehaven.telegram.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.http.*;

import org.json.JSONObject;

import co.codehaven.telegram.handlers.TelegramHandler;

@SuppressWarnings("serial")
public class TelegramWebhookServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = req.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);				
			}
		} catch (Exception e) {
			
		}
		
		System.out.println("TEST: "+ jb.toString());

		JSONObject jsonObject = new JSONObject(jb.toString());
		
		if (jsonObject.has("ok") && jsonObject.getBoolean("ok")) {
			TelegramHandler.resultObjectHandler(jsonObject);
		}		

		resp.setContentType("text/plain");
		resp.getWriter().println(jb.toString());
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = req.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);				
			}
		} catch (Exception e) {
			
		}
		
		JSONObject jsonObject = new JSONObject(jb.toString());
		
//		if (jsonObject.has("ok") && jsonObject.getBoolean("ok")) {
//			TelegramHandler.ResultHandler(jsonObject);
//		}
		
		TelegramHandler.updateObjectHandler(jsonObject);

		resp.setContentType("text/plain");
		resp.getWriter().println(jb.toString());
	}
}
