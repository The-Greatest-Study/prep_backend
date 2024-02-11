package com.lgcns.tct_backend.mzlist.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestaurantMapper {

    com.lgcns.tct_backend.mzlist.domain.RestaurantDTO toDto(RestaurantEntity entity);
}