package com.lgcns.tct_backend.domain.restraunt.entity;

import com.lgcns.tct_backend.domain.restraunt.dto.RestaurantDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestaurantMapper {

    RestaurantDTO toDto(RestaurantEntity entity);
}