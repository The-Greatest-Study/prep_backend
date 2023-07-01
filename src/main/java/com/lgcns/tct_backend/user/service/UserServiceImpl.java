package com.lgcns.tct_backend.user.service;

import com.lgcns.tct_backend.mzlist.repository.MzListRepository;
import com.lgcns.tct_backend.user.model.User;
import com.lgcns.tct_backend.user.model.UserMzListRes;
import com.lgcns.tct_backend.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    private final MzListRepository mzListRepository;

    @Override
    public User getUser(String userId) {
        return userRepository.selectUser(userId);
    }

    @Override
    public UserMzListRes getUserMzList(String userId) {
        return UserMzListRes.builder().userMzLists(mzListRepository.selectUserMzList(userId)).build();
    }
}
