package com.lgcns.tct_backend.mzlist.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_MZ_LIST")
public record MzListEntity(

        @Id
        String listId,
        String userId,

        String listName,

        Date createDate,

        //TODO: 사용법이 정확하지 않음
        @ManyToMany
        @JoinTable(name = "TB_MZ_LIST_RESTAURANT_REL",
             joinColumns = @JoinColumn(name = "list_id"),
             inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
        Set<MzListRestaurantRelEntity> restaurants
){}
