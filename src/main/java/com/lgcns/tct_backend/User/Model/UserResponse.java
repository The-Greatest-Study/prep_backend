package com.lgcns.tct_backend.User.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private String userId;
    private String userName;

    @Builder
    public UserResponse(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }
}
