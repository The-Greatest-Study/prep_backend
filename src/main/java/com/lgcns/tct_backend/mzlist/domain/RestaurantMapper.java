package com.lgcns.tct_backend.mzlist.domain;

import com.lgcns.tct_backend.mzlist.dto.RestaurantDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestaurantMapper {

    RestaurantDTO toDto(RestaurantEntity entity);
}