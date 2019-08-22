package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.SubjectBean;
import com.bitcamp.services.SubjectService;

public class SubjectController {

	public static void main(String[] args) {
		SubjectBean  subjectBean = new SubjectBean();
		SubjectService ss = new SubjectService();

		while(true) {

			switch (JOptionPane.showInputDialog("0. 종료 1. 점수 입력  2. 총점 3. 평균 ")) {
			case "0": JOptionPane.showMessageDialog(null, "=============종료===========");  return;
			case "1": JOptionPane.showMessageDialog(null, "===========점수입력=============");
					subjectBean.setKor(Integer.parseInt((JOptionPane.showInputDialog("국어점수를 입력하세요  :   "))));   
					subjectBean.setEng(Integer.parseInt((JOptionPane.showInputDialog("영어점수를 입력하세요  :   "))));   
					subjectBean.setMath(Integer.parseInt((JOptionPane.showInputDialog("수학점수를 입력하세요  :   "))));   
					JOptionPane.showMessageDialog(null, subjectBean.toString() );
					break;

			case "2": JOptionPane.showMessageDialog(null, "===========총점=============");
					JOptionPane.showMessageDialog(null, ss.getTotal(subjectBean) );
					break;
					
			case "3": JOptionPane.showMessageDialog(null, "===========평균=============");
					JOptionPane.showMessageDialog(null, ss.getAvg(subjectBean));
					break;
					
			}
		}//while
	}

}
