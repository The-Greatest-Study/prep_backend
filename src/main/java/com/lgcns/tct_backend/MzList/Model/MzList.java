package com.lgcns.tct_backend.MzList.Model;

import lombok.Getter;

@Getter
public class MzList {
    private String listId;
    private String userId;
    private String listName;
    private String createdDate;

    public MzListResponse toMzListResponse(){
        return MzListResponse.builder()
                            .listId(this.listId)
                            .listName(this.listName)
                            .build();
    }
}
