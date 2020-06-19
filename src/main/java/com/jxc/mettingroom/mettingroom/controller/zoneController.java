package com.jxc.mettingroom.mettingroom.controller;

import com.jxc.mettingroom.mettingroom.model.zone;
import com.jxc.mettingroom.mettingroom.service.zoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class zoneController {

    @Autowired
    private zoneService zoneService;

    private static final Logger logger = LoggerFactory.getLogger(com.jxc.mettingroom.mettingroom.controller.zoneController.class);

    /**
     * 查询所有的部门区域，在小程序前台供选择
     */
    @PostMapping(value = "/queryAllZone")
    public List<zone> queryAllZone(){
        List<zone> zoneList = new ArrayList<>();
        zoneList = zoneService.selectAllZone();
        List<String> list = new ArrayList<>();
        for(zone zone: zoneList){
            list.add(zone.getName());
        }
        return zoneList;
    }

}
