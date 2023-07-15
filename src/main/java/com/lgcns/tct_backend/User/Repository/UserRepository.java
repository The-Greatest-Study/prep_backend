package com.lgcns.tct_backend.User.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.User.Model.User;
import com.lgcns.tct_backend.User.Model.UserMzListResponse;

@Mapper
public interface UserRepository {
    User selectUser(String userId);
    UserMzListResponse selectUserWithMzList(String userId);
}
