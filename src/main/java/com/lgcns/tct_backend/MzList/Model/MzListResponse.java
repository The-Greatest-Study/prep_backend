package com.lgcns.tct_backend.MzList.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MzListResponse {
    private String listId;
    private String listName;

    @Builder
    public MzListResponse(String listId, String listName){
        this.listId = listId;
        this.listName = listName;
    }
}
