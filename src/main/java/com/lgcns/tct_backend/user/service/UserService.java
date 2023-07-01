package com.lgcns.tct_backend.user.service;

import com.lgcns.tct_backend.user.model.User;
import com.lgcns.tct_backend.user.model.UserMzListRes;

public interface UserService {
    public User getUser(String userId);

    public UserMzListRes getUserMzList(String userId);
}
