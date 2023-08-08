package com.lgcns.tct_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_RESTAURANT")
public class Restaurant {

  @Id
  @Column(name = "RESTAURANT_ID")
  private String restaurantId;

  @Column(name = "RESTAURANT_NAME")
  private String restaurantName;

  @Column(name = "RESTAURANT_ADDRESS")
  private String restaurantAddres;

  @Column(name = "RESTAURANT_CATEGORY")
  private String restaurantCategory;

  @Column(name = "OPERATION_YN")
  private String operationYn;
  
}