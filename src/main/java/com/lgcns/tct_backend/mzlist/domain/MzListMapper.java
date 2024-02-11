package com.lgcns.tct_backend.mzlist.domain;

import com.lgcns.tct_backend.mzlist.dto.MzListDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MzListMapper {

    MzListDTO toDto(MzListEntity mzListEntity);
}