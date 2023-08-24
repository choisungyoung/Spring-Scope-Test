package com.example.threadtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.threadtest.service.CDNCommonService;
import com.example.threadtest.service.SftpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CDNCommonServiceImpl implements CDNCommonService {

	@Autowired
	private SftpService sftpService;
	
	@Override
	public void uploadCDN() {
		sftpService.init();
		sftpService.upload();
    	log.info(">>> END sftpService============ {}", this);
	}

}
