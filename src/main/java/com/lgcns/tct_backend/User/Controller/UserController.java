package com.lgcns.tct_backend.User.Controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.User.Model.UserMzListResponse;
import com.lgcns.tct_backend.User.Model.UserResponse;
import com.lgcns.tct_backend.User.Service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController 
public class UserController {

    private final UserService service;
    
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUser(@PathVariable(name = "userId") String userId){
        //TODO verification 개선필요
        if(StringUtils.isBlank(userId)) new IllegalArgumentException("wrong userId");
        return ResponseEntity.ok(service.getUser(userId));
    }

    @GetMapping("/{userId}/list")
    public ResponseEntity<UserMzListResponse> getUserWithMzList(@PathVariable(name = "userId") String userId){
        //TODO verification 개선필요
        if(StringUtils.isBlank(userId)) new IllegalArgumentException("wrong userId");
        return ResponseEntity.ok(service.getUserWithMzList(userId));
    }
}
