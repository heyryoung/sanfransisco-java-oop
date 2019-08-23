package com.bitcamp.services;

import com.bitcamp.domains.ScheduleBean;

public class ScheduleService {
	private ScheduleBean[] schedules;
	private int count;
	
	public ScheduleService() {
		schedules = new ScheduleBean[2];
		int count = 0;
		
	}
	
	
	
	public String leapYear(ScheduleBean schBean) {
		String result = "";

		int year = schBean.getYear();

		result = String.format("%d는 %s입니다", year ,((year % 4==0 && year %100 !=0) || (year % 400 ==0) ? "윤년" : "평년"));

		return result;
	}

	public String monthEndDay(ScheduleBean schBean) {
		String result="";

		int month = schBean.getMonth();
		int days = 0;

		if(month ==2) {
			days = 29;
		}else if(month<7) {
			if(month%2==1) {
				days = 31;
			}else {
				days = 30;
			}
		}else {
			if(month%2==1) {
				days = 30;
			}else {
				days = 31;
			}
		}

		result = String.format("입력하신 %d월의 말일은 %d입니다.", month, days);

		return result;

	}
}
