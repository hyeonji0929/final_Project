package com.two.main.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO mdao;
	
	@RequestMapping(value = "/member.login", method = RequestMethod.POST)
	public String login(Member m, HttpServletRequest req, HttpServletResponse res) {
		
		mdao.login(m, req, res);
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/member.logout", method = RequestMethod.GET)
	public String logout(Member m, HttpServletRequest req, HttpServletResponse res) {
		
		mdao.logout(req, res);
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}

	
}
