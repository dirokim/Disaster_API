package com.disaster.app.disaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	FeignClientInterface feignClientInterface;

	public String testFeign() throws Exception {
		return feignClientInterface.testFeign();
	}
}
