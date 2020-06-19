package com.jxc.mettingroom.mettingroom.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class zone implements Serializable {

    /**
     * 部门区域id
     */
    private int id;

    /**
     * 部门区域名称
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
