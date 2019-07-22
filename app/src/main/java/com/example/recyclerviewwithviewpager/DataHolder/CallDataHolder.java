package com.example.recyclerviewwithviewpager.DataHolder;

public class CallDataHolder {
    String callerName,callingTime;

    public CallDataHolder(String callerName, String callingTime) {
        this.callerName = callerName;
        this.callingTime = callingTime;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getCallingTime() {
        return callingTime;
    }

    public void setCallingTime(String callingTime) {
        this.callingTime = callingTime;
    }
}
