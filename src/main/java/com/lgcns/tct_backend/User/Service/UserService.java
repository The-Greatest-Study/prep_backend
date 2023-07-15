package com.lgcns.tct_backend.User.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lgcns.tct_backend.User.Model.User;
import com.lgcns.tct_backend.User.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor 
public class UserService {

    private final UserRepository userRepository;

    public User getUser(String userId){
        Optional<User> userOpt = Optional.ofNullable(userRepository.selectUser(userId));
        return userOpt.orElseThrow(() -> new IllegalArgumentException("wrong userId"));
    }
}
