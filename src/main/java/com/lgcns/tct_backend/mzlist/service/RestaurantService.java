package com.lgcns.tct_backend.mzlist.service;

import com.lgcns.tct_backend.mzlist.domain.MzListEntity;
import com.lgcns.tct_backend.mzlist.domain.MzListMapper;
import com.lgcns.tct_backend.mzlist.domain.RestaurantDTO;
import com.lgcns.tct_backend.mzlist.domain.RestaurantMapper;
import com.lgcns.tct_backend.mzlist.dto.MzListDetailRes;
import com.lgcns.tct_backend.mzlist.repository.MzListRepository;
import com.lgcns.tct_backend.mzlist.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository repository;
    private final RestaurantMapper mapper;

    public RestaurantDTO getRestaurantInfoById(String restaurantId){
        return mapper.toDto(repository.findById(restaurantId).orElseThrow());
    }

}
