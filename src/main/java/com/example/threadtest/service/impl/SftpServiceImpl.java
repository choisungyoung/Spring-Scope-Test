package com.example.threadtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.example.threadtest.service.SessionService;
import com.example.threadtest.service.SftpService;
import com.example.threadtest.vo.Channel;
import com.example.threadtest.vo.Session;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service @Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SftpServiceImpl implements SftpService {
	
	@Autowired
	private SessionService sessionService;
	private Channel channel;

	@Override
	public void init() {
		Session session = sessionService.getSession();
		
		if (channel == null) {
			channel = new Channel("init");
			log.info(">>> init channel : {}", channel);
		}
		else {
			log.info(">>> exist channel : {}", channel);
		}

    	log.info(">>> END SftpService init============ {}", this);
		
	}

	@Override
	public void upload() {
		// TODO Auto-generated method stub
		
	}

	
}
