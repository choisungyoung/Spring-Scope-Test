package com.example.threadtest.service.impl;

import org.springframework.stereotype.Service;

import com.example.threadtest.service.SessionService;
import com.example.threadtest.vo.Session;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SessionServiceImpl implements SessionService {

	private Session session;
	
	@Override
	public Session getSession() {
		if (session == null) {
			session = new Session("init");	
			log.info(">>> init session : {}", session);
		}
		else {
			log.info(">>> exist session : {}", session);
		}
		
		return session;
	}
	
}
