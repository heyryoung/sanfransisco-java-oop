package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberController {

	public static void main(String[] args) {


		MemberService service = new MemberService();
		MemberBean member =null;
		String [] arr = null;

		while(true) {

			switch (JOptionPane.showInputDialog("0.종료\n 1.회원가입 \n 2. 마이페이지 \n  3. 비번수정 \n  4. 회원탈퇴 \n 5. 회원목록 \n 6. 아이디검색\n")) {
			case "0": JOptionPane.showMessageDialog(null, "종료");  
			return;
			case "1": JOptionPane.showMessageDialog(null, "===========회원가입=============");
			// asdf,asdf,asdf,asdf,A,167.5,50.3
			arr = (JOptionPane.showInputDialog("이름, 아이디, 비번, 주민번호, 혈액형, 키, 몸무게")).split(",");
			member = new MemberBean();
			member.setUserName(arr[0]);
			member.setUserId(arr[1]);
			member.setUserPW(arr[2]);
			member.setUserBD(arr[3]);
			member.setUserBt(arr[4]);
			member.setHeight(Double.parseDouble(arr[5]));
			member.setWeight(Double.parseDouble(arr[6]));

			JOptionPane.showMessageDialog(null,service.join(member));

			break;
			case "2": JOptionPane.showMessageDialog(null, "===========정보보기============="); 
			int count = Integer.parseInt(JOptionPane.showInputDialog("회원번호를 입력하세요"));
			JOptionPane.showMessageDialog(null, service.getMypage(count));

			break;

			case "3": JOptionPane.showMessageDialog(null, "===========비번수정=============");  
			JOptionPane.showMessageDialog(null, service.update(member));
			break;

			case "4" : JOptionPane.showMessageDialog(null, "===========회원탈퇴===========");   
			JOptionPane.showMessageDialog(null, service.withdrawal(member));

			break;

			case "5" : JOptionPane.showMessageDialog(null, "===========회원목록===========");   
			JOptionPane.showMessageDialog(null, service.list());

			break;

			case "6" : JOptionPane.showMessageDialog(null, "===========아이디검색===========");  
			JOptionPane.showMessageDialog(null, service.findById(JOptionPane.showInputDialog("아이디를 입력하세요")));

			break;

	
			}
		}
	}
}
