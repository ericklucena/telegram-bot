package co.codehaven.telegram.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import co.codehaven.telegram.entities.interfaces.ITelegramApiMethod;

public class Network {
	
	public static String executeTelegramMethod(ITelegramApiMethod method) {
		HttpURLConnection connection = null;
		try {
			// Create connection
			URL url = new URL(method.getMethodUrl());
			String json = method.toJson().toString();
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			
			connection.setRequestProperty("Content-Length", Integer.toString(json.length()));

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(wr, "UTF-8"));
			writer.write(json);
			writer.close();
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder(); 
			
			String line;
			while ((line = reader.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			reader.close();
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
}
