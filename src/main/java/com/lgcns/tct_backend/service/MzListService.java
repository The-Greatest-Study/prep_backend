package com.lgcns.tct_backend.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.tct_backend.dto.MzListDetailResponseDTO;
import com.lgcns.tct_backend.dto.RestaurantDTO;
import com.lgcns.tct_backend.model.MzList;
import com.lgcns.tct_backend.model.MzListRestaurantRel;
import com.lgcns.tct_backend.model.Restaurant;
import com.lgcns.tct_backend.repository.MzListRepository;
import com.lgcns.tct_backend.repository.MzListRestaurantRelRepository;
import com.lgcns.tct_backend.repository.RestaurantRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class MzListService {

  @Autowired
  private MzListRestaurantRelRepository mzListRestaurantRelRepository;

  @Autowired
  private RestaurantRepository restaurantRepository;
  
  private final ModelMapper modelMapper;

  MzListService(ModelMapper modelMapper) {
      this.modelMapper = modelMapper;
  }

  public MzListDetailResponseDTO getMzListDetailByListId(String listId) {
    List<MzListRestaurantRel> relList = mzListRestaurantRelRepository.findByListId(listId);
    List<RestaurantDTO> restaurantList = relList.stream()
      .map(entity -> modelMapper.map(restaurantRepository.findById(entity.getRestaurantId()).get(),RestaurantDTO.class))
      .collect(Collectors.toList());

    return MzListDetailResponseDTO.builder()
            .listId(listId)
            .restaurantList(restaurantList)
            .build();
  }
}
