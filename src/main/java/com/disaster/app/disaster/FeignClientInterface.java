package com.disaster.app.disaster;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feign", url = "http://localhost:8080")
public interface FeignClientInterface {
	
	@GetMapping("/testfeign")
	String testFeign();
	
	
	
	
	

}
