package com.two.main.story;

import java.util.List;

public interface StoryMapper {

	public List<Story> storyAll();

	public int regStory(Story s);

	public Story getStory(Story s);

	public int delStory(Story s);

	public int updateStory(Story s);

}
