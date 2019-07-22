package com.example.recyclerviewwithviewpager.DataHolder;

public class ChatDataHolder {
    String fName,mChat,mTime;

    public ChatDataHolder(String fName, String mChat, String mTime) {
        this.fName = fName;
        this.mChat = mChat;
        this.mTime = mTime;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmChat() {
        return mChat;
    }

    public void setmChat(String mChat) {
        this.mChat = mChat;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }
}
