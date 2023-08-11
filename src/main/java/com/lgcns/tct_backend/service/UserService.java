package com.lgcns.tct_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.tct_backend.dto.MzListDTO;
import com.lgcns.tct_backend.model.MzList;
import com.lgcns.tct_backend.model.MzListMapper;
import com.lgcns.tct_backend.repository.MzListRepository;


@Service
public class UserService {
  
  @Autowired
  private MzListRepository mzListRepository;

  @Autowired
  private MzListMapper mzListMapper;

  public List<MzListDTO> getMzListByUserId(String userId) {
    List<MzList> mzList = mzListRepository.findByUserId(userId);
    return mzListMapper.entityToDto(mzList);
  }
  
}
