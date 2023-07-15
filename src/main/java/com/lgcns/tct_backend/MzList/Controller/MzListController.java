package com.lgcns.tct_backend.MzList.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.tct_backend.MzList.Model.MzList;
import com.lgcns.tct_backend.MzList.Service.MzListService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/mzlist")
@RestController
public class MzListController {

    private final MzListService mzListService;

    @GetMapping("/{userId}")
    public List<MzList> getMzListByUserId(@PathVariable(name = "userId") String userId){
        return mzListService.getMzListByUserId(userId);
    }
}
