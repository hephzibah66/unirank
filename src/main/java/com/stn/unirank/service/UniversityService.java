package com.stn.unirank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stn.unirank.dao.UniversityMapper;
import com.stn.unirank.dto.UniversityDto;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityMapper universityMapper;

	public List<UniversityDto> selectAllUniversityList() {
		return universityMapper.selectAllUniversityList();
	}
}
