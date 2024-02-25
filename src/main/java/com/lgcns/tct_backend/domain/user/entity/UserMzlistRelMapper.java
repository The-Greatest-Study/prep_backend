package com.lgcns.tct_backend.domain.user.entity;

import com.lgcns.tct_backend.domain.user.dto.UserMzlistRelDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMzlistRelMapper {

    UserMzlistRelEntity toEntity (UserMzlistRelDTO dto);
}