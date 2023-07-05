package com.lgcns.tct_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.tct_backend.model.MzList;

public interface MzListRepository extends JpaRepository<MzList, String>{
  List<MzList> findByUserId(String userId);
}
