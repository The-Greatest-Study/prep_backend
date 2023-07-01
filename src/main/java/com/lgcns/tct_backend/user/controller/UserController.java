package com.lgcns.tct_backend.user.controller;

import com.lgcns.tct_backend.user.model.User;
import com.lgcns.tct_backend.user.model.UserMzListRes;
import com.lgcns.tct_backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(name = "userId") String userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @GetMapping("user/{userId}/list")
    public ResponseEntity<UserMzListRes> getUserMzList(@PathVariable(name = "userId") String userId){
        return ResponseEntity.ok(userService.getUserMzList(userId));
    }
}
