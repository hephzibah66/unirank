package com.stn.unirank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stn.unirank.dao.KoreaUniversityMapper;
import com.stn.unirank.dto.KoreaUniversityDto;

@Service
public class KoreaUniversityService {
	
	@Autowired
	private KoreaUniversityMapper mapper;

	public List<KoreaUniversityDto> selectKoreaUniversityList() {
		return mapper.selectKoreaUniversityList();
	}
}
