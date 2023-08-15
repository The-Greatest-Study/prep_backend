package com.lgcns.tct_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

  private String restaurantId;

  private String restaurantName;

  private String restaurantAddress;

  private String restaurantCategory;
  
}
