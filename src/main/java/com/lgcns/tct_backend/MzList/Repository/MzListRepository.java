package com.lgcns.tct_backend.MzList.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.MzList.Model.MzList;

@Mapper
public interface MzListRepository {
    MzList selectMzListByListId(String listId);
}
