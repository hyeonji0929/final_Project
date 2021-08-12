package com.two.main.story;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.two.main.member.Member;
import com.two.main.notice.Notice;
import com.two.main.notice.NoticeMapper;

@Service
public class StoryDAO {

	@Autowired
	private SqlSession ss;
	
	public void storyAll(HttpServletRequest req) {
		List<Story> stories = ss.getMapper(StoryMapper.class).storyAll();
		req.setAttribute("stories", stories);
	}

	public void regStory(Story s, HttpServletRequest req) {
		
		MultipartRequest mr = null;
		String path = req.getSession().getServletContext().getRealPath("resources/img");

		try {
			mr = new MultipartRequest(req, path, 31457280, "utf-8", new DefaultFileRenamePolicy());
			System.out.println(path);
			
			Member m = (Member) req.getSession().getAttribute("loginMember");
			
			String s_title = mr.getParameter("s_title");
			String s_content = mr.getParameter("s_content");
			String s_photo = mr.getFilesystemName("s_photo");
			System.err.println(s_photo);
			
			s.setS_id(m.getM_id());
			s.setS_title(s_title);
			s.setS_content(s_content);
			s.setS_photo(s_photo);
			
			if(ss.getMapper(StoryMapper.class).regStory(s) == 1) {
				req.setAttribute("r", "등록 성공");
			} else {
				req.setAttribute("r", "등록 실패");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}

	public Story getStory(Story s, HttpServletRequest req) {
		Story story = ss.getMapper(StoryMapper.class).getStory(s);
		req.setAttribute("st", story);
		return story;
		
	}

	public void delStory(Story s, HttpServletRequest req) {
		ss.getMapper(StoryMapper.class).delStory(s);
		
	}

	public void updateNotice(HttpServletRequest req) {
		String path = req.getSession().getServletContext().getRealPath("resources/img");
		System.out.println(path);
		MultipartRequest mr = null;
		Story s = new Story();
		
		try {
			mr = new MultipartRequest(req, path, 31457280, "utf-8", new DefaultFileRenamePolicy());
			BigDecimal s_no = new BigDecimal(mr.getParameter("s_no"));
			s.setS_no(s_no);
			s = getStory(s, req);
			String oldFile = s.getS_photo();
			
			String newFile = mr.getFilesystemName("s_photo");
			
			String s_title = mr.getParameter("s_title");
			String s_content = mr.getParameter("s_content");
			
			if (newFile == null) {
				newFile = oldFile;
			} else { 
			}
			
			s.setS_title(s_title);
			s.setS_content(s_content);
			s.setS_photo(newFile);
			
			if(ss.getMapper(StoryMapper.class).updateStory(s) == 1) {
				req.setAttribute("r", "수정 성공");
				
				if(!oldFile.equals(newFile)) {
					new File(path + "/" + oldFile).delete();
				}
				
			} else {
				req.setAttribute("r", "수정 실패");
				
				if(!oldFile.equals(newFile)) {
					new File(path + "/" + newFile).delete();
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			req.setAttribute("r", "수정 실패");
		}
		
		
	}

}
