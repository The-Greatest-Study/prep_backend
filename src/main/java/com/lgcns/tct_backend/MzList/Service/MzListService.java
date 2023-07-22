package com.lgcns.tct_backend.MzList.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lgcns.tct_backend.MzList.Model.MzList;
import com.lgcns.tct_backend.MzList.Model.MzListResponse;
import com.lgcns.tct_backend.MzList.Model.MzListWithRestaurantsResponse;
import com.lgcns.tct_backend.MzList.Repository.MzListRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MzListService {

    private final MzListRepository mzListRepository;

    public MzListResponse getMzListByListId(String listId){
        Optional<MzList> mzListOpt = Optional.ofNullable(mzListRepository.selectMzListByListId(listId));

        if(mzListOpt.isEmpty()) throw new IllegalArgumentException("wrong listId");

        return MzListResponse.mzListModel().mzList(mzListOpt.get()).build();
    }

    public MzListWithRestaurantsResponse getMzListWithRestaurants(String listId){
        Optional<MzListWithRestaurantsResponse> mzListResOpt = Optional.ofNullable(mzListRepository.selectMzListWithRestaurants(listId));

        if(mzListResOpt.isEmpty()) throw new IllegalArgumentException("wrong listId");

        return mzListResOpt.get();
    }
}
