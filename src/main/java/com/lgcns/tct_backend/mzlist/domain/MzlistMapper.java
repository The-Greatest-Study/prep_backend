package com.lgcns.tct_backend.mzlist.domain;

import com.lgcns.tct_backend.mzlist.dto.MzlistDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MzlistMapper {

    MzlistDTO toDto(MzlistEntity mzListEntity);

    List<MzlistEntity> toEntity(List<MzlistDTO> mzlistDTO);

    MzlistEntity toEntity(MzlistDTO mzlistDTO);


}