package com.lgcns.tct_backend.User.Model;

import java.util.List;

import com.lgcns.tct_backend.MzList.Model.MzListResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserMzListResponse {
    private String userId;
    private String userName;
    private List<MzListResponse> mzList;

    @Builder
    public UserMzListResponse(String userId, String userName, List<MzListResponse> mzList){
        this.userId = userId;
        this.userName = userName;
        this.mzList = mzList;
    }
}
