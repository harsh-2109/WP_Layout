package com.example.recyclerviewwithviewpager.DataHolder;

public class StoryDataHolder {
    String storyUserName, storyTimeAgo;

    public StoryDataHolder(String storyUserName, String storyTimeAgo) {
        this.storyUserName = storyUserName;
        this.storyTimeAgo = storyTimeAgo;
    }

    public String getStoryUserName() {
        return storyUserName;
    }

    public void setStoryUserName(String storyUserName) {
        this.storyUserName = storyUserName;
    }

    public String getStoryTimeAgo() {
        return storyTimeAgo;
    }

    public void setStoryTimeAgo(String storyTimeAgo) {
        this.storyTimeAgo = storyTimeAgo;
    }
}
