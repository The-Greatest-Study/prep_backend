package com.lgcns.tct_backend.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MzListDetailResponseDTO {
  
  private String listId;

  private List<RestaurantDTO> restaurantList;
  
}
