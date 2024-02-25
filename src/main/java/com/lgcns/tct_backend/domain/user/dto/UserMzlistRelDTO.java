package com.lgcns.tct_backend.domain.user.dto;


import com.lgcns.tct_backend.domain.mzlist.dto.MzlistDTO;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserMzlistRelDTO{
    private String userId;
    private String mzlistId;
    private String mzlistManagementRole;

    public static UserMzlistRelDTO from(MzlistDTO mzlist) {
        return UserMzlistRelDTO.builder()
                .mzlistId(mzlist.getMzlistId())
                .userId(mzlist.getUserId())
                .mzlistManagementRole("ADMIN") //enum
                .build();
    }
}
