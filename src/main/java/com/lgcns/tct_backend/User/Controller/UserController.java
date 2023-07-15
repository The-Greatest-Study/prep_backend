package com.lgcns.tct_backend.User.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.User.Model.User;
import com.lgcns.tct_backend.User.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor 
public class UserController {

    private final UserService service;
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(name = "userId") String userId){
        return ResponseEntity.ok(service.getUser(userId));
    }
}
