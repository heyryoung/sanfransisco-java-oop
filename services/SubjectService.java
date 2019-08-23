package com.bitcamp.services;

import com.bitcamp.domains.SubjectBean;

public class SubjectService {
	
	private SubjectBean[] subjects;
	private int count;
	
	public SubjectService() {
		subjects = new SubjectBean[2];
		count =0;
	}
	
	public String getTotal(SubjectBean grade) {
		String result = "";
		
		grade.setTotal((grade.getEng() + grade.getKor() + grade.getMath()));
		
		result = String.format("총점은 %.2f입니다" ,grade.getTotal());
		
		return result;
	}
	
	public String getAvg(SubjectBean grade) {
		String result = "";
		grade.setAvg((grade.getTotal()/3));
		
		result = String.format("총점은 %.2f입니다" ,grade.getAvg());
		
		return result;
		
	}
	
	
	

}
