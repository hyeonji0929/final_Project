package com.two.main.story;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.two.main.member.MemberDAO;

@Controller
public class StoryController {
	
	@Autowired
	private MemberDAO mdao;
	
	@Autowired
	private StoryDAO sdao;
	
	@RequestMapping(value = "/story.go", method = RequestMethod.GET)
	public String storyGo(HttpServletRequest req) {
		
		mdao.loginCheck(req);
		sdao.storyAll(req);
		req.setAttribute("contentPage", "story/story.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/story.reg.go", method = RequestMethod.GET)
	public String storyRegGo(HttpServletRequest req) {
		
		mdao.loginCheck(req);
		req.setAttribute("contentPage", "story/storyReg.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/story.reg.do", method = RequestMethod.POST)
	public String storyRegDo(Story s, HttpServletRequest req) {
		
		mdao.loginCheck(req);
		sdao.regStory(s, req);
		sdao.storyAll(req);
		req.setAttribute("contentPage", "story/story.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/story.detail", method = RequestMethod.GET)
	public String storyDetail(Story s, HttpServletRequest req) {
		
		mdao.loginCheck(req);
		sdao.getStory(s, req);
		req.setAttribute("contentPage", "story/storyDetail.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/story.del", method = RequestMethod.GET)
	public String storyDel(Story s, HttpServletRequest req) {
		
		if(mdao.loginCheck(req)) {
			sdao.delStory(s, req);
			sdao.storyAll(req);
			req.setAttribute("contentPage", "story/story.jsp");
		} else {
			req.setAttribute("contentPage", "home.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/goUpdateStory", method = RequestMethod.GET)
	public String storyUpdateGo(Story s, HttpServletRequest req) {
		
		if(mdao.loginCheck(req)) {
			sdao.getStory(s, req);
			req.setAttribute("contentPage", "story/storyUpdate.jsp");
		} else {
			sdao.storyAll(req);
			req.setAttribute("contentPage", "story/story.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/story.update.do", method = RequestMethod.POST)
	public String storyUpdate(HttpServletRequest req) {
		if (mdao.loginCheck(req)) {
			sdao.updateNotice(req);
		}
		req.setAttribute("contentPage", "story/storyDetail.jsp");
		return "index";
	}
	
}
