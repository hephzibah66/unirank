package com.stn.unirank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stn.unirank.dto.UniversityDto;
import com.stn.unirank.service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService universityService;
	
	@RequestMapping("/unilist")
	public List<UniversityDto> users() throws Exception { 
		final List<UniversityDto> userList = universityService.selectAllUniversityList();
		return userList;
	}

}
