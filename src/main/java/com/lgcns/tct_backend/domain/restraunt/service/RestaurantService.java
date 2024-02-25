package com.lgcns.tct_backend.domain.restraunt.service;

import com.lgcns.tct_backend.domain.restraunt.entity.RestaurantMapper;
import com.lgcns.tct_backend.domain.restraunt.dto.RestaurantDTO;
import com.lgcns.tct_backend.domain.restraunt.respoistory.RestaurantRepository;
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
