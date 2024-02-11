package com.lgcns.tct_backend.mzlist.service;

import com.lgcns.tct_backend.mzlist.domain.MzListEntity;
import com.lgcns.tct_backend.mzlist.domain.MzListMapper;
import com.lgcns.tct_backend.mzlist.domain.RestaurantDTO;
import com.lgcns.tct_backend.mzlist.dto.MzListDetailRes;
import com.lgcns.tct_backend.mzlist.repository.MzListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class MzListService {
    private final MzListRepository repository;
    private final MzListMapper mapper;
    private final RestaurantService restaurantService;

    public List<MzListEntity> getMzListByUser(String userId) {
        return repository.findByUserId(userId);
    }

    public MzListDetailRes getMzListDetailByUser(String userId, String mzListId) {

        MzListDetailRes res = MzListDetailRes.builder()
                .mzListId(mzListId)
                .build();

        MzListEntity mzList = repository.findByUserIdAndMzListId(userId, mzListId)
                .orElseThrow(() -> new RuntimeException("MzList not found"));

        if (mzList.restaurants() != null) {
            mzList.restaurants().stream()
                    .map(e -> restaurantService.getRestaurantInfoById(e.restaurantId()))
                    .forEach(res::addRestaurant);
        }

        return res;
    }
}
