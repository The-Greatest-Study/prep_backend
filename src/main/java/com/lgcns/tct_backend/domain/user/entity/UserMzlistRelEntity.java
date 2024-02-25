package com.lgcns.tct_backend.domain.user.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "tb_user_mzlist_rel")
public record UserMzlistRelEntity(
    @Id String userId,
    @Id String mzlistId,
    String mzlist_management_role)
{
}
