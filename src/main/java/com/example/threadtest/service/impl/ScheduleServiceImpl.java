package com.example.threadtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.threadtest.service.CDNCommonService;
import com.example.threadtest.service.ScheduleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	private CDNCommonService cdnCommonService;
	
	@Override
	public void pulishSchedule() {
		cdnCommonService.uploadCDN();
    	log.info(">>> END ScheduleService============ {}", this);
	}

}
