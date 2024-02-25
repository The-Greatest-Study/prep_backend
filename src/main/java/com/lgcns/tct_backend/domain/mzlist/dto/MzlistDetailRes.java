package com.lgcns.tct_backend.domain.mzlist.dto;

import com.lgcns.tct_backend.domain.restraunt.dto.RestaurantDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
public class MzlistDetailRes {
    private String mzlistId;
    private List<RestaurantDTO> restaurantList;

    public void addRestaurant(RestaurantDTO restaurantDTO) {
        if(this.restaurantList == null) this.restaurantList = new ArrayList<>();

        this.restaurantList.add(restaurantDTO);
    }
}
