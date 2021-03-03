package com.stn.unirank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stn.unirank.dto.KoreaUniversityDto;
import com.stn.unirank.service.KoreaUniversityService;

@RestController
public class KoreaUniversityController {
	
	@Autowired
	private KoreaUniversityService service;
	
	@RequestMapping("/kunilist")
	public List<KoreaUniversityDto> users() throws Exception { 
		final List<KoreaUniversityDto> userList = service.selectKoreaUniversityList();
		return userList;
	}

}
