package com.lgcns.tct_backend.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MzListDetailDTO {
  
  private String listId;

  private List<RestaurantDTO> restaurantList;
  
}
