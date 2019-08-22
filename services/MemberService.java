package com.bitcamp.services;


import com.bitcamp.domains.MemberBean;
/*
1. 회원가입
2. 정보보기
3. 회원수정
4. 회원탈퇴
*/

public class MemberService {

	private MemberBean[] members = null;
	private int count;
	
	public MemberService() {
		 members = new MemberBean[2];
		 count =0;
	}
	
	/*
	1. 회원가입
	*/
	public String join(MemberBean member) {
		String msg="회원가입에 성공하였습니다. ";
		members[count] = member;
		count++;
		return msg;
	}
	
	
	public String getMypage(int count) {
		String msg=String.format("회원정보 \n"
				+ "=====================\n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s \n"
				+ "키 : %.2f \n"
				+ "몸무게 : %.2f \n", members[count].getUserName(), members[count].getUserId() ,members[count].getUserPW() , members[count].getUserBD() , members[count].getUserBt(), members[count].getHeight() , members[count].getWeight() );
		
		
		return msg;
	}
	/*
	1. 비번 변경
	*/
	public String update(MemberBean member) {
		String msg="";
		
		
		return msg;
	}
		
	/*
	4. 회원 탈퇴 
	*/
	public String withdrawal(MemberBean member) {
		String msg="회원탈퇴완료";
		
		
		return msg;
	}
	
	public String list() {
		String msg="";
		for (int i = 0; i < members.length; i++) {
			msg += members[i].toString()+"\n\n\n ";
		}
		
		return msg;
	}
	
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		
		for (int i = 0; i < members.length; i++) {
			if(id.equals(members[i].getUserId())) {
				member = members[i];
			}
		}
		
		return member;
	}

	public String getBMI(MemberBean member) {

		double yM= 0.0, BMI = 0.0;
		String eval= "";
		
		yM = member.getHeight()*0.01;
		BMI = member.getWeight() /(yM*yM);

		
		if(BMI<=18.5) {
			eval = "저체중";
		}else if(18.5<BMI&&BMI<=23.0) { 
			eval = "정상";
		}else if(23.0<BMI && BMI<=25.0) {
			eval = "과체중";
		}else if(25.0<BMI && BMI<=30.0) {
			eval = "비만";
		}else if(30.0<BMI) {
			eval = "고도비만";
		}

		String result = String.format("BMI는 %.2f로 %S입니다 ", BMI , eval);

		return result;

	}

	/*
	 * public String getReportCard(MemberBean mb) { String result = "";
	 * 
	 * int total =0, avg = 0 ; String eval= "";
	 * 
	 * int kor = mb.getKor(); int eng = mb.getEng(); int mat = mb.getMat();
	 * 
	 * total = (kor+eng+mat); avg = (kor+eng+mat) / 3;
	 * 
	 * if(avg < 70) { eval = "불합격"; }else if(70<=avg && avg <90 ) { eval = "합격";
	 * }else if (90<=avg ) { eval = "장학생"; }
	 * 
	 * result
	 * =" 학생           국어        영어        수학        총점        평균        합격여부\n";
	 * result += " =======================================================\n";
	 * result += String.
	 * format(" %s           %d         %d          %d          %d          %d         %s  \n"
	 * , mb.getUserName() , kor, eng, mat, total , avg, eval);
	 * 
	 * return result;
	 * 
	 * }
	 */

	/*
	 * public String getTax(MemberBean mb) {
	 * 
	 * double rate = mb.getRate(); double tax = mb.getSal() * (rate*0.01);
	 * 
	 * String result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.0f만원입니다.",
	 * mb.getSal(), mb.getUserName(), tax);
	 * 
	 * return result;
	 * 
	 * }
	 */

}
