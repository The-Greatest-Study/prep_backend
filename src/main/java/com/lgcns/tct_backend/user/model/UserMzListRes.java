package com.lgcns.tct_backend.user.model;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import com.lgcns.tct_backend.mzlist.model.MzList;

@Getter
public class UserMzListRes {
    private String userId;
    private List<MzList> mzList;

    @Builder
    public UserMzListRes(List<MzList> userMzLists){
        boolean first = true;
        mzList = new ArrayList<>();
        for (MzList userMzList : userMzLists) {
            if(first){
                userId = userMzList.getUserId();
                first = false;
            }
            mzList.add(userMzList);
        }
    }
}
