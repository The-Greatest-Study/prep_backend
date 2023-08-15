package com.lgcns.tct_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.dto.MzListDetailResponseDTO;
import com.lgcns.tct_backend.service.MzListService;


@RestController
public class MzListController {

  @Autowired
  MzListService mzListService;

  @GetMapping("/mzlist/{listId}")
  public ResponseEntity<MzListDetailResponseDTO> getMzListByListId(@PathVariable String listId) {
    MzListDetailResponseDTO res = mzListService.getMzListDetailByListId(listId);
    return ResponseEntity.ok(res);
  }
  
}
