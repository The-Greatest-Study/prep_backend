package com.lgcns.tct_backend.User.Model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserResponse {
    private String userId;
    private String userName;

    @Builder
    public UserResponse(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    @Builder(builderClassName = "UserModel", builderMethodName = "userModel")
    public UserResponse(User user){
        this.userId = user.getUserId();
        this.userName = user.getUserName();
    }
}
