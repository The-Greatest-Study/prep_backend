package com.lgcns.tct_backend.mzlist.service;

import com.lgcns.tct_backend.mzlist.domain.MzList;
import com.lgcns.tct_backend.mzlist.domain.MzListMapper;
import com.lgcns.tct_backend.mzlist.dto.MzListDTO;
import com.lgcns.tct_backend.mzlist.dto.MzListDetailRes;
import com.lgcns.tct_backend.mzlist.repository.MzListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class MzListService {
    private final MzListRepository repository;
    private final MzListMapper mapper;

    public List<MzList> getMzListByUser(String userId) {
        return repository.findByUserId(userId);
    }

    public MzListDetailRes getMzListDetailByUser(String userId, String mzListId) {
        MzList mzList = repository.findByUserIdAndMzListId(userId, mzListId)
                .orElseThrow();
        
    }
}
