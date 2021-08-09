package com.two.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.two.main.member.MemberDAO;

@Controller
public class HomeController {
	
	@Autowired
	private MemberDAO mdao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}
	
}
