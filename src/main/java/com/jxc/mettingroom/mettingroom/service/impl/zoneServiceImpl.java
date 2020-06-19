package com.jxc.mettingroom.mettingroom.service.impl;

import com.jxc.mettingroom.mettingroom.mapper.zoneMapper;
import com.jxc.mettingroom.mettingroom.model.zone;
import com.jxc.mettingroom.mettingroom.service.zoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class zoneServiceImpl implements zoneService {


    @Autowired
    private zoneMapper zoneMapper;
    @Override
    public List<zone> selectAllZone() {
        return zoneMapper.selectAllZone();
    }
}
