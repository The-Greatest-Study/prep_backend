package com.lgcns.tct_backend.Restaurant.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RestaurantResponse {
    private String restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantCategory;
    private String operationYn;
}
