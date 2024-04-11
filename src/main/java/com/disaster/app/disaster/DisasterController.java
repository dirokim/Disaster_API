package com.disaster.app.disaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DisasterController {
	 
	private TestService testService;
	
	public DisasterController(TestService testService)  {
		this.testService = testService;
	}
	
	
	
	@GetMapping("/")
	public String main() throws Exception {
		return testService.testFeign();
	}
	
	@GetMapping("/testfeign")
	public String testFeign() {
		return "hello feign client";
				
	}
	
}
