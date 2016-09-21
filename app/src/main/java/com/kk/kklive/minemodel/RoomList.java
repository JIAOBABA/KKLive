package com.kk.kklive.minemodel;

/**
 * Created by Administrator on 2016/9/20.
 */
public class RoomList {

    private String userId;

    private String nickname;

    private String livestarttime;

    private String portrait_path_original;

    private String onlineCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLivestarttime() {
        return livestarttime;
    }

    public void setLivestarttime(String livestarttime) {
        this.livestarttime = livestarttime;
    }

    public String getPortrait_path_original() {
        return portrait_path_original;
    }

    public void setPortrait_path_original(String portrait_path_original) {
        this.portrait_path_original = portrait_path_original;
    }

    public String getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(String onlineCount) {
        this.onlineCount = onlineCount;
    }
}
