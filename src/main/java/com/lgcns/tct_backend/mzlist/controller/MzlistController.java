package com.lgcns.tct_backend.mzlist.controller;

import com.lgcns.tct_backend.mzlist.domain.MzlistEntity;
import com.lgcns.tct_backend.mzlist.dto.MzlistDetailRes;
import com.lgcns.tct_backend.mzlist.service.MzlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mz")
public class MzlistController {

    private final MzlistService mzListService;

    @GetMapping("/list/{userId}")
    public ResponseEntity<List<MzlistEntity>> getMzlistByUser(@PathVariable String userId) {
        List<MzlistEntity> mzListEntity = mzListService.getMzlistByUser(userId);
        return ResponseEntity.ok(mzListEntity);
    }

    @GetMapping("/detail/{userId}")
    public ResponseEntity<MzlistDetailRes> getMzlistDetailByUser(@PathVariable String userId, @RequestParam String mzlistId) {
        MzlistDetailRes mzlistDetailRes = mzListService.getMzlistDetailByUser(userId, mzlistId);
        return ResponseEntity.ok(mzlistDetailRes);
    }


}
