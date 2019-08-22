package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.ScheduleBean;
import com.bitcamp.services.ScheduleService;

public class ScheduleController {

	public static void main(String[] args) {

		ScheduleBean schBean = new ScheduleBean();
		ScheduleService schService = new ScheduleService();

		while(true) {

			JOptionPane.showMessageDialog(null, "===========MyCalendar=============");
			switch (JOptionPane.showInputDialog("1. LeapYear  2. MonthEndDay ")) {
			case "0": JOptionPane.showMessageDialog(null, "=============종료===========");  
					return;
					
			case "1": JOptionPane.showMessageDialog(null, "===========LeapYear=============");
					schBean.setYear(Integer.parseInt((JOptionPane.showInputDialog("윤년을 판단할 연도를 입력하세요 :   "))));   
					JOptionPane.showMessageDialog(null, schService.leapYear(schBean) );
					break;

			case "2": JOptionPane.showMessageDialog(null, "===========MonthEndDay=============");
					schBean.setMonth(Integer.parseInt((JOptionPane.showInputDialog("마지막 날을 확인하고 싶은 달을 입력하세요  :   "))));   
					JOptionPane.showMessageDialog(null, schService.monthEndDay(schBean) );
					break;
			}
		}//while
	}

}
