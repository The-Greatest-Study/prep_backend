package com.lgcns.tct_backend.mzlist.dto;

import com.lgcns.tct_backend.mzlist.domain.RestaurantDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class MzListDetailRes {
    private String mzListId;
    private List<RestaurantDTO> restaurantList;

    public void addRestaurant(RestaurantDTO restaurantDTO) {
        if(this.restaurantList == null) this.restaurantList = new ArrayList<>();

        this.restaurantList.add(restaurantDTO);
    }
}
