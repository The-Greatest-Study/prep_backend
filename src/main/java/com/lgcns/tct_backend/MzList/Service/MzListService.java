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

    public List<MzList> getMzListByListId(String listId){
        List<MzList> mzList = mzListRepository.selectMzListByListId(listId);
        if(CollectionUtils.isEmpty(mzList)) throw new IllegalArgumentException("wrong listId");
        return mzList;
    }
}
