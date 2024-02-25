package com.lgcns.tct_backend.mzlist.domain;

import com.lgcns.tct_backend.mzlist.dto.RestaurantDTO;
import com.lgcns.tct_backend.mzlist.dto.UserMzlistRelDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMzlistRelMapper {

    UserMzlistRelEntity toEntity (UserMzlistRelDTO dto);
}