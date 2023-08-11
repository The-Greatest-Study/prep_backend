package com.lgcns.tct_backend.model;

import java.util.List;

import org.mapstruct.Mapper;

import com.lgcns.tct_backend.dto.MzListDTO;

@Mapper
public interface MzListMapper {

  MzListDTO entityToDto(MzList mzList);

  List<MzListDTO> entityToDto(List<MzList> mzList);   
}
