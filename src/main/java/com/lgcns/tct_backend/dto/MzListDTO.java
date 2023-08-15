package com.lgcns.tct_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MzListDTO {

  private String listId;

  private String userId;

  private String listName;

  private String createDate;
  
}
