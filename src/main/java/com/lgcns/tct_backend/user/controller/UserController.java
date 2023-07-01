package com.lgcns.tct_backend.user.controller;

import com.lgcns.tct_backend.exception.RestException;
import com.lgcns.tct_backend.model.ErrorCode;
import com.lgcns.tct_backend.user.model.User;
import com.lgcns.tct_backend.user.model.UserMzListRes;
import com.lgcns.tct_backend.user.service.UserService;

import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.lgcns.tct_backend.util.UserUtility.isUserIdValid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(name = "userId") @NotBlank String userId) {
        if(!isUserIdValid(userId)){
            throw new RestException(ErrorCode.INVALID_REQUEST_URL);
        }
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @GetMapping("user/{userId}/list")
    public ResponseEntity<UserMzListRes> getUserMzList(@PathVariable(name = "userId") @NotBlank final String userId){
        if(!isUserIdValid(userId)){
            throw new RestException(ErrorCode.INVALID_REQUEST_URL);
        }
        return ResponseEntity.ok(userService.getUserMzList(userId));
    }
}
