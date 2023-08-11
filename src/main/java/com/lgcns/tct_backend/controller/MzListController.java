package com.lgcns.tct_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.model.MzList;
import com.lgcns.tct_backend.service.MzListService;
import com.lgcns.tct_backend.service.UserService;

@RestController
public class MzListController {

  @Autowired
  UserService userService;

  @GetMapping("/mzlist/{mzListId}")
  public ResponseEntity<List<MzList>> getMzListByListId(@PathVariable String listId) {
    List<MzList> res = userService.getMzListDetailByListId(listId);
    return ResponseEntity.ok(res);
  }
  
}
