package com.lgcns.tct_backend.mzlist.controller;

import com.lgcns.tct_backend.mzlist.domain.MzListEntity;
import com.lgcns.tct_backend.mzlist.dto.MzListDetailRes;
import com.lgcns.tct_backend.mzlist.service.MzListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mz")
public class MzListController {

    private final MzListService mzListService;

    @GetMapping("/list/{userId}")
    public ResponseEntity<List<MzListEntity>> getMzListByUser(@PathVariable String userId) {
        List<MzListEntity> mzListEntity = mzListService.getMzListByUser(userId);
        return ResponseEntity.ok(mzListEntity);
    }

    @GetMapping("/detail/{userId}")
    public ResponseEntity<MzListDetailRes> getMzListDetailByUser(@PathVariable String userId, @RequestParam String mzListId) {
        MzListDetailRes mzListDetailRes = mzListService.getMzListDetailByUser(userId, mzListId);
        return ResponseEntity.ok(mzListDetailRes);
    }


}
