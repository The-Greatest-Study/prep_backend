package com.lgcns.tct_backend.domain.restraunt.entity;

import com.lgcns.tct_backend.domain.mzlist.entity.MzlistEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "tb_restaurant")
public record RestaurantEntity(

     @Id
     String restaurantId,

     String restaurantName,

     String restaurantAddress,

     String restaurantCategory,

     String openStatus,

     @ManyToMany(mappedBy = "restaurants")
     Set<MzlistEntity> mzLists
){}
