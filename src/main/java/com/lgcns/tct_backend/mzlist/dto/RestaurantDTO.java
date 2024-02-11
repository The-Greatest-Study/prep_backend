package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_RESTAURANT")
public class RestaurantDTO {

     @Id
     private String restaurantId;

     private String restaurantName;

     private String restaurantAddress;

     private String restaurantCategory;

     private String operationYn;
}
