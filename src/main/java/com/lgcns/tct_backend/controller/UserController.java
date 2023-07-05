package com.lgcns.tct_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgcns.tct_backend.model.MzList;
import com.lgcns.tct_backend.service.MzListService;


@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private MzListService mzListService;

  @GetMapping("/{userId}/list")
  public ResponseEntity<List<MzList>> getMzListByUserId(@PathVariable String userId) {
    List<MzList> res = mzListService.getMzListByUserId(userId);
    return ResponseEntity.ok(res);
  }
  
}
