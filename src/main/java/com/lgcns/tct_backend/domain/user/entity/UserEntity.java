package com.lgcns.tct_backend.domain.user.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_user")
public record UserEntity(

        @Id
        String userId,
        String userName,

        String nickname,
        String password,
        String userBirthday,
        String gender,
        String authorityCode,
        String useYn,

        //TODO: 사용법이 정확하지 않음
        @ManyToMany
        @JoinTable(name = "tb_user_mzlist_rel",
             joinColumns = @JoinColumn(name = "use_id"),
             inverseJoinColumns = @JoinColumn(name = "mzlist_id"))
        Set<UserMzlistRelEntity> restaurants
){}
