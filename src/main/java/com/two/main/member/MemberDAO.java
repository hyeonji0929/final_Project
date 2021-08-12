package com.two.main.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDAO {
	
	@Autowired
	private SqlSession ss;

	public void login(Member m, HttpServletRequest req, HttpServletResponse res) {
		
		Member dbMember = ss.getMapper(MemberMapper.class).getMemberId(m);
		
		if (dbMember != null) {
			if (dbMember.getM_id().equals(m.getM_pw())) {
				req.setAttribute("r", "로그인 성공");
				req.getSession().setAttribute("loginMember", dbMember);
			} else {
				req.setAttribute("r", "PW오류");
			}
		} else {
			req.setAttribute("r", "미가입 회원");
		}

	}

	public boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		
		if (m != null) {
			req.setAttribute("loginPage", "member/loginSuccess.jsp");
			return true;
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			return false;
		}
		
	}

	public void logout(HttpServletRequest req, HttpServletResponse res) {
		req.getSession().setAttribute("loginMember", null);
	}
	
	
}
