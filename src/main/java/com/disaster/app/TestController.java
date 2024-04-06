package com.disaster.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

@Controller
public class TestController {

	@RequestMapping( value = "/" , method = RequestMethod.GET) 
	public String test() throws Exception {

		URL url = new URL("http://apis.data.go.kr/1741000/DisasterMsg3/getDisasterMsg1List");
		HttpURLConnection connection =  (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Content-type","application/json");
		System.out.println(connection.getResponseCode());
		
	







		return "index";
	}
}
