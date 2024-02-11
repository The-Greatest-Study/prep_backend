package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "TB_RESTAURANT")
public record RestaurantEntity(

     @Id
     String restaurantId,

     String restaurantName,

     String restaurantAddress,

     String restaurantCategory,

     String operationYn,

     @ManyToMany(mappedBy = "restaurants")
     Set<MzListEntity> mzLists
){}
