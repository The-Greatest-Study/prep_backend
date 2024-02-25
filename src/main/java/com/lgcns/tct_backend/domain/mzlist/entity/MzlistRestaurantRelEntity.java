package com.lgcns.tct_backend.domain.mzlist.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "tb_mzlist_restaurant_rel")
public record MzlistRestaurantRelEntity(
    @Id String restaurantId,
    @Id String mzlistId,
    String restaurantMemo,
    String restaurantNickname)
{
}
