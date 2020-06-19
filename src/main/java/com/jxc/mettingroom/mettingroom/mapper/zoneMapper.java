package com.jxc.mettingroom.mettingroom.mapper;

import com.jxc.mettingroom.mettingroom.model.zone;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface zoneMapper {
    List<zone> selectAllZone();

}
