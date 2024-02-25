package com.lgcns.tct_backend.mzlist.service;

import com.lgcns.tct_backend.mzlist.domain.RestaurantMapper;
import com.lgcns.tct_backend.mzlist.dto.RestaurantDTO;
import com.lgcns.tct_backend.mzlist.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class RestaurantService {
    private final RestaurantRepository repository;
    private final RestaurantMapper mapper;

    public RestaurantDTO getRestaurantInfoById(String restaurantId){
        return mapper.toDto(repository.findById(restaurantId).orElseThrow());
    }

}
