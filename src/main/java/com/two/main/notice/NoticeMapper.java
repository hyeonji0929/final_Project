package com.two.main.notice;

import java.util.List;


public interface NoticeMapper {

	public List<Notice> noticeAll();

	public int regNotice(Notice n);

}
