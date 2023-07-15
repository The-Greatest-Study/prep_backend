package com.lgcns.tct_backend.MzList.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lgcns.tct_backend.MzList.Model.MzList;
import com.lgcns.tct_backend.MzList.Model.MzListResponse;
import com.lgcns.tct_backend.MzList.Repository.MzListRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MzListService {

    private final MzListRepository mzListRepository;

    public MzListResponse getMzListByListId(String listId){
        Optional<MzList> mzListOpt = Optional.ofNullable(mzListRepository.selectMzListByListId(listId));

        if(mzListOpt.isEmpty()) throw new IllegalArgumentException("wrong listId");

        return mzListOpt.get().toMzListResponse();
    }
}
