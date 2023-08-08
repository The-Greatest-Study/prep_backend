package com.lgcns.tct_backend.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MzListController {

  @GetMapping("/mzlist/{mzListId}")
  public ResponseEntity<List<MzList>> getMzListByListId(@PathVariable String userId) {
    List<MzList> res = mzListService.getMzListByUserId(userId);
    return ResponseEntity.ok(res);
  }
  
}
