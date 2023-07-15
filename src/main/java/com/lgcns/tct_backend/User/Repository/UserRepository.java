package com.lgcns.tct_backend.User.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.User.Model.User;

@Mapper
public interface UserRepository {
    User selectUser(String userId);
}
