package com.jxc.mettingroom.mettingroom.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class timer implements Serializable {

    /**
     * 时间段id
     */
    private int id;

    /**
     * 时间段描述
     */
    private String time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
