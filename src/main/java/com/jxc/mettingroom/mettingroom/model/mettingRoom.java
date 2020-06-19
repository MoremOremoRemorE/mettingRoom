package com.jxc.mettingroom.mettingroom.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class mettingRoom implements Serializable {

    /**
     * 会议室id，自增的
     */
    private int id;

    /**
     * 会议室名称
     */
    private String mettingRoomName;

    /**
     * 会议室当前所占时间段id
     */
    private int timerId;

    /**
     * 会议室当前状态，0表示未被预定，1表示被预定
     */
    private int status;

    /**
     * 会议室当前所属的部门区域
     */
    private String zoneId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMettingRoomName() {
        return mettingRoomName;
    }

    public void setMettingRoomName(String mettingRoomName) {
        this.mettingRoomName = mettingRoomName;
    }

    public int getTimerId() {
        return timerId;
    }

    public void setTimerId(int timerId) {
        this.timerId = timerId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
