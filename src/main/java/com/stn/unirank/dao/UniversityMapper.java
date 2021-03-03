package com.stn.unirank.dao;

import java.util.List;

import com.stn.unirank.dto.UniversityDto;

public interface UniversityMapper {
	
	public void insertUniversity();
	
	public void updateUniversity();
	
	public void deleteUniversity(int id);
	
	public UniversityDto selectOneUniversity(int id);
	
	public List<UniversityDto> selectAllUniversityList();

}
