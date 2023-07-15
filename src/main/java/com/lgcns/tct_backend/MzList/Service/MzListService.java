package com.lgcns.tct_backend.MzList.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lgcns.tct_backend.MzList.Model.MzList;
import com.lgcns.tct_backend.MzList.Repository.MzListRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MzListService {

    private final MzListRepository mzListRepository;

    public List<MzList> getMzListByUserId(String userId){
        List<MzList> mzList = mzListRepository.selectMzListByUserId(userId);
        if(CollectionUtils.isEmpty(mzList)) throw new IllegalArgumentException("wrong userId");
        return mzList;
    }
}
