package com.lgcns.tct_backend.MzList.Model;

import java.util.List;

import com.lgcns.tct_backend.Restaurant.Model.RestaurantResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MzListWithRestaurantsResponse {
    private String listId;
    private String listName;
    private List<RestaurantResponse> restaurants;
}
