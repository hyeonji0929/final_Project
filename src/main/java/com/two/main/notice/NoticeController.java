package com.two.main.notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.two.main.member.MemberDAO;

@Controller
public class NoticeController {
	
	@Autowired
	private MemberDAO mdao;
	
	@Autowired
	private NoticeDAO ndao;
	
	@RequestMapping(value = "/notice.go", method = RequestMethod.GET)
	public String noticeGo(HttpServletRequest req) {
		
		ndao.noticeAll(req);
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "notice/notice.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/notice.reg.go", method = RequestMethod.GET)
	public String noticeRegGo(Notice n, HttpServletRequest req) {
		
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "notice/noticeReg.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/notice.reg.do", method = RequestMethod.POST)
	public String noticeRegDo(Notice n, HttpServletRequest req) {
		
		ndao.regNotice(n, req);
		ndao.noticeAll(req);
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "notice/notice.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/notice.detail", method = RequestMethod.GET)
	public String noticeDetail(Notice n, HttpServletRequest req) {
		
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "notice/noticeDetail.jsp");
		return "index";
	}

	
}
