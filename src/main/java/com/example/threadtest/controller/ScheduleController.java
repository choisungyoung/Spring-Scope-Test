package com.example.threadtest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.threadtest.service.CDNCommonService;
import com.example.threadtest.service.ScheduleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService scheduleService;

    @GetMapping(value = "/getEpgSchedulePerCP")
	public @ResponseBody String  getEpgSchedulePerCP(@RequestParam Map<String, String> params) {
    	
    	scheduleService.pulishSchedule();
    	
    	log.info(">>> END Controller============ {}", this);
    	return null;
    }
	
}
