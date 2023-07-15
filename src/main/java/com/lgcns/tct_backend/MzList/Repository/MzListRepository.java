package com.lgcns.tct_backend.MzList.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.MzList.Model.MzList;
import com.lgcns.tct_backend.MzList.Model.MzListWithRestaurantsResponse;

@Mapper
public interface MzListRepository {
    MzList selectMzListByListId(String listId);
    MzListWithRestaurantsResponse selectMzListWithRestaurants(String listId);
}
