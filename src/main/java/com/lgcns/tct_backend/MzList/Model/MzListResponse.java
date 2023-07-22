package com.lgcns.tct_backend.MzList.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MzListResponse {
    private String listId;
    private String listName;

    public MzListResponse(String listId, String listName){
        this.listId = listId;
        this.listName = listName;
    }
    
    @Builder(builderMethodName = "mzListModel", builderClassName = "MzListModel")
    public MzListResponse(MzList mzList){
        this.listId = mzList.getListId();
        this.listName = mzList.getListName();
    }
}
