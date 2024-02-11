package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_RESTAURANT")
public record Restaurant (

     @Id
     String restaurantId,

     String restaurantName,

     String restaurantAddress,

     String restaurantCategory,

     String operationYn
){}
