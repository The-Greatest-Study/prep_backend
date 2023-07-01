package com.lgcns.tct_backend.user.repository;

import org.apache.ibatis.annotations.Mapper;

import com.lgcns.tct_backend.user.model.User;

@Mapper
public interface UserRepository {
    User selectUser(String userId);
}
