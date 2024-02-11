package com.lgcns.tct_backend.mzlist.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record MzListRestaurantRelEntity(

    @Id String restaurantListRelId,
    String restaurantId,
    String listId)
{
}
