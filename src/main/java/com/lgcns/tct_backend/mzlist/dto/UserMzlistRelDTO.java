package com.lgcns.tct_backend.mzlist.dto;


import com.lgcns.tct_backend.mzlist.domain.UserMzlistRelEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserMzlistRelDTO{
    @Id private String userId;
    @Id private String mzlistId;
    private String mzlist_management_role;

    public static UserMzlistRelDTO from(MzlistDTO mzlist) {
        return UserMzlistRelDTO.builder().mzlistId(mzlist.getMzlistId()).userId(mzlist.getUserId()).mzlist_management_role("ADMIN").build();
    }
}
