package com.cluster.limit.LimitApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@Autowired
	private LimitService limitService;
	
	@RequestMapping("/limitvalue")
	public LimitTo retrievLimits() {
		
		LimitTo limit = new LimitTo(1,10);
		return limit;
	}
	LimitTo limit = new LimitTo(1,10);
	
	@RequestMapping("/limits")
	public LimitTo retrievLimitService() {
		
		LimitTo limitTo = new LimitTo(limitService.getMinimum(),limitService.getMaximum());
		return limitTo;
	}
	
}
