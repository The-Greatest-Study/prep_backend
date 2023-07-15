package com.lgcns.tct_backend.MzList.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.MzList.Model.MzListResponse;
import com.lgcns.tct_backend.MzList.Model.MzListWithRestaurantsResponse;
import com.lgcns.tct_backend.MzList.Service.MzListService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/mzlist")
@RestController
public class MzListController {

    private final MzListService mzListService;

    @GetMapping("/{listId}")
    public ResponseEntity<MzListResponse> getMzListByListId(@PathVariable(name = "listId") String listId){
        return ResponseEntity.ok(mzListService.getMzListByListId(listId));
    }

    @GetMapping("/{listId}/restaurants")
    public ResponseEntity<MzListWithRestaurantsResponse> getMzListWithRestaurants(@PathVariable(name = "listId") String listId){
        return ResponseEntity.ok(mzListService.getMzListWithRestaurants(listId));
    }
}
