package com.lgcns.tct_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.tct_backend.model.MzList;
import com.lgcns.tct_backend.repository.MzListRepository;


@Service
public class MzListService {
  
  @Autowired
  private MzListRepository mzListRepository;

  public List<MzList> getMzListByUserId(String userId) {
    List<MzList> mzList = mzListRepository.findByUserId(userId);
    return mzList;
  }
}
