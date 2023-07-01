package com.lgcns.tct_backend.mzlist.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.mzlist.model.MzList;

@Mapper
public interface MzListRepository {
    List<MzList> selectUserMzList(String userId);
}
