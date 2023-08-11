package com.lgcns.tct_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgcns.tct_backend.dto.MzListDTO;
import com.lgcns.tct_backend.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/{userId}/list")
  public ResponseEntity<List<MzListDTO>> getMzListByUserId(@PathVariable String userId) {
    List<MzListDTO> res = userService.getMzListByUserId(userId);
    return ResponseEntity.ok(res);
  }
  
}
