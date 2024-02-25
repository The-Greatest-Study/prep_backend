package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_mzlist")
public record MzlistEntity(

        @Id
        String mzlistId,
        String userId,

        String mzlistName,
        String mzListDescription,
        String mzListIcon,

        //TODO: 사용법이 정확하지 않음
        @ManyToMany
        @JoinTable(name = "tb_mzlist_restaurant_rel",
             joinColumns = @JoinColumn(name = "mzlist_id"),
             inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
        Set<MzlistRestaurantRelEntity> restaurants
){}
